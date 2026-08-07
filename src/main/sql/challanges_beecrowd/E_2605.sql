select products.name, providers.name
from products
join categories
on products.id_categories = categories.id and categories.id = '6'
join providers
on products.id_providers = providers.id;
