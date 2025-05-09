# Write your MySQL query statement below
select customer_id,
count(customer_id) as count_no_trans from Visits as A
left join 
Transactions as B
on A.visit_id = B.visit_id
where B.visit_id is null
group by customer_id;