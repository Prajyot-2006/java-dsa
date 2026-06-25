use college;
-- question 1 : Get names of all students who scored more than class average.
select * from student;
Step 1: Find average marks
SELECT AVG(marks)
FROM student;

-- Step 2: Find students above average
SELECT name
FROM student
WHERE marks > 92.2857;

-- Now combine both using SUBQUERY
SELECT name
FROM student
WHERE marks > (
    SELECT AVG(marks)
    FROM student
);

-- question 2 : Find the names of all students with even roll numbers
-- Step 1: Find even roll numbers
SELECT id
FROM student
WHERE id % 2 = 0;

-- this is also correct
SELECT name
FROM student
WHERE id % 2 = 0;
-- Step 2: Find names using those roll numbers
SELECT name
FROM student
WHERE id IN (
    SELECT id
    FROM student
    WHERE id % 2 = 0
);