--Part 1

--Part 2
SELECT name
FROM employer
WHERE location = "St. Louis City";
--Part 3
DROP TABLE job;
--Part 4
SELECT skill_name
FROM skills
LEFT JOIN job_skills  ON skill_id = skill_id
JOIN jobs  ON job_id = job_id
WHERE job_id IS NOT NULL
ORDER BY skill_name ASC;

