select prod.name, prov.name, prod.price
from products prod 
join providers prov on prod.id_providers = prov.id
join categories ca on prod.id_categories = ca.id
where prod.price > 1000 and ca.name = 'Super Luxury';
