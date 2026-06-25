create database college;  -- this creates a database named college
use college;  -- where u have to add data ? u must write this before adding data into any database
create table student (    -- this creates a table named student with 4 columns id , name , city , marks
    id int primary key,
    name varchar(50),
    city varchar(50),
    marks int
);

insert into student(id, name, city, marks)  -- this adds values into columns 
values
(1, 'Ichigo', 'Mumbai', 95),  -- write in appropriate form id, name, city, marks
(2, 'Rukia', 'Pune', 92),
(3, 'Orihime', 'Delhi', 88),
(4, 'Uryu', 'Bengaluru', 91),
(5, 'Chad', 'Hyderabad', 85),
(6, 'Renji', 'Chennai', 89),
(7, 'Byakuya', 'Kolkata', 97),
(8, 'Toshiro', 'Nagpur', 94),
(9, 'Kenpachi', 'Jaipur', 82),
(10, 'Aizen', 'Ahmedabad', 99);

-- for dropping database 
drop database  college;  -- note: dont run this command this will delete the database 

select * from student;  -- this prints student table  * means all