select prod.name, pr.name, ca.name
from products prod
join providers pr
on prod.id_providers = pr.id
join categories ca
on prod.id_categories = ca.id
where ca.name = 'Imported' and pr.name = 'Sansul SA';
