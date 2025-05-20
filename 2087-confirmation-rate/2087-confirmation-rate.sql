# Write your MySQL query statement below
select A.user_id , round(ifnull(avg(action='confirmed'),0),2) AS confirmation_rate
from Signups as A
left join Confirmations As B
on A.user_id=B.user_id
group by A.user_id;