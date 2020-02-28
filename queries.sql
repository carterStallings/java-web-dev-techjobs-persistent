## Part 1: Test it with SQL
id - int
employer - VARCHAR
name - VARCHAR
skills - VARCHAR

## Part 2: Test it with SQL
SELECT name
FROM employer
WHERE (location = "Seattle");


## Part 3: Test it with SQL

DROP TABLE job;

## Part 4: Test it with SQL

SELECT distinct s.name, s.description
FROM skill s
INNER JOIN job_skills j on s.id = j.skills_id
WHERE jobs_id != 0
ORDER BY name ASC;