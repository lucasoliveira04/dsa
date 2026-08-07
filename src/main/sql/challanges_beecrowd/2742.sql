select 
    l.name,
    ROUND(l.omega * 1.618, 3) AS "Fator N"
from 
    life_registry l
join
    dimensions d on l.dimensions_id = d.id
where
    d.name in ('C875', 'C774')
    and l.name like 'Richard%'
order by 
    l.omega asc;
