# Write your MySQL query statement below
select p.product_name, s.year, s.price from Sales s join Product p on s.Product_id=p.Product_id