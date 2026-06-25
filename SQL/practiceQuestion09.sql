
use college;
select * from student;
drop table student;
CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    city VARCHAR(50),
    marks INT,
    grade VARCHAR(5)
);

INSERT INTO student(id, name, city, marks, grade)
VALUES
(1, 'Ichigo', 'Mumbai', 95, 'A'),
(2, 'Rukia', 'Pune', 92, 'C'),
(3, 'Orihime', 'Delhi', 88, 'B'),
(4, 'Rukia', 'Bengaluru', 91, 'C'),
(5, 'Chad', 'Hyderabad', 85, 'B'),
(6, 'Renji', 'Chennai', 89, 'C'),
(7, 'Byakuya', 'Kolkata', 97, 'F'),
(8, 'Toshiro', 'Pune', 94, 'D');

select * from student;

select grade, count(id) from student
group by grade;
/* error : we cant 
select city , count(marks) from student
where max(marks) > 90
group by city;
*/