DROP TABLE Customer;

create table Customer
(
 customerId integer not null,
 fName varchar(255),
 lName varchar(255),
 accountType varchar(2),
 accountBalance varchar(255),
 primary key(customerId)
);
