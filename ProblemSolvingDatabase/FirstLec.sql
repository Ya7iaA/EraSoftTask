-- First Task
CREATE TABLE Manger (
    id NUMBER,
    name VARCHAR2(100),
    age NUMBER,
    birth_date DATE,
    address VARCHAR2(200)
);

ALTER TABLE Manger DROP COLUMN address;

ALTER TABLE Manger ADD (
    city_address VARCHAR2(100),
    street VARCHAR2(100)
);

ALTER TABLE Manger
    RENAME COLUMN name TO full_name;

ALTER TABLE Manger READ ONLY;

CREATE TABLE Owner
    AS SELECT id, full_name AS name, birth_date FROM Manger
                                                WHERE 1 = 0;

ALTER TABLE Manger
    RENAME TO Master;

ALTER TABLE Master READ WRITE;

ALTER TABLE Owner READ WRITE;

DROP TABLE Master CASCADE CONSTRAINTS;

DROP TABLE Owner CASCADE CONSTRAINTS;