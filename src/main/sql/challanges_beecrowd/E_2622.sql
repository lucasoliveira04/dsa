select c.name 
from legal_person LP
join customers c
on c.id = lp.id_customers;
