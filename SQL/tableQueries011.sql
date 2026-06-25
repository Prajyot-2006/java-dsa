use college;
-- 1) update command
update student 
set grade = 'O'
where grade = 'A'
-- check

select * from student;

update student 
set marks = 98
where id = 5
-- check
select * from student;

update student 
set grade = 'A'
where marks between 80 and 90
-- check
select * from student;

update student 
set marks = marks + 1  -- existing marks + 1

select * from student;

-- 2) delete command
delete from student 
where marks < 86  -- 85 is the lowest marks in the table so it will get deleted 


-- 3) alter commands : to change the column/schema
-- i) Add column :- 
alter table student
add column age int;
/*to add data into age column */
UPDATE student SET age = 20 WHERE id = 1
UPDATE student SET age = 21 WHERE id = 2
UPDATE student SET age = 22 WHERE id = 3;
UPDATE student SET age = 20 WHERE id = 4;
UPDATE student SET age = 21 WHERE id = 6;
UPDATE student SET age = 22 WHERE id = 7;
UPDATE student SET age = 21 WHERE id = 8;

/*instead of doing this we can update every rows using single query
using case 
You can update all 8 rows in one query using CASE.*/
UPDATE student
SET age = CASE id
    WHEN 101 THEN 20
    WHEN 102 THEN 21
    WHEN 103 THEN 22
    WHEN 104 THEN 20
    WHEN 105 THEN 21
    WHEN 106 THEN 22
    WHEN 107 THEN 20
    WHEN 108 THEN 21
END;
