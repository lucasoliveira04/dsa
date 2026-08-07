select cust.name, ord.id 
from orders ord
join customers cust on ord.id_customers = cust.id
where ord.orders_date between '2016-01-01' and '2016-06-30';
