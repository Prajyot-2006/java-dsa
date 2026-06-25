create database college;
use college;
create table students (
	id int primary key,
    name varchar(50),
    city varchar(50),
    marks int);

INSERT INTO students(id, name, city, marks)
VALUES
(1, 'Ichigo', 'Mumbai', 95),
(2, 'Rukia', 'Pune', 92),
(3, 'Orihime', 'Delhi', 88),
(4, 'Uryu', 'Bengaluru', 91),
(5, 'Chad', 'Hyderabad', 85),
(6, 'Renji', 'Chennai', 89),
(7, 'Byakuya', 'Kolkata', 97),
(8, 'Toshiro', 'Nagpur', 94),
(9, 'Kenpachi', 'Jaipur', 82),
(10, 'Aizen', 'Ahmedabad', 99);

select city, avg(marks) from students 
group by city
order by avg(marks);