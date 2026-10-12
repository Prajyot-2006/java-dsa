-- Write a query to find the highest salary in each department.
use temp;
select department , max(salary)
from employees
group by department
