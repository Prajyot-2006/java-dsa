-- Write a query to find customers who have never placed an order.
select c.customer_id , c.customer_name 
from customers c left join orders o
on c.customer_id = o.customer_id
where o.order_id is null;

-- We use ON c.customer_id = o.customer_id to match each customer with their orders.