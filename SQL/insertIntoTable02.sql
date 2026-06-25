use college;
-- 2 ways to insert values in table 

-- 1st way 
insert into student VALUES (24,"prajyot","mumbai",87); -- write in appropriate form id, name, city, marks

-- 2nd way insert values into specific columns not in every columns
insert into student (id,name) 
values (101,"genichiro"),
values (102,"kuro");

