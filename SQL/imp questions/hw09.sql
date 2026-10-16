-- Write a query to find customers who placed more than one order.

select c.customer_name , count(*) as total_orders
from customers c join orders o
on c.customer_id = o.customer_id
group by c.customer_id , c.customer_name
having count(*) > 1;

select * from customers;
select * from orders;
select customer_id , customer_name from customers
group by customer_id , customer_name;