-- Write a query to find employees earning more than the company average salary.
use temp;
select employee_name , salary
from employees
where salary > (SELECT avg(salary) from employees);