select po.name, prs.name 
from products po 
join providers prs 
on prs.id = po.id_providers
where prs.name = 'Ajax SA';
