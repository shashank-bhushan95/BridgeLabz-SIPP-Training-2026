create database Covid_db;
use Covid_db;

CREATE TABLE covid_cases (
    id INT AUTO_INCREMENT PRIMARY KEY,
    date DATE,
    time TIME,
    state VARCHAR(100),
    confirmed_indian_national INT,
    confirmed_foreign_national INT,
    recoveries INT,
    deaths INT,
    confirmed_cases INT
);

INSERT INTO covid_cases
(date, time, state, confirmed_indian_national,
 confirmed_foreign_national, recoveries, deaths, confirmed_cases)
VALUES
('2020-03-15', '10:00:00', 'India', 90, 10, 50, 2, 100);

SET SQL_SAFE_UPDATES = 0;

UPDATE covid_cases
SET confirmed_cases = 120
WHERE state = 'India'
AND date = '2020-03-15';

SET SQL_SAFE_UPDATES = 1;

DELETE FROM covid_cases
WHERE state = 'IN';

ALTER TABLE covid_cases
ADD vaccination_rate FLOAT;

select * from covid_cases;