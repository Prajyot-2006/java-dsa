/*Question 13: An alias created in the SELECT list cannot be referenced in the WHERE clause of the same query. How does SQL's logical execution order explain this?

- WHERE is evaluated before SELECT.
- The alias does not exist yet when WHERE runs.
- Use the expression again, a subquery, or a CTE.

Query / Example

```
-- Alias is created after WHERE is evaluated

SELECT salary * 12 AS annual_salary
FROM Employees
WHERE annual_salary > 600000; -- Invalid in many DBs
*/