CREATE TABLE PROJECT(
CODE DECIMAL(12)   NOT NULL,
TITLE VARCHAR(50)  NOT NULL,
NAME VARCHAR(50)   NOT NULL,

 CONSTRAINT PROJECT_PKEY PRIMARY KEY(CODE),
 
);

CREATE TABLE DEPARTMENT(
NAME VARCHAR(20)  NOT NULL,
CHAIR VARCHAR(20)  NOT NULL,


);

INSERT INTO DEPARTMENT VALUES('Physics','Einstein');