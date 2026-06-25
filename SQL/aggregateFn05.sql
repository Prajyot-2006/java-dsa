-- count() : tells how many rows/records are there in table 
select count(*) from student;  

-- we can also display it in custom way 
select count(*) as toppers from student where marks>60; 

-- max() 
select max(marks) from student;

-- min() 
select min(marks) from student;

-- avg() 
select avg(marks) from student;
