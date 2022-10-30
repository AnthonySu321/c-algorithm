# Write your MySQL query statement below

# 
select B.name as Employee
from Employee as A join  Employee as B 
on B.managerID=A.id and B.salary>A.salary;

#注意 这种是错误的，
select A.name as Employee
from Employee as A join  Employee as B 
on B.managerID=A.id and A.salary>B.salary#A B的顺序不能弄混