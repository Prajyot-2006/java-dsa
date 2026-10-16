/*
Question: Write a query to find each user's previous login date.

User_Logins table

| user_id | login_date | session_minutes |
| ------- | ---------- | --------------- |
| 1       | 2024-07-01 | 35              |
| 1       | 2024-07-02 | 42              |
| 1       | 2024-07-03 | 28              |
| 2       | 2024-07-01 | 20              |
| 2       | 2024-07-03 | 25              |
| 3       | 2024-07-02 | 45              |

SQL Query


SELECT user_id, login_date,
       LAG(login_date) OVER (
           PARTITION BY user_id
           ORDER BY login_date
       ) AS previous_login
FROM User_Logins;

*/