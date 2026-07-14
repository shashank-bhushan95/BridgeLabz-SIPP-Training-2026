create database Covid;
use Covid;
CREATE TABLE covid_cases (
    country VARCHAR(100) NOT NULL,
    report_date DATE NOT NULL,
    confirmed_cases BIGINT DEFAULT 0,
    recoveries BIGINT DEFAULT 0,
    population BIGINT,

    PRIMARY KEY (country, report_date)
 );
CREATE TABLE covid_deaths (
    Country VARCHAR(100),
    Date DATE,
    Deaths INT
);

CREATE TABLE covid_vaccines (
    Country VARCHAR(100),
    Date DATE,
    Vaccinated INT
);

INSERT INTO covid_cases
(country, report_date, confirmed_cases, recoveries, population)
VALUES
('India', '2021-01-01', 10286000, 9880000, 1380000000),
('India', '2021-02-01', 10757000, 10400000, 1380000000),
('USA', '2021-01-01', 20000000, 11900000, 331000000),
('USA', '2021-02-01', 26500000, 16500000, 331000000),
('UK', '2021-01-01', 2600000, 1800000, 67000000),
('UK', '2021-02-01', 3900000, 2800000, 67000000);


SELECT * FROM covid_cases;
-- verify update
SELECT *
FROM covid_cases
WHERE Country = 'India'
AND Date = '2021-02-01';

DELETE FROM covid_cases
WHERE country = 'IN'
AND report_date = '2021-03-01';

-- add column
ALTER TABLE covid_cases
ADD vaccination_rate DECIMAL(5,2);

SELECT *
FROM covid_cases
WHERE country = 'IN';