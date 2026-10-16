/*
Question 12: A new intern should only be able to view the Employees table but should not modify it. Which SQL command will you use?

Interview Answer

- Use GRANT to give specific access.
- SELECT permission allows reading data from Employees.
- Do not grant INSERT, UPDATE or DELETE permissions.

Query / Example

```
GRANT SELECT ON Employees
TO intern_user;
```
*/