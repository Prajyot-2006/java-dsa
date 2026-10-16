/*Question 14: A ranking query contains duplicate salaries. How will ROW_NUMBER(), RANK(), and DENSE_RANK() assign values differently?

Sample ranking output

| Employee | Salary | ROW_NUMBER | RANK | DENSE_RANK |
|----------|--------|------------|------|------------|
| Aman     | 90000  | 1          | 1    | 1          |
| Neha     | 80000  | 2          | 2    | 2          |
| Ravi     | 80000  | 3          | 2    | 2          |
| Simran   | 70000  | 4          | 4    | 3          |

Explanation

- ROW_NUMBER() gives a unique sequence even when salaries tie.
- RANK() gives the same rank to ties but leaves gaps.
- DENSE_RANK() gives the same rank to ties without gaps.

Query / Example


SELECT employee, salary,
    ROW_NUMBER() OVER(ORDER BY salary DESC) AS row_no,
    RANK() OVER(ORDER BY salary DESC) AS rank_no,
    DENSE_RANK() OVER(ORDER BY salary DESC) AS dense_rank_no
FROM Employees;
```*/