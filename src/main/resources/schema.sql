DROP TABLE Customer;

create table Customer
(
 customer_Id NUMBER not null,
 f_Name varchar(255),
 l_Name varchar(255),
 account_Type varchar(2),
 account_Balance varchar(255),
 primary key(customer_Id)
);
