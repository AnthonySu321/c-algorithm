/* delete from Person
where Email in 

(
SELECT Email
from Person
GROUP by Email
having count(Email)>1
) */


delete from Person 
where id not in 
(
select t.id from 
	(
	select min(id) as id, email 
	from Person group by email
								) as t
);