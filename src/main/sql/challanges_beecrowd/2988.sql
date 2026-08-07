select 
    t.name,
    count(m.id) as matches,
    sum(
        case 
            when (t.id = m.team_1 and m.team_1_goals > m.team_2_goals) or
                 (t.id = m.team_2 and m.team_2_goals > m.team_1_goals)
            then 1 else 0
        end
    ) as victories,
    sum(
        case
            when (t.id = m.team_1 and m.team_1_goals < m.team_2_goals) or
                 (t.id = m.team_2 and m.team_2_goals < m.team_1_goals)
            then 1 else 0
        end
    ) as defeats,
    sum (
        case 
            when m.team_1_goals = m.team_2_goals then 1 else 0
        end
    ) as draws,
    sum (
        case 
            when (t.id = m.team_1 and m.team_1_goals > m.team_2_goals) or
                (t.id = m.team_2 and m.team_2_goals > m.team_1_goals)
            then 3
            when m.team_1_goals = m.team_2_goals then 1
            else 0
        end
    ) as score
from teams t
join matches m 
on t.id = m.team_1 
or t.id = m.team_2
group by t.name
order by score desc;
