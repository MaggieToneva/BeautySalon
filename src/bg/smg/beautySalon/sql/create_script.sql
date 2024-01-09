create database `salon`;

create table role(
    roleID INT AUTO_INCREMENT PRIMARY KEY,
    roleName varchar(10)
);

create table user(
    userID INT AUTO_INCREMENT PRIMARY KEY,
    name varchar(50),
    email varchar(20),
    password varchar(20),
    phone_number varchar(10),
    roleID int,
    FOREIGN KEY (roleID) REFERENCES role(roleID)
);

create table category(
    categoryID INT AUTO_INCREMENT PRIMARY KEY,
    categoryName varchar(10)
);

create table type(
    typeID INT AUTO_INCREMENT PRIMARY KEY,
    typeName varchar(10)
);
