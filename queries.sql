## Part 1: Test it with SQL
SHOW COLUMNS FROM job;

## Part 2: Test it with SQL
SELECT *
FROM techjobs.employer
WHERE location = "St. Louis City";

## Part 3: Test it with SQL
DROP TABLE `techjobs`.`job`;

## Part 4: Test it with SQL
SELECT name, description FROM skill
INNER JOIN job_skill ON skill.id = job_skill.skill_id
WHERE job_id IS NOT NULL
ORDER BY name ASC;