# Write your MySQL query statement below

# 
select B.name as Employee
from Employee as A join  Employee as B 
on B.managerID=A.id and B.salary>A.salary;





/* 
解法一
#注意 这种是错误的，
select A.name as Employee
from Employee as A join  Employee as B 
on B.managerID=A.id and A.salary>B.salary#A B的顺序不能弄混 

*/


/* 
解法二
SELECT
    a.Name AS 'Employee'
FROM
    Employee AS a,
    Employee AS b
WHERE
    a.ManagerId = b.Id
        AND a.Salary > b.Salary
; 

*/

/*
 (1) A driver with licence number 10001 used a truck with a registration number
SST005 for a trip number 52. The trip started on 11 November, 2020 and
ended on 15 November 2020. 

A departure city was Sydney. From Sydney the
trip passed through Waga Waga and Adelaide. A destination city was
Melbourne. Insert all information about the trip into a sample database.

 (2) Delete from a sample database all information about a trip number 35. 
 
 (3) Increase salary of employees whose present salary 
 is less than 900 by 10.

 (4) Change a number of trip 36 to 63 (it is difficult !). 
 
 */

-- UPDATE trip SET REGNUM = 'SST005',DEPARTURE_DATE='',ARRIVAL_DATE=''
-- WHERE LNUM = 10001;


-- (1)
INSERT INTO trip ( TNUM, LNUM,REGNUM,DEPARTURE_DATE,ARRIVAL_DATE )
                       VALUES
                       ( 52, 10001,'SST005','2020-11-11','2020-11-15' );
					  


INSERT INTO TRIPLEG VALUES( 52, 1, 'Sydney', 'Waga Waga');
INSERT INTO TRIPLEG VALUES( 52, 2, 'Waga Waga', 'Adelaide');
INSERT INTO TRIPLEG VALUES( 52, 3, 'Adelaide', 'Melbourne');


--(2)

DELETE FROM TRIPLEG WHERE TNUM=35;--先删除从表tripleg
DELETE FROM TRIP WHERE TNUM=35;--再删除主表trip

--(3)

update employee set SALARY=SALARY+10 where SALARY< 900 ;

--(4)
--先删除TRIPLEG_FKEY1
ALTER TABLE TRIPLEG DROP FOREIGN KEY TRIPLEG_FKEY1;
--再创建级联更新
ALTER TABLE TRIPLEG ADD CONSTRAINT FK_on_update
FOREIGN KEY(Tnum) REFERENCES trip(TNUM) ON UPDATE CASCADE ;

--再更新
UPDATE trip SET TNUM=63 WHERE TNUM=36;
