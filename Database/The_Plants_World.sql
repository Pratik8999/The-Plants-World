create table user_administration(
user_id varchar(20) primary key,
user_name varchar(40)  not null,
user_password varchar(20)  not null,
user_contact varchar(15)  not null,
user_role varchar(15) not null,
authorized_by varchar(15)  not null,
user_creation_time varchar(100)  not null,
last_password varchar(1000)  default 'None',
pass_changed_count varchar(10)  default '0',
last_token varchar(10000) default 'To be Generated',
user_status varchar(10) not null);


CREATE table sales(
id int primary key auto_increment,
subtotal varchar(255) not null,
pay varchar(255)default null,
bal int default null);

CREATE table sales_product(
id int primary key auto_increment,
sales_id int default null,
pname varchar(255) default null,
price varchar(255) default null,
qty varchar(255)default null,
bal int default null);

CREATE TABLE `stock` (
  `ID` int DEFAULT NULL,
  `p_name` varchar(100) DEFAULT NULL,
  `p_categary` varchar(100) DEFAULT NULL,
   `p_price` varchar(100) DEFAULT NULL,
  `p_qty` int DEFAULT NULL
) ;



drop table user_administration;