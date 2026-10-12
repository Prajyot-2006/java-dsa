-- Write a query to find the second-highest distinct salary.
use temp;
select max(salary) 
from employees
where salary < (select max(salary) from employees);