use college;
select city ,count(id) from student 
group by city 
having max(marks) > 90;

/* we cannot use aggregate fn in where clause */
select city ,count(name) from student 
group by city 
where max(marks) > 90;  -- this will give error 