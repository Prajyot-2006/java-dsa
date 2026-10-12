-- Write a query to find the highest-spending customer based only on delivered orders.
select c.customer_name , sum(o.amount) as total_spending
from customers c join orders o
on c.customer_id = o.customer_id
where o.status = 'Delivered'
group by c.customer_id , c.customer_name
order by total_spending DESC
limit 1;