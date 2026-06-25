-- where clause also referr notes in notebook 
select * from student where marks > 80;
select * from student where city = "mumbai";

-- limit clause
select * from student limit 3;  -- only shows 3 students not all even thogh * is written

-- order by clause
select * from student order by marks asc;      -- this prints marks in asc order 

-- group by clause 
SELECT city from student group by city;

select city , count(*) from student group by city; -- means ek city kitne rows me use hui hai 

select city , count(*) from student WHERE marks>80 
group by city;

select city , marks , count(*) from student 
group by city, marks; 