/*Question 15: A table contains duplicate and NULL email values. How will COUNT(\*), COUNT(email), and COUNT(DISTINCT email) differ?

Query / Example


SELECT COUNT(*) AS total_rows,
       COUNT(email) AS non_null_emails,
       COUNT(DISTINCT email) AS unique_non_null_emails
FROM Customers;


Explanation

- COUNT(\*) counts every row.
- COUNT(email) counts only rows where email is not NULL.
- COUNT(DISTINCT email) counts unique non-NULL emails only.*/