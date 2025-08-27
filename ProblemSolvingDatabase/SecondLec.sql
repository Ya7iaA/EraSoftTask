CREATE TABLE Doctor (
    id NUMBER PRIMARY KEY,
    name VARCHAR2(100),
    salary NUMBER,
    address VARCHAR2(200)
);

INSERT INTO Doctor (id, name, salary, address) VALUES (1, 'Dr. Ahmed Ali', 5000, '123 Main St, Cairo');
INSERT INTO Doctor (id, name, salary, address) VALUES (2, 'Dr. Sarah Mohammed', 7000, '456 Park Ave, Alexandria');
INSERT INTO Doctor (id, name, salary, address) VALUES (3, 'Dr. Omar Hassan', 15000, '789 Ocean Rd, Giza');
INSERT INTO Doctor (id, name, salary, address) VALUES (4, 'Dr. Layla Mahmoud', 3000, '321 Palm St, Luxor');
INSERT INTO Doctor (id, name, salary, address) VALUES (5, 'Dr. Khalid Ibrahim', 9000, '654 Desert Rd, Aswan');
INSERT INTO Doctor (id, name, salary, address) VALUES (6, 'Dr. Amina Mostafa', 4000, '987 Mountain View, Hurghada');
INSERT INTO Doctor (id, name, salary, address) VALUES (7, 'Dr. Tariq Abdel', 6000, '147 River Side, Sharm');
INSERT INTO Doctor (id, name, salary, address) VALUES (8, 'Dr. Nour ElDin', 8000, '258 Garden St, Dahab');
INSERT INTO Doctor (id, name, salary, address) VALUES (9, 'Dr. Fatima Saleh', 3500, '369 Sunset Blvd, Marsa Alam');
INSERT INTO Doctor (id, name, salary, address) VALUES (10, 'Dr. Ziad Kamal', 12000, '741 Sunrise Ave, Siwa');

UPDATE Doctor SET salary = 20000 WHERE id = 3;

DELETE FROM Doctor WHERE id = 9;

SELECT name || ' - Salary: ' || salary || ' EGP' AS doctor_info FROM Doctor;

SELECT id, name, salary, salary * 2 AS doubled_salary, address FROM Doctor;

SELECT * FROM Doctor WHERE salary IN (1000, 2000, 3000);

ALTER TABLE Doctor RENAME TO PRD_DOCTOR;

CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    FirstName VARCHAR2(50),
    LastName VARCHAR2(50),
    Department VARCHAR2(50),
    Salary NUMBER
);

INSERT INTO Employees (EmployeeID, FirstName, LastName, Department, Salary) VALUES (101, 'John1', 'Doe1', 'HR', 20000);
INSERT INTO Employees (EmployeeID, FirstName, LastName, Department, Salary) VALUES (102, 'John2', 'Doe2', 'IT', 50000);
INSERT INTO Employees (EmployeeID, FirstName, LastName, Department, Salary) VALUES (103, 'John3', 'Doe3', 'CS', 40000);
INSERT INTO Employees (EmployeeID, FirstName, LastName, Department, Salary) VALUES (104, 'John4', 'Doe4', 'IT', 10000);
INSERT INTO Employees (EmployeeID, FirstName, LastName, Department, Salary) VALUES (105, 'John5', 'Doe5', 'ZX', 30000);

UPDATE Employees SET Salary = 600000 WHERE EmployeeID = 101;

DELETE FROM Employees WHERE Department = 'HR';

SELECT * FROM Employees WHERE Department = 'IT';

SELECT 
    EmployeeID,
    FirstName || ' ' || LastName AS FullName,
    Department,
    Salary
FROM Employees;