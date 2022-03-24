use `the_plants_world`;

desc user_administration;

select * from user_administration where user_name="SHafi";

ALTER TABLE `user_administration` change `user_con` `user_password`varchar(15);

alter table `user_administration` change `user_password` `user_password`varchar(1000);

alter table `user_administration` change `user_creation_time` `user_creation_time`varchar(100);

alter table `sales_product` change `price` `price`varchar(255) default null;
desc sales;
show tables;

desc sales;

select * from user_administration;

truncate sales;


select * from user_administration;

select * from sale;


#ALTER TABLE "table_name" Change "column 1" "column 2" ["Data Type"];

select * from customer_issue;

alter table customer_issue change `c_amt` `c_issue`varchar(200) not null;

alter table customer_receive change `c_amt` `c_issue`varchar(200) not null;

select * from customer_receive;

select * from customer_issue;

desc customer_receive;

drop table dstock;

select * from stock;

truncate stock;

truncate customer_receive;

select * from sales;

select * from sales_product;

alter table sales_product change `bal` `total`int not null;