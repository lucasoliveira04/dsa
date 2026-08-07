-- Segundo Maior 
(select city_name, population
from cities 
order by population desc limit 1 offset 1)

union all

-- Segundo Menor
(select city_name, population
from cities 
order by population asc limit 1 offset 1);
