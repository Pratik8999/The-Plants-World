create table user_administration(
user_id varchar(20) primary key,
user_name varchar(40)  not null,
user_contact varchar(15)  not null,
user_password varchar(20)  not null,
authorised_by varchar(10)  not null,
user_creation_time varchar(15)  not null,
last_password varchar(20)  not null,
changed_count varchar(10)  not null);