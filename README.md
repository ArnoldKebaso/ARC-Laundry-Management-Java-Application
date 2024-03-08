Here is the script for the MySql 
create database project; 
Use project;


#Manager Table

create table Manager(
M_ID int(10) not null auto_increment unique,
M_Name varchar(50) not null,
M_NIC varchar(10) not null primary key,
M_Password varchar(30) not null

);


#Employee Table

create table Employee(
E_ID int(10) not null auto_increment unique,
E_FullName varchar(100) not null,
E_Gender varchar(10) not null,
E_Address varchar(100) not null,
E_NIC varchar(10) not null,
E_Designation varchar(15) not null,
E_DOB varchar(12) not null,
E_BasicSalary varchar(10) not null,
E_Password varchar(300) not null,
M_ID int(10) not null default 1,
constraint E_NIC_PK primary key(E_NIC),
constraint M_ID_FK foreign key (M_ID) references Manager(M_ID) ON DELETE CASCADE ON UPDATE CASCADE
);

#Customer Table
 
create table Customer(
C_ID int(10) not null auto_increment unique,
C_FullName varchar(100) not null,
C_Gender varchar(10) not null,
C_Address varchar(100) not null,
C_NIC varchar(10) not null,
C_Phone varchar(15) not null,
C_Password varchar(300) not null,
constraint C_NIC_PK primary key(C_NIC)

);

#Order Table

create table LaundryOrder(
O_ID int(10) not null auto_increment unique,
O_Weight varchar(10) not null,
O_Date varchar(15) not null,
O_Payment varchar(15) not null,
C_NIC varchar(15) not null,
E_NIC varchar(15) not null,

constraint O_ID_PK primary key(O_ID),
constraint C_NIC_FK foreign key (C_NIC) references Customer(C_NIC) ON DELETE CASCADE ON UPDATE CASCADE,
constraint E_NIC_FK foreign key (E_NIC) references Employee(E_NIC) ON DELETE CASCADE ON UPDATE CASCADE
);
