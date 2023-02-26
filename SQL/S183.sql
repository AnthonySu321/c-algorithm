select Name as Customers
from Customers
WHERE Customers.Id not in 
(
SELECT CustomerID
from Orders
) 