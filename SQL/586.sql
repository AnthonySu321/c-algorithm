-- asc 升序排序 desc降序排序
-- order by默认是升序排序，因此asc可以省略不写。

/* 
补充：
LIMIT可以实现top N查询，也可以实现M至N（某一段）的记录查询，具体语法如下：
LIMIT offset, recnum
      其中offset为从第几条（M+1）记录开始，recnum为返回的记录条数。例：
limit 2, 5 


*/

-- top关键字无法使用


/* 
select top 1 customer_number as customer_number
from
(
select count(*) as counNum,customer_number
from Orders
group by customer_number
order by counNum desc
) as T
 */
 
select customer_number
from
(
select count(*) as counNum,customer_number
from Orders
group by customer_number
order by counNum desc
)LIMIT 0,1