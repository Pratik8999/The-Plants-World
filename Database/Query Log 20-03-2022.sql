use `the_plants_world`;

select * from user_administration;

# Seasonal Or Not 

create table plants(
Pid varchar(200) primary key, 
Pname varchar(50) ,
ScientificName varchar(50),
 PType varchar(50), 
 PCategory varchar(50), 
 PPrice varchar(10.2),
 PCount varchar(50),
 PArrivalDate varchar(50),
 ratings varchar(5)
);

desc plants;