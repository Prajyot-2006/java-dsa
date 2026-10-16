-- Write a query to find the number of employees in each department.
use temp;
select * from employees;
select department , count(*) as employee_count
from employees
group by department;

-- note group by ke bad jo column name likha hai vohi same select ke bad likhne ka rehta hai 
-- and we cannot use having clause with group by or under group by 