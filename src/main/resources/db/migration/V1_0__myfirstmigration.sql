CREATE TABLE IF NOT EXISTS EMPLOYEE(
EMPLOYEE_ID SERIAL PRIMARY KEY,
NAME VARCHAR(20) NOT NULL,
EMAIL VARCHAR(50) NOT NULL,
EMPLOYED_DATE DATE NOT NULL
)