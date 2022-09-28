create database library;

use library;

create table books(
id int primary key auto_increment,
name varchar(50) not null,
author varchar(50),
publisher varchar(255),
quantity int
);

create table student(
id int primary key auto_increment,
name varchar(50) not null,
mobile varchar(255)
);

create table librarian(
id int primary key auto_increment,
name varchar(50) not null,
email varchar(50) not null,
password varchar(50) not null,
mobile varchar(255)
);

create table admin(
email varchar(50) not null,
password varchar(50) not null
);
