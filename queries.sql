## Part 1: Test it with SQL
int(id), primary key
VARCHAR(name)
int(employer_id)

## Part 2: Test it with SQL
SELECT name
FROM employer
WHERE location = "St. Louis City";


## Part 3: Test it with SQL

DROP TABLE job;

## Part 4: Test it with SQL

SELECT distinct s.name, s.description
FROM skill s
INNER JOIN job_skills j on s.id = j.skills_id
WHERE jobs_id is not null
ORDER BY name ASC;