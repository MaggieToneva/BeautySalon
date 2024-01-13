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
    FOREIGN KEY (roleID) REFERENCES role(roleID)
);

create table category(
    ID INT AUTO_INCREMENT PRIMARY KEY,
    categoryName varchar(10)
);

create table type(
    ID INT AUTO_INCREMENT PRIMARY KEY,
    typeName varchar(10)
);

create table procedure(
	ID INT AUTO_INCREMENT PRIMARY KEY,
	procedureName varchar(20),
	date TIMESTAMP,
	price double,
	userID INT,
	FOREIGN KEY (userID) REFERENCES user(ID)
);
