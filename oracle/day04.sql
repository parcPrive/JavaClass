----dml
-- create는 auto commit이다.
CREATE TABLE emp02 AS SELECT * FROM emp;
SELECT * FROM emp02;
DROP TABLE emp02; -- 테이블을 삭제할수있다.
DROP TABLE emp02 CASCADE constraints; -- 테이블 삭제시 연결된 테이블도 삭제할수있다.
create TABLE emp02 AS SELECT * FROM emp WHERE 1 <> 1; --테이블 복사를하는데 culmn만 들고온다.

CREATE TABLE my_table (
	NO    number(3),
	name  varchar2(100),
	birth date
);

-- sequence??

SELECT * FROM my_table;
INSERT INTO my_table (NO,name,birth) VALUES (1,'정현목',sysdate);
INSERT INTO my_table VALUES (3,'권은비',sysdate);
INSERT INTO my_table (NO,name) VALUES (1,'도로');
INSERT INTO my_table  VALUES (1,'졸리다','2023-09-15');
INSERT INTO my_table  VALUES (5,'돈없다', to_date('08-09-2923', 'DD-MM-YYYY'));
COMMIT;
--수정
UPDATE my_table SET name = '유재석' WHERE NO = 2;
UPDATE my_table SET name = '어피치', birth = sysdate WHERE name = '도로';

--- 삭제
DELETE FROM my_table WHERE NO = 3;
--insert into, update set, select from, delete from

CREATE TABLE dept02 AS SELECT * FROM dept WHERE 1<>1;
-- CREATE TABLE dept02 AS SELECT * FROM dept WHERE 1 = 0;  이건 뭔지 한번 확인해보
SELECT * FROM dept02;

INSERT INTO dept02 VALUES (80, 'css', 'jeju');
INSERT INTO dept02 VALUES (70, 'c##', 'daegu');
INSERT INTO dept02 VALUES (50, 'oracle', 'busan');
INSERT INTO dept02 VALUES (60, 'java', 'ilsan');

--emp02를 데이터를 복사해서 만든 다음 30번 부서에서 근무하는 사원들의 평균 급여보다 많은 급여를 받고 있는 사원들을 50번 부서로 바꾸시오
CREATE TABLE emp02 AS SELECT * FROM emp;
SELECT * FROM emp02;
SELECT * FROM emp02 WHERE sal > 2073;
UPDATE  emp02 SET deptno = 50 WHERE sal > (SELECT avg(sal) FROM emp02 WHERE deptno = 30);

-- emp02에서 10번 부서에서 근무하는 사원중에 입사일이 가장 빠른 사원보다 늦게 입사한 사원의 급여를 10%인상하고 60번 부서로 옮겨라.
SELECT * FROM emp02 WHERE deptno = 10 ORDER BY hiredate;
UPDATE emp02 SET sal = sal * 1.1, deptno = 60 WHERE empno > 7782;

-- emp02 에서 salgrade가 5인 사원을 삭제하시오.
SELECT * FROM emp02 JOIN SALGRADE s ON sal BETWEEN s.LOSAL AND s.HISAL WHERE GRADE = 5;
SELECT * FROM SALGRADE s ;
DELETE FROM emp02 WHERE sal > 3000 AND sal < 9999;



