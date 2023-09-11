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
SELECT * FROM new_emp01;

INSERT INTO NEW_emp01 values(1,'정현목', 1234561234567,3000,20);


-- 테이블을 생성 emp-const
-- empno 숫자 4개 primary key 자동증가
-- ename 글자 30개 not null
-- job 글자 30개 
-- tel 글자 13개 unique
-- hiredate date
-- sal 숫자 7개 소수점 2자리 1000이상 999999이하
-- comm 7개 소수점 2자리
-- dept dept의 deptno 참조
-- 데이터 3개 입력하고 조회

CREATE TABLE emp_const(
	empno NUMBER(4) PRIMARY KEY,
	ename varchar2(30) NOT NULL,
	job varchar2(30),
	tel varchar2(13) UNIQUE,
	hiredate DATE,
	sal NUMBER(7,2) check(sal >= 1000 AND sal <= 99999), -- sal BETWEEN 1000 AND 9999로 사용하
	comm number(7,2),
	deptno number(2,0) REFERENCES dept(deptno)
);
SELECT * FROM emp_const;
DROP TABLE emp_const;
INSERT INTO EMP_CONST VALUES (emp_seq01.nextval,'네임','직업','01097758809','1995-01-01',1233.12,22.12,20);

CREATE SEQUENCE emp_seq01
	INCREMENT BY 1
	START WITH 1
	MINVALUE 1
	MAXVALUE 9999
	nocycle
	nocache;

SELECT * FROM user_constraints;

-- view table vip 메일을
-- customer 1년에 백화점에서 2억 vip 이름,메일
CREATE OR REPLACE VIEW v_emp01
	AS SELECT empno, ename, hiredate FROM emp;
-- view를 생성할려면 권한을 받아야한다.
SELECT * FROM v_emp01;

--view 생성 empnom ename, job, deptno 20번 부서사라만 
CREATE OR REPLACE VIEW v_emp02
	AS SELECT empno, ename, job, deptno FROM emp WHERE DEPTNO = 20;

SELECT * FROM v_emp02;

SELECT * FROM user_views;



-- 오라클에는 limit가 없다. 이떄 임시로 사용하는 rownum이라는 가상 컬럼을 이용한다.
SELECT rownum, e.* FROM emp e WHERE ROWnum <= 5;

----연봉을 위에서 5명
SELECT rownum, e.* FROM emp e WHERE rownum <= 5 ORDER BY sal desc;

SELECT rownum, e.* FROM 
	(SELECT * FROM emp ORDER BY sal DESC) e WHERE rownum BETWEEN 1 AND 5;


--입사일 빠른 순서 5명 뽑기..
SELECT * FROM emp;

SELECT * FROM (
	SELECT rownum AS num, e.* FROM (
		SELECT * FROM emp ORDER BY hiredate) e)
			WHERE num >=3 AND num <=6;
		
-- scott보다 입사일이 늦은 사람
SELECT * FROM emp WHERE hiredate > (SELECT hiredate FROM emp WHERE ename = 'SCOTT');
SELECT * FROM emp WHERE ename = 'SCOTT';
			


SELECT * FROM EMP 
	WHERE deptno IN (20,30)
	ORDER BY deptno;

--- 각 부서의 월급 제일 많이 받는 사람의 정보
SELECT MAX(sal) FROM emp GROUP BY deptno;
SELECT * FROM emp WHERE sal IN (SELECT MAX(sal) FROM emp GROUP BY deptno);

-- any는 하나라도 참이면 참... any는 =,<,>을 사용할수있다.
-- all any는 전부 만족해야 참
SELECT * FROM EMP e 
	WHERE sal = ANY (SELECT max(sal) FROM emp GROUP BY deptno);

SELECT * FROM emp;
-- 1. 전체 사원 중 allen 과 같은 직책인 사원들의 사원정보와 부서정보를 출력하시오.
SELECT * FROM emp e;
SELECT * FROM dept;
SELECT * FROM emp e
JOIN dept d ON e.deptno = d.DEPTNO
	WHERE job IN (SELECT job FROM emp WHERE ename = 'ALLEN');
				--= (SELECT job FROM emp WHERE ename = 'ALLEN');
	
-- 2. 전체 사원의 평균 급여보다 높은 급여를 받는 사원들의 사원정보, 부서정보를 출력하시오.
SELECT * FROM emp e JOIN dept d 
	ON e.deptno = d.deptno
	WHERE sal > (SELECT avg(sal) FROM emp)
	order BY sal;
SELECT avg(sal) FROM emp;
	

-- 3. 10번 부서에 근무하는 사원 중 30번 부서에는 존재하지 않는 직책을 가진 사원들의 사원 정보, 부서정보를 출력하시오.
SELECT * FROM emp WHERE deptno = 10;
SELECT * FROM emp WHERE deptno = 30;
SELECT job FROM emp ORDER BY job; -- alalyst salesman
SELECT * FROM 
	(SELECT * FROM emp e JOIN dept d
		ON e.deptno = d.deptno  
			WHERE d.deptno = 30)
		WHERE job NOT IN (SELECT job FROM emp WHERE deptno = 10);



-- 직책이 salesman인 사람들의 최고 급여보다 높은 급여를 받는 사원들의 사원정보, 급여 등급 정보를 출력하시오.
SELECT max(sal) FROM emp WHERE job = 'SALESMAN';

SELECT * FROM emp e JOIN salgrade s
	ON e.sal BETWEEN s.LOSAL AND s.HISAL
		WHERE sal > (SELECT max(sal) FROM emp WHERE job = 'SALESMAN')
		ORDER BY sal;
	
SELECT * FROM emp e;
SELECT * FROM SALGRADE;








