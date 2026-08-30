CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.

        SELECT 
            salary
        FROM 
            (
                SELECT 
                    salary,
                    DENSE_RANK() OVER(ORDER BY salary DESC) AS ranks
                FROM
                    Employee e
            ) e
            WHERE ranks = N
            LIMIT 1
  );
END