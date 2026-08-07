select prod.name
from products prod
join providers p on prod.id_providers = p.id 
where p.name like 'P%' and prod.amount between 10 and 20;
