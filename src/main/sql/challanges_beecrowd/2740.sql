select
    case
        when position <= 3 THEN concat('Podium: ', team)
        when position >= 14 THEN concat('Demoted: ', team)
    end as name
from league
where position <= 3 or position >= 14;
