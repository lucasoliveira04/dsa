select prod.name, cat.name 
from products prod 
join categories cat on prod.id_categories = cat.id
where prod.amount > 100 and prod.id_categories in(1,2,3,6,9);
