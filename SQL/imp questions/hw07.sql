-- Write a query to display each order with the customer name.
use temp;
create table customers (
    customer_id int primary key,
    customer_name varchar(50),
    city varchar(50)
);
insert into customers (customer_id , customer_name , city)
VALUES
(1 , 'Aditi Sharma' , 'Delhi'),
(2 , 'Rahul Verma' , 'Mumbai'),
(3 , 'Karan kaur ' , 'Chandigarh'),
(4 , 'Arjun Nair' , 'Benglaru');

create TABLE orders(
    order_id int primary key, 
    customer_id int ,
    amount int,
    status varchar(50),
    foreign key(customer_id) references customers(customer_id)
);

insert into orders (order_id , customer_id , amount , status) 
VALUES
(501 , 1 , 2400 , 'Delivered'),
(502 , 1 , 3200 , 'Delivered'),
(503 , 2 , 1800 , 'Delivered'),
(504 , 2 , 4100 , 'Pending'),
(505 , 3 , 950 , 'Cancelled');

select * from customers;
SELECT * FROM orders;
select c.customer_name , o.order_id , o.amount , o.status 
from customers c join orders o
on c.customer_id = o.customer_id; 

-- We use ON c.customer_id = o.customer_id to match each customer with their orders.


