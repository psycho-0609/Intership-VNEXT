DROP TABLE task IF EXISTS;

CREATE TABLE task  (
                         id BIGINT IDENTITY NOT NULL PRIMARY KEY,
                         name VARCHAR(20),
                         status int
);