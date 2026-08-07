select email 
from person
where email = lower(email)
group by email
having count(email) > 1;
