-- 方法一：使用 GROUP BY 和临时表
SELECT Email FROM
(
SELECT Email count(Email) as NUM
from Person
GROUP BY Email
) as S
where NUM>1;
-- 方法二：使用 GROUP BY 和 HAVING 条件
SELECT Email
from Person
GROUP by Email
having count(Email)>1;