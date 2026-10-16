/*
Question 16: A report contains missing values across primary_phone, alternate_phone, and emergency_phone. How would you return the first available value and show 'Not Available' when all three are NULL?

Query / Example


SELECT customer_name,
       COALESCE(primary_phone, alternate_phone,
                emergency_phone, 'Not Available')
       AS contact_phone
FROM Customers;

- COALESCE returns the first non-NULL value.
- Useful when multiple optional columns can contain the required value.
- The final text value works as a fallback when all columns are NULL.
*/ 