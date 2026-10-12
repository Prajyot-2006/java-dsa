-- Write a query to find employees whose salary is higher than their manager salary.
select e.employee_name , e.salary ,
    m.employee_name as manager_name,
    m.salary as manager_salary
from employees e join employees m
on e.manager_id = m.employee_id
where e.salary > m.salary;