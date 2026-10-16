/*
Question 11: A table has 100 million records. You want to remove all rows as quickly as possible while keeping the table. Which SQL command will you use?
Interview Answer
- Use TRUNCATE when all rows must be removed quickly.
- It keeps the table structure but removes the data.
- It is generally faster than DELETE for full-table cleanup.
Query / Example :
TRUNCATE TABLE Employees;
*/