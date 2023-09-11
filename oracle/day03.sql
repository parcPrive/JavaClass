---- JONT 테이블 붙혀서 옆으로 나열하기....
SELECT * FROM Emp;
SELECT * FROM dept;
SELECT * FROM emp, dept; --중복이 나온다.

--오라클 조인
SELECT * FROM emp, DEPT
	WHERE emp.deptno = dept.DEPTNO;
--- ANSI 조인
SELECT * FROM emp JOIN dept
	ON emp.deptno = dept.deptno;

SELECT empno, ename, emp.deptno, dname, loc FROM emp JOIN dept
	ON emp.deptno = dept.deptno
	ORDER BY deptno;

--- empno, ename, sal, deptno ,dname, loc가 궁금한데 월급이 3000이상만
SELECT empno, ename, sal, emp.deptno, dname, loc FROM emp JOIN dept
	ON emp.deptno = dept.deptno
	WHERE sal >= 3000
	ORDER BY sal;

SELECT * FROM salgrade;
SELECT * FROM emp;
-- emp에서 월급이 salgrade에 있는 사람만 출력해보기 
--내 풀이 ansi
SELECT ename, grade, sal FROM emp JOIN salgrade
	ON emp.sal BETWEEN salgrade.LOSAL AND salgrade.HISAL;
-- 강사님 풀이 이것도 오라클
SELECT * FROM emp e, SALGRADE s
WHERE e.sal BETWEEN  s.LOSAL AND s.HISAL;

--job이 manager인 사람의 부서 번호와 부서이름 출력, 오라클버전
SELECT * FROM EMP e ,DEPT d 
	WHERE e.DEPTNO = d.DEPTNO AND e.JOB = 'MANAGER';
-- ansi
SELECT * FROM EMP e JOIN DEPT d
	ON e.DEPTNO = d.DEPTNO 
	WHERE e.job = 'MANAGER';
	
----데이터 하나 넣기
INSERT INTO emp (empno,ename)
	values(8000, 'micheal');
--오라클
select e1.empno, e1.ename, e1.mgr, e2.empno AS "매니저 사원 번호", e2.ename AS "매니저 이름" from emp e1, emp e2
WHERE e1.mgr = e2.empno(+);

--ansi
select e1.empno, e1.ename, e1.mgr, e2.empno AS "매니저 사원 번호", e2.ename AS "매니저 이름" from emp e1 LEFT JOIN emp e2
	ON e1.mgr = e2.empno;

with emp AS(
	SELECT 1111 empno, 'KING' ename, 'PRESIDENT' job, NULL mgr, 40 deptno,13 locno FROM dual UNION ALL
	SELECT 2222 empno, 'BLAKE' ename, 'MANAGER' job, 1111 mgr, 30 deptno, 11 locno FROM dual UNION ALL
	SELECT 3333 empno, 'CLARK' ename, 'MANAGER' job, 1111 mgr, 10 deptno, 12 locno FROM dual UNION ALL
	SELECT 4444 empno, 'SCOTT' ename, 'MANAGER' job, 1111 mgr, 20 deptno, 13 locno FROM 
),
dept AS(
	SELECT 10 deptno, 'CEO'	  dname, 13 locno FROM dual UNION ALL
	SELECT 20 deptno, 'IT' 	  dname, 11 locno FROM dual UNION ALL
	SELECT 30 deptno, 'SALES' dname, 12 locno FROM dual UNION ALL
	SELECT 40 deptno, 'DB' 	  dname, 13 locno FROM 
),
loc AS(
	SELECT 11 locno, 'seoul' 	localname, FROM dual UNION ALL
	SELECT 12 locno, 'bundang' 	localname, FROM dual UNION ALL
	SELECT 13 locno, 'ilsan' 	localname, FROM dual
)
SELECT * FROM  emp;
SELECT e.empno, e.ename, e.job, d.deptno, d.dname FROM emp e 
INNER JOIN dept d ON e.deptno = d.deptno;

SELECT * FROM EMP;
SELECT * FROM DEPT d ;
-- 급여가 2000 초과인 사원들의 부서 정보, 사원 정보를 아래와 같이 출력
SELECT * FROM EMP e
JOIN DEPT d ON e.DEPTNO = d.DEPTNO
WHERE e.sal > 2000;

-- 각 부서별 평균 급여, 최대 급여, 최소급여, 사원수를 출력해라
SELECT d.deptno, AVG(e.sal), MAX(e.sal), MIN(e.sal),COUNT(e.DEPTNO)  FROM EMP e JOIN DEPT d ON e.DEPTNO = d.DEPTNO 
GROUP BY d.DEPTNO ORDER BY DEPTNO;



-- 모든 부서 정보와 사원 정보를 아래와 같이 부서 번호, 사원 이름순으로 정렬해서 출력
SELECT d.deptno,d.dname, e.empno, e.ename, e.job, e.sal FROM EMP e
JOIN DEPT d ON e.DEPTNO  = d.DEPTNO
ORDER BY d.DEPTNO,e.ENAME;



-- 모든 부서 정보, 사원 정보, 급여 등급 정보, 각 사원의 직속 상관의 정보를 부서 번호, 사원 번호 순서로 정렬
SELECT d.deptno, d.dname, e.empno, e.ename, mgr, sal, d.deptno, s.losal, s.hisal, s.GRADE, e1.empno, e1.ename FROM EMP e 
JOIN DEPT d ON e.DEPTNO = d.DEPTNO.
JOIN SALGRADE s ON sal BETWEEN s.LOSAL AND s.HISAL
JOIN emp e1 ON e.mgr = e1.empno
ORDER BY .DEPTNO , e.empno;







