create database StudentDB;
use StudentDB;
create table department(
	department_id int Primary key,
    department_name varchar(16)
);
CREATE TABLE student (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(15),
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES department(department_id)
);
Insert into department(department_id, department_name)
values(1,'civil'),
(2,'mechanical'),
(3,'chemical');

 
Insert into student(student_id, student_name,department_id)
values(1,'Rudra',1),
(2,'Shivam',2),
(3,'Kanha',3);

select * 
from student s
Inner join department d
on s.department_id= d.department_id;

select * 
from student s
left join department d
on s.department_id= d.department_id;

select * 
from student s
Right join department d
on s.department_id= d.department_id;

SELECT * 
FROM student s
Cross JOIN department d
ON s.department_id = d.department_id;