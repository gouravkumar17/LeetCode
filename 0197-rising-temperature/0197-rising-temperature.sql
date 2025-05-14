# Write your MySQL query statement below
select a.id from Weather a join Weather b
on DATE_SUB(a.recordDate, interval 1 day) = b.recordDate
where a.temperature > b.temperature;