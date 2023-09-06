select * from emp;  emp테이블에 있는거 다 출력해줘

select empno AS 사원번호, ename AS 사원이름, job AS 직책 from emp; emp테이블의 empno는 사원번호로 ename은 사원이름으로 job는 직책으로 출력해줘

select distinct deptno AS 부서번호 from emp; emp테이블 안에 부서번호(depno)를 출력해줘 단. 중복은 빼고

select ename, job from emp; emp테이블에 ename, job을 출력해줘

select ename || job AS "이름 / 직책" FROM emp; 이름/직책이라고 나오고 출력은 ename과 job이 붙어서 나온다.
select ename ||" " || job AS "이름 / 직책" FROM emp; ename과 job사이의 공백을 넣었다.
select concat(ename,job) as "이름 / 직책" FROM emp;위에 꺼랑 같은 출력 값을 가지고 이게 정석이며 위에꺼는 편법으로 사용하지만 위에거를 더 많이 쓸다고는한다.

select ename || "직책은 " || jon || "이고 월급은 " || sal as total from emp;

select sal from emp where ename = 'ADAMS'; emp테이블안에 ename을 ADAMS로 가진 거에 sal을 찾는다.
select sal from emp where ename = 'ADAMS' and empno = 7876; emp테이블안에 ename을 ADAMS와 empno가 7876을 가진 거에 sal을 찾는다.

select * from emp where sal > 1000; emp테이블안에 sal이 1000보다 큰것이 출력된다.


SELECT * FROM emp;

SELECT * FROM emp WHERE JOB = 'MANAGER' OR JOB = 'SALESMAN' OR JOB = 'CLERK';

--comm 없는 사람 출력
-- null은 비교연산가(=) 사용안
SELECT  * FROM emp WHERE COMM = NULL;
-- null을 찾고싶으면 is를 사용한다.
SELECT * FROM emp WHERE comm IS NULL;

-- sweet sorrow도 null 찾는건가? 알아보자 검색해서 ㅎㅎ

SELECT * FROM emp; 
-- 이름이 er로 끝나는 사람
SELECT * FROM emp WHERE ename LIKE '%ER'; -- %는 앞에 무엇이 와도 상관없이 마지막으로 끝나는 것을 찾는다.
SELECT * FROM EMP WHERE ename LIKE 'S%';
SELECT * FROM emp WHERE ename LIKE '%E%';
SELECT * FROM emp WHERE ename LIKE '%AM%';
SELECT * FROM emp WHERE ename LIKE '%M%A%';
SELECT * FROM emp WHERE ename LIKE '____S';

-- 이름에 3번째에 A가 들어간 사람찾기
SELECT * FROM emp WHERE  ename LIKE '__A%';

-- 월급이 1로 시작하는 사람 찾기
SELECT * FROM emp WHERE sal LIKE '1%';

SELECT empno, ename, sal, deptno FROM EMP WHERE deptno = 10
UNION --합집합 UNION 그리고 union은 중복을 허용하지 않는다.
--UNION ALL -- union all은 중복을 허용한다. 
SELECT empno, ename, sal, deptno FROM EMP WHERE deptno = 10;

SELECT empno, ename, sal, deptno FROM EMP
MINUS -- 차집합이다.
SELECT empno, ename, sal, deptno FROM EMP WHERE deptno = 20;

SELECT empno, ename, sal, deptno FROM EMP
INTERSECT -- 교집합니다.
SELECT empno, ename, sal, deptno FROM EMP WHERE deptno = 20;

GRANT CONNECT, RESOURCE, UNLIMITED tablespace TO scott;

--1
SELECT * FROM emp WHERE ename LIKE '%S';

--2
SELECT * FROM emp WHERE deptno = 30 AND  job = 'SALESMAN';

--3-1
SELECT * FROM emp WHERE (deptno = 20 or DEPTNO = 30) AND sal > 2000;
-- 3-2
SELECT * FROM emp WHERE deptno = 20 or DEPTNO = 30
INTERSECT  
SELECT * FROM emp WHERE sal > 2000;

--4
SELECT * FROM emp WHERE sal >= 2000 AND  sal < 3000;

-- 5 
SELECT * FROM emp WHERE ename LIKE '%E%' AND (sal >= 1000 AND sal <= 2000);

-- 6 
SELECT * FROM emp;

SELECT * FROM emp WHERE COMM IS NULL AND (JOB  = 'CLERK' OR job = 'MANAGER')
MINUS 
SELECT * FROM emp WHERE ENAME LIKE '_L%';

SELECT * FROM emp;
-- desc안됨 디비버에서 성능상의 이유로 막음 
DESC emp;
SELECT ename AS 이름,deptno AS 부서번호, empno AS 사원번호 FROM emp;
SELECT * FROM emp WHERE ename = 'SCOTT';

SELECT ename,sal FROM emp WHERE sal >2500 AND sal <= 3000;
SELECT ename,sal FROM emp WHERE sal BETWEEN 2500 AND 3000;

SELECT ename, sal FROM emp ORDER BY sal DESC, ename asc; --order by => 정렬

-- like %(자리수 따지지 않기), _(자리수 따지기)
SELECT * FROM emp WHERE ename LIKE 'S%';
SELECT * FROM emp WHERE ename LIKE '____ER';


-- 단일행 함수
SELECT ename,
INITCAP(ename) AS "첫글자만 대문자",
Upper(ename),
LOWER(ename)
FROM EMP;

SELECT * FROM emp
WHERE Lower(ename) = lower('SCOtt');

--dual 가짜 테이블 dummy용 테이
SELECT Length('SCOTT') FROM dual;
-- 한글의 경우 encoding에 따라 2byte 3byte로 출력된다.
SELECT Lengthb('정현목') FROM dual;

--이름의 자리수 출력
SELECT ename, Length(ename) AS "이름의 길이" FROM emp;

-- concat(여기안에는 2개)
SELECT concat(ename,sal) FROM emp;
SELECT  ename || job || sal FROM emp;

-- substr 20
SELECT job, substr(job,1,2) FROM emp;

--뒤서 3글마만 출력
SELECT  job ,SUBSTR(job,LENGTH(job) - 2,LENGTH(job)) FROM emp;
SELECT  job ,SUBSTR(job,-3) FROM emp;

-- instr();
SELECT instr('oracle database 21c release', 'database') FROM dual;
--[] 안에 ^은 부정의 의미로 쓰인다. []범위 지정
SELECT regexp_instr('oracle database 21c release', '[^a-z]') FROM dual;
SELECT regexp_instr('oracle database [21c] release', '\[21c\]') FROM dual;
--^은 시작을 따질때 oracle로 시작하기 때문에
SELECT regexp_instr('oracle database 21c release', '^oracle') FROM dual;

-- $은 시작을 따질때 oracle로 시작하기 떄문에
SELECT regexp_instr('oracle database', 'oracle$') FROM dual;
SELECT regexp_instr('oracle database', 'database$') FROM dual;

--like
SELECT * FROM emp WHERE ename LIKE '%S%';

--instr로 위에 like처럼 사용해보
SELECT * FROM emp WHERE instr(ename, 'S') > 0;

--replace()
SELECT '010-1111-2222' AS original,
		REPLACE('010-1111-2222', '-','/') AS "-를 /로 대체"
	 	FROM dual;

SELECT '010-1111-2222' AS original,
		REPLACE('010-1111-2222', '-', "") AS "-" -- 공백으로 주거나 안쓰면 그냥 01011112222로 된다.
	 	FROM dual;

--LPAD, RPAD
SELECT 'oracle', lpad('oracle', 10, '#') FROM dual;
SELECT 'oracle', rpad('oracle', 10, '#') FROM dual;
SELECT RPAD('950119-', 14, '*') FROM dual;

--ename의 두글자만 남지고 앞은 전부 *로 채우기
SELECT LPAD(SUBSTR(ENAME, -2),LENGTH(ename),'*')   FROM emp;
SELECT rPAD(SUBSTR(ENAME,1, 2),LENGTH(ename),'*')   FROM emp;


SELECT * FROM emp;

SELECT TRIM('     oracle database     ') AS trim,  
		LTRIM('     oracle database     ') AS lefttrim,
		RTRIM('     oracle database     ') AS righttrim FROM dual;

SELECT REPLACE('  oracle  aa', ' ','') FROM dual;

SELECT LTRIM('0001234', '0') FROM dual;

--오라클은 숫자에 타입없음
SELECT ROUND(1234.5678) AS round1,
		ROUND(1234.5678,0) AS round2,
		ROUND(1234.5678,1) AS round3,
		ROUND(1234.5678,2) AS round4
		FROM dual;

SELECT ROUND(1234.5678, -1) AS round1, -- -1,-2을 사용하면 1230 1200  그자리에서 반올림을 해버린다.
		ROUND(1234.5678, -2) AS round2
		FROM dual;
-- trunc는 오라클 전용이다. 다른 db에서는 사용이 불가능하다.
SELECT TRUNC(1234.5678) AS trunc, -- trunc는 그냥 소수점을 버린다.
		trunc(1234.5678, 1) AS trunc1,
		trunc(1234.5678, -1) AS trunc2
FROM dual; 

--with는 임시 데이터를 만들때 많이 쓴다.
WITH temp AS (
	SELECT TO_DATE('2023-09-06 12:38:30', 'YYYY-MM-DD HH24:MI:SS') dt
	FROM dual
)
SELECT dt, TRUNC(dt, 'YYYY')  FROM temp;

SELECT 
	CEIL(112.1), --ceil이랑 floor는 뒤에 조건이 따로 붙지 않는다. 위에 와는 다르게
	FLOOR(112.1)
	FROM dual;
	
SELECT  CEIL(-2.5),
		FLOOR(-2.5)
		FROM dual;




------ 날짜 함수 알아보기 --------
SELECT sysdate FROM dual;

SELECT SYSDATE -1 AS yesterday FROM dual;

SELECT MONTHS_BETWEEN('23/09/06', '23/08/11') FROM dual; -- 1개월 미만이면 0.xxxx가 나오고 1개월이상부터 1,2,3,4이런식으로 증가한다.

WITH emp AS(
	SELECT 1111 AS NO, '정현목' AS name, TO_DATE('1995-01-19', 'yyyy-mm-dd') AS hiredate FROM dual
	UNION ALL
	SELECT 1111 AS NO, '권은비' AS name, TO_DATE('2001-02-19', 'yyyy-mm-dd') AS hiredate FROM dual
)
--근속년수
SELECT name, trunc(MONTHS_BETWEEN(SYSDATE, hiredate)/12) AS 근속연수 FROM emp; 

SELECT * FROM emp;

SELECT  ename, TRUNC(MONTHS_BETWEEN(SYSDATE, hiredate)/12)  AS 근속연수 fROM emp; 
	
	
SELECT SYSDATE , ADD_MONTHS(sysdate,5) FROM dual;

SELECT ename, hiredate, ADD_MONTHS(hiredate,120) AS "10주" FROM emp;

SELECT round(SYSDATE) FROM dual;

SELECT round(SYSDATE, 'cc') FROM dual;
SELECT round(SYSDATE, 'YYYY') FROM dual;

--- 형변환

-- 묵시
SELECT 2 + '2' FROM dual;

-- TO_CHAR
SELECT SYSDATE , 
		TO_CHAR(SYSDATE, 'YYYY') AS yyyy,
		TO_CHAR(SYSDATE, 'Mon') AS "MON",
		TO_CHAR(SYSDATE, 'mm') AS "Mm",
		TO_CHAR(SYSDATE, 'month', 'NLS_DATE_LANGUAGE = ENGLISH') AS "MONTH",
		TO_CHAR(SYSDATE, 'DD') AS "DD",
		TO_CHAR(SYSDATE, 'DAY') AS "DAY",
		To_CHAR(SYSDATE, 'YYYY-MM-DD HH:MI:SS') AS "YYYY-MM-DD"
FROM dual;

SELECT hiredate FROM emp;
-- 87/JUL/13
SELECT TO_CHAR(hiredate,'YY/Mon/DD','NLS_DATE_LANGUAGE = ENGLISH') AS "YY-MM-DD" FROM  emp;
SELECT TO_CHAR(hiredate,'YY/') || TO_CHAR(hiredate,'MON','NLS_DATE_LANGUAGE = ENGLISH') || TO_CHAR(hiredate,'/DD') FROM emp;  

SELECT TO_CHAR(SYSDATE, 'D'),
		TO_CHAR(SYSDATE, 'DY'),
		TO_CHAR(SYSDATE, 'DAY')
FROM dual;

SELECT TO_CHAR(SYSDATE, 'DDD') AS "365",
		TO_CHAR(SYSDATE, 'WW') AS "몇주차",
		TO_CHAR(SYSDATE, 'Q') AS "몇분기"
FROM dual;

-- 숫자를 문자
SELECT 
	TO_CHAR(1234, '9999') AS "9999",
	TO_CHAR(1234, '99999') AS "공백9999",
	TO_CHAR(1234, '099999') AS "앞에 0추가",
	TO_CHAR(1234, '99999.99') AS "소수점 추가",
	TO_CHAR(12345, '99,999') AS ",추가"
	FROM dual;
	
SELECT TO_NUMBER('11') FROM dual;

SELECT NVL2(comm,'O','X') FROM emp;

SELECT ename, comm, NVL2(comm, sal * 12 + comm, sal * 12) AS "연봉" FROM emp;

	
	-- emp에서 사원번의 첫 두글자만 출력하고 나머지는 *로 채워 출력하고 사원이름의 첫글자만 출력하고 나머지는 *로 채우시오
SELECT * FROM emp;
SELECT RPAD(SUBSTR(empno ,1,2), LENGTH(EMPNO), '*'), RPAD(SUBSTR(ename, 1,1), LENGTH(ename),'*' ) FROM emp; 

--한달 근무일수를 21.5로 하고 하루 평균 8시간 근무한다고 했을때 사원들의 일당과 시급을 하시오. 일당은 소수점 세째자리느느 버리거 시급은 둘째자리에서 반올림
SELECT TRUNC(sal / 21.5, 2) AS "일당", ROUND((sal / 21.5)/8,2)   FROM emp;

--사원들의 입사일을 기준으로 3개월이 지난후 첫번째 월요일에 정직원으로 전환되는데 전환되는 날짜를 YYYY-MM-DD로 출력하시오
SELECT hiredate "입사일",TO_CHAR(NEXT_DAY(ADD_MONTHS(hiredate,3), '월요일'),'YYYY-MM-DD') AS 정직원 FROM emp;


	
	


