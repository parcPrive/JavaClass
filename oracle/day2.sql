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

-----mod----
SELECT mod(10,3) FROM dual;
SELECT floor(10/3) FROM dual; -- mysql에서도 사용가
-- SELECT TRUNC(10 / 3) FROM dual; trunc 오라클 전

----decode
WITH temp AS (
	SELECT 'M' gender FROM dual UNION ALL 
	SELECT 'F' gender FROM dual UNION ALL
	SELECT 'X' gender FROM dual
)
SELECT gender, DECODE(gender,'M','남자','F','여자','X','기타') gender02 FROM temp; 
SELECT gender FROM temp;

SELECT job, DECODE(job,'CLERK','사원','ALALYST','분석가','SALESMAN','영업사원','MANAGER','관리자','PRESIDENT','회장님') AS jobname FROM emp; 

-- salesman 10%, manager 5%, analysy 0% 나머지는 3% decode는 오라클에서만...
SELECT ename, job, sal, DECODE(job, 'SALESMAN', sal * 1.1, 'MANAGER', sal * 1.5, 'ANALYST',sal, sal * 1.03) AS AFTER FROM emp; 

--case when
SELECT ename, job, sal, CASE job 
	WHEN 'SALESMAN' THEN sal * 1.1
	WHEN 'MANAGER' THEN sal * 1.5
	WHEN 'ANALYST' THEN sal
	ELSE sal * 1.03
	END AS "인상된 월급"
FROM emp;

--- deptno 10번이면 localtion 부산 20번이면 분당 30번이면 서울
SELECT ename, deptno, CASE deptno
	WHEN 10 THEN '부산'
	WHEN 20 THEN '분당'
	WHEN 30 THEN '서울'
	END AS location
	FROM emp;

SELECT ename, sal, CASE  -- case옆에 sal을 빼준다.
	WHEN sal >= 2900 THEN '다이아몬드'
	WHEN sal >= 2700 THEN '에메랄드'
	WHEN sal >= 2000 THEN '골드'
	ELSE '똥'
	END AS "등급"
	FROM emp;

--커미션이 없는사람은 해당사항 없음
SELECT ename, comm, CASE
	WHEN comm IS NULL THEN '해당사항 없음'
	WHEN comm = 0 THEN '커미션 없'
	--WHEN comm > 0 THEN  '커미션: ' || comm
	ELSE '커미션 : ' || comm
	END AS comm_kor
	FROM emp;

-- count 중복확인
--SELECT COUNT(ename)

---부서번호가 30번인 사람들의 평균월급
SELECT avg(sal) FROM emp WHERE DEPTNO = 10 UNION ALL 
SELECT avg(sal) FROM emp WHERE DEPTNO = 20 UNION ALL 
SELECT avg(sal) FROM emp WHERE DEPTNO = 30;

SELECT avg(sal), DEPTNO FROM emp GROUP BY deptno;

--직업별로 월급합
SELECT sum(sal), job FROM emp GROUP BY job;

-- 부서별 평균
SELECT avg(sal), job ,deptno FROM emp 
	GROUP BY  DEPTNO,job
	ORDER BY DEPTNO ; -- 정렬은 제일 마지막에...

-- 월급에 comm 포함한 금액을 부서별 출력
SELECT  sum(sal + nvl(comm,0)), deptno FROM emp 
	GROUP BY DEPTNO,job
	ORDER BY deptno,job;

--부서별 월급의 평균이 2000이상인사람 group by를 통해 그룹핑을 했다면 조건은 where이 아닌 having으로 한다.
-- where > group  by > having > order by
SELECT deptno, avg(sal) FROM emp 
	--WHERE DEPTNO > 10
	GROUP BY DEPTNO
	HAVING avg(SAL) > 2000;

--부서번호, 직업, 평균월급을 출력하는데 월급은 3000이상은 제외하고 평균 월급이 2000이상 출력 deptno로 정렬까지

SELECT AVG(sal), job, deptno FROM emp
	WHERE sal <= 3000
	GROUP BY DEPTNO, JOB
	HAVING avg(sal) >= 2000
	ORDER BY DEPTNO;

-- 아이디 중복 따져보기...
SELECT * FROM emp;
SELECT COUNT(ename) AS RESULT FROM emp WHERE ename = 'SCOTT';

SELECT deptno, job, count(*), max(sal), sum(sal), avg(sal) FROM emp GROUP BY DEPTNO , job ORDER BY deptno,job;

SELECT deptno, job, count(*), max(sal), sum(sal), avg(sal) FROM emp 
	GROUP BY (DEPTNO, job)
	ORDER BY deptno,job;

--소계 
SELECT job, deptno, sum(sal)
FROM EMP
GROUP BY ROLLUP (DEPTNO, job)
ORDER BY DEPTNO , JOB ;


-- grouping set set으로 묶어서 출
SELECT job, deptno, count(*) AS count
FROM EMP
GROUP BY GROUPING SETS(job, deptno)
ORDER BY job, deptno;

-- roll up(둘다 묶어서 소계 합계 다 출력)
SELECT job, deptno, count(*) AS count
FROM EMP
GROUP BY ROLLUP (job, deptno)
ORDER BY job, deptno;


SELECT job, mgr, deptno, count(*) AS count
FROM EMP
GROUP BY GROUPING SETS((mgr,job), (job,deptno));



SELECT job, deptno, count(*) AS count
FROM EMP
GROUP BY GROUPING SETS ((job,deptno),())
ORDER BY deptno;

--나올 수 있는 경우의 수 다 따져 준다.
SELECT job, deptno,sum(sal) FROM EMP
GROUP BY CUBE(job,deptno);

--문자 연결해서 출력
SELECT LISTAGG(ename,',') WITHIN group(ORDER BY ename)
FROM emp
WHERE job IN ('CLERK','MANAGER');

-- 버전이 낮은데서는 못씀 (19c이상)
SELECT LISTAGG(DISTINCT DEPTNO ,',') WITHIN group(ORDER BY DEPTNO) AS "부서번"
FROM emp
WHERE job IN ('CLERK','MANAGER');