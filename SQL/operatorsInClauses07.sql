-- 1) arithmetic operator 
SELECT name, marks, marks + 5
FROM student;

-- 2) comparision operator
SELECT * 
FROM student
WHERE marks = 95;

-- 3) logical operator  refer notes 
SELECT *
FROM student
WHERE marks > 90 AND city = 'Mumbai';

SELECT *
FROM student
WHERE city = 'Mumbai' OR city = 'Pune';

SELECT *
FROM student
WHERE NOT city = 'Pune';

SELECT *
FROM student
WHERE marks BETWEEN 90 AND 95;

SELECT *
FROM student
WHERE city IN ('Mumbai','Delhi','Pune');

SELECT *
FROM student
WHERE city NOT IN ('Mumbai','Pune');