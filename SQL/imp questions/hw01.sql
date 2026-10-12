-- Write a query to display all Engineering employees ordered by salary from highest to lowest.

CREATE DATABASE temp;
USE temp;

CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(50),
    department VARCHAR(50),
    salary INT,
    manager_id INT
);

INSERT INTO employees (employee_id, employee_name, department, salary, manager_id)
VALUES
(101, 'Aarav', 'Engineering', 95000, 105),
(102, 'Meera', 'Engineering', 72000, 105),
(103, 'Kabir', 'Sales', 65000, 106),
(104, 'Prajyot', 'Sales', 92000, 106),
(105, 'Pranav', 'Engineering', 90000, NULL),
(106, 'Raghav', 'Sales', 88000, NULL);

SELECT * from employees;
SELECT employee_name , salary
FROM employees
where department = 'Engineering'
order by salary desc;