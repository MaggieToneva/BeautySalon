/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.smg.beautySalon.services;

import bg.smg.beautySalon.model.Category;
import bg.smg.beautySalon.util.DBManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author smgBA8F
 */
public class CategoryService {
    private DataSource dataSource;
    private Connection connection;

    public CategoryService() throws SQLException {
        dataSource = DBManager.getInstance().getDataSource();
    }
    
    public List<Category> getCategories() throws SQLException {
        try {
            List<Category> categories = new ArrayList<>();
            this.connection = dataSource.getConnection();
            try (PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM category")) {
                
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    Category category = new Category();
                    category.setCategoryName(resultSet.getString("categoryName"));
                    category.setID(resultSet.getInt("ID"));
                    categories.add(category);
                
                }
             
                return categories;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (connection != null) {
                System.out.println("Closing database connection...");
                connection.close();
                System.out.println("Connection valid: " + connection.isValid(5));
            }
        }
        return null;
    }
    

}
