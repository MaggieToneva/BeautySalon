create database `salon`;

create table role(
    ID INT AUTO_INCREMENT PRIMARY KEY,
    roleName varchar(10)
);

create table user(
    ID INT AUTO_INCREMENT PRIMARY KEY,
    name varchar(50),
    email varchar(20),
    password varchar(20),
    phone_number varchar(10),
    roleID int,
    FOREIGN KEY (roleID) REFERENCES role(ID)
);

create table category(
    ID INT AUTO_INCREMENT PRIMARY KEY,
    categoryName varchar(10)
);

create table `procedure`(
    ID INT AUTO_INCREMENT PRIMARY KEY,
    procedureName varchar(20),
    categoryID int,
    price double,
    FOREIGN KEY (categoryID) REFERENCES cateogory(ID)
);

create table reservation(
	ID INT AUTO_INCREMENT PRIMARY KEY,
	date TIMESTAMP,
	procedureID int,
	userID INT,
	FOREIGN KEY (userID) REFERENCES user(ID),
        FOREIGN KEY (procedureID) REFERENCES procedure(ID)
);
