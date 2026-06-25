create database collegeForJoins;
use collegeForJoins;
create table student(
    student_id int primary key ,
    name VARCHAR(50) 
    );
INSERT INTO student 
VALUES 
(101, 'eren'),
(102, 'hanzo'),
(103, 'levi'); 
create table course(
    student_id int primary key ,
    course VARCHAR(50) 
    );

INSERT INTO course 
VALUES 
(102, 'english'),
(105, 'math'),
(103, 'science'),
(107, 'computer science');

-- inner join : 
select * from student
inner join course
on student.student_id = course.student_id;


-- left join : 
select * from student
left join course
on student.student_id = course.student_id;

/* 
left join with alias : 
*/
select * from student as s
left join course as c
on s.student_id = c.student_id;
-- Alias means giving a temporary short name to a table or column. 
--It does not change the original name in the database. It is only for that query.

-- right join : 
select * from student 
right join course
on student.student_id = course.student_id;


-- full join : 
SELECT *
FROM student
LEFT JOIN course
ON student.student_id = course.student_id

UNION

SELECT *
FROM student
RIGHT JOIN course
ON student.student_id = course.student_id;

-- left exclusive join 
SELECT *
FROM student
LEFT JOIN course
ON student.student_id = course.student_id
WHERE course.student_id IS NULL;

-- right exclusive join 
SELECT *
FROM student
RIGHT JOIN course
ON student.student_id = course.student_id
WHERE student.student_id IS NULL;

-- full exclusive join 
SELECT *
FROM student
LEFT JOIN course
ON student.student_id = course.student_id
WHERE course.student_id IS NULL

UNION

SELECT *
FROM student
RIGHT JOIN course
ON student.student_id = course.student_id
WHERE student.student_id IS NULL;


-- self join 
-- creating a eg table
CREATE TABLE employee (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    manager_id INT
);
INSERT INTO employee
VALUES
(101, 'adam', 103),
(102, 'bob', 104),
(103, 'casey', NULL),
(104, 'donald', 103);
select * from employee;
SELECT
    t1.name AS Employee,
    t2.name AS Manager
FROM employee t1
JOIN employee t2
ON t1.manager_id = t2.id;