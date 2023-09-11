-- 제약조건
SELECT * FROM dept;
CREATE TABLE NEW_emp01(
	NO number(4) CONSTRAINTS emp01_no_pk PRIMARY KEY,
	name varchar2(20) CONSTRAINTS emp01_name_nn NOT NULL,
	jumin varchar2(13) CONSTRAINTS emp01_jumin_nn NOT NULL
					   CONSTRAINTS emp01_jumin_uk UNIQUE,
	DEPTNO number(2,0) CONSTRAINTS emp01_deptno_fk REFERENCES DEPT(DEPTNO)
);

INSERT INTO NEW_emp01 VALUES (10, '정현목', 1111112222229, 20);

CREATE TABLE NEW_emp02(
	NO number(4) PRIMARY KEY,
	name varchar2(100) NOT NULL,
	jumin varchar2(13) NOT NULL
					   UNIQUE,
	deptno number(2,0) REFERENCES dept(deptno)
);

INSERT INTO NEW_emp01 VALUES (2, '정현목', 1111112222222, 20);
INSERT INTO NEW_emp01 VALUES (1, '장동건', 1111112222223, 10);
INSERT INTO NEW_emp01 VALUES (emp_seq.nextval, '장동공', 1111112222226,10);

SELECT * FROM NEW_EMP01;

CREATE SEQUENCE emp_seq
	INCREMENT BY 1
	START WITH 1
	MINVALUE 1
	MAXVALUE 9999
	nocycle
	nocache;

ALTER SEQUENCE emp_seq MAXVALUE 99999;
--오라클 자동증가
SELECT emp_seq.nextval FROM dual;

INSERT INTO new_emp01 
	VALUES ((SELECT nvl(max(no),0) +1 FROM new_emp01),
	'어피치',
	1234561234567,
	30
	);

SELECT nvl(max(no),0) +1 FROM new_emp01; 

--dept03을 생성하시오.
-- deptno => 숫자 2개 not null unique
-- dname => 글자 30개 unique
-- loc => 글자 30개 not null

CREATE TABLE dept03 (
	deptno number(2) PRIMARY KEY,
	dname varchar(30) UNIQUE,
	loc varchar(30) NOT NULL
);

SELECT * FROM dept03;
-- insert 3개 넣어보기
INSERT INTO dept03 values(10, '세일즈', '서울');
INSERT INTO dept03 values(20, '데이터베이스', '부산');
INSERT INTO dept03 values(30, '자바', '제주도');

SELECT * FROM ALL_CONSTRAINTS;
SELECT * FROM user_CONSTRAINTS;
SELECT * FROM user_CONSTRAINTS WHERE table_name = 'NEW_EMP01';


CREATE TABLE NEW_emp01(
	NO number(4) CONSTRAINTS emp01_no_pk PRIMARY KEY,
	name varchar2(20) CONSTRAINTS emp01_name_nn NOT NULL,
	jumin varchar2(13) CONSTRAINTS emp01_jumin_nn NOT NULL
					   CONSTRAINTS emp01_jumin_uk UNIQUE,
	salary number(10) CONSTRAINT emp01_salary_ch check(salary > 2000),
	DEPTNO number(2,0) CONSTRAINTS emp01_deptno_fk REFERENCES DEPT(DEPTNO)
);

DROP TABLE NEW_EMP01;








