-- find the max marks from the students of pune 
use college;
-- step 1 : find the students of Pune
SELECT *
FROM student
WHERE city = 'Pune';

-- step 2 : find max marks from that result 
-- here writing diret subquery , refer notebook for more info
select max(marks) from (
    select * from student
    where city = 'Pune'
) As pune_students;
