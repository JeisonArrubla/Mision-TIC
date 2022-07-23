--Ver tabla
SELECT * 
FROM employees;

--Punto 1
SELECT last_name, salary 
FROM employees 
WHERE salary > 12000;

--Punto 2
SELECT last_name, department_id 
FROM employees 
WHERE employee_id=176; 

--Punto 3
SELECT last_name, salary 
FROM employees 
WHERE salary < 5000 OR salary > 12000;

--3.1
SELECT last_name, salary 
FROM employees 
WHERE salary NOT BETWEEN 5000 AND 12000; --NO muestra los salarios entre (between) 5000 y 12000

--Ordenar una consulta
--De mayor a menor
SELECT employee_id, last_name, salary
FROM employees 
ORDER BY salary DESC;
--De menor a mayor
SELECT employee_id, last_name, salary
FROM employees 
ORDER BY salary ASC;

--Punto 4
SELECT last_name, job_id, hire_date
FROM employees
WHERE last_name = "Chen" OR last_name = "Taylor"
ORDER BY hire_date ASC;

--Alias
SELECT COUNT(*) AS cant_empleados 
FROM employees;
--También puedo colocar el nombre que quiero que registre después de llamarlo en el SELECT separado por espacio -> SELECT last_name APELLIDO

--Punto 5
SELECT last_name APELLIDO, department_id ID
FROM employees 
WHERE department_id = 6 OR department_id = 10
ORDER BY first_name ASC;

--Punto 6
SELECT last_name Employee, salary Monthly_Salary
FROM employees
WHERE (salary BETWEEN 5000 AND 12000)
AND (department_id = 6 OR department_id = 10);

--Punto 7
SELECT last_name APELLIDO, hire_date FECHA_CONTRATACION
FROM employees
WHERE hire_date BETWEEN '1994-01-01' AND '1994-12-31';

--7.1
SELECT last_name APELLIDO, hire_date FECHA_CONTRATACION
FROM employees
WHERE hire_date LIKE '1994%';
--AsíEmpieza%
--%AsíTermina
--En este caso el formato de la fecha es AAAA-MM-DD

--Comparar con valores nulos
SELECT last_name, phone_number 
FROM employees
WHERE phone_number IS NULL;
--Que no tengan null
SELECT last_name, phone_number 
FROM employees
WHERE phone_number IS NOT NULL;

--Punto 8
--Obtener datos de otra tabla
--Obtener el apellido y cargo de empleados sin gerente
--Debemos poner alias a las tablas para identificarlas fácilmente 
SELECT last_name APELLIDO, job_title CARGO
FROM employees EMPLEADOS
INNER JOIN jobs TRABAJOS ON EMPLEADOS.job_id = TRABAJOS.job_id 
WHERE manager_id IS NULL;

--Punto 9
/**
 * apellido salario y nombre del departamento de todos los que ganen entre 4.000 y 8.000
 * obetener los registros de forma descendente por la columna salario
 */

SELECT T_EMPLEADOS.last_name APELLIDO, T_EMPLEADOS.salary SALARIO, T_DEPARTAMENTOS.department_name DEPARTAMENTO
FROM employees T_EMPLEADOS
INNER JOIN departments T_DEPARTAMENTOS 
ON T_EMPLEADOS.department_id = T_DEPARTAMENTOS.department_id 
WHERE T_EMPLEADOS.salary 
BETWEEN 4000 AND 8000
ORDER BY T_EMPLEADOS.salary DESC;

--9.1
SELECT e.last_name, e.salary , d.department_name 
FROM employees e 
INNER JOIN departments d 
ON e.department_id = d.department_id  
WHERE (e.salary >= 4000 AND salary <= 8000)
ORDER BY e.salary DESC;