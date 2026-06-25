-- Note : i am creating these tables in practice database 
-- parent table : depeartment
use practice;
create table department (
    dept_id int primary key,
    dept_name varchar(50) 
);

-- child table : student
create table student (
    id int primary key,
    name varchar(50),
    dept_id int,
    foreign key (dept_id) references department(dept_id)
    on update cascade
    on delete cascade
);

insert into department (dept_id ,dept_name )
values (1 , "IT"),
(2,"CS");

insert into student (id , name , dept_id) 
values (101 , "Ichigo" , 1),
(102 , "Rukia" , 2);

select * from department;
select * from student;

-- 1) on delete cascade : when something is deleted from parent table , that is also gets deleted from child table
delete from department 
where dept_id = 1;

-- u can verify 
select * from student;


-- 2) on update cascade : when something is updated from parent table , that is also gets updated from child table
update department
set dept_id = "3"
where dept_name = "CS";



