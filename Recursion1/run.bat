@echo off
echo Running Java...

javac %1.java
if %errorlevel% neq 0 pause & exit /b

java %1

del %1.class

echo.
echo --- Finished ---
pause
