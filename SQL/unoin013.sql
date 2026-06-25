USE collegeForJoins;

CREATE TABLE boys(
    name VARCHAR(50)
);

INSERT INTO boys
VALUES
("Ichigo"),
("Rukia"),
("Levi"),
("naruto");


CREATE TABLE sensei(
    name VARCHAR(50)
);

INSERT INTO sensei
VALUES
("Gojo"),
("Kakashi"),
("naruto");

SELECT name FROM boys
UNION
SELECT name FROM sensei;