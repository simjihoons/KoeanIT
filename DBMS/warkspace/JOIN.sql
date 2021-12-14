--EMP 테이블 사원번호로 DEPT 테이블의 지역 검색
SELECT * FROM EMP;
SELECT * FROM DEPT;



SELECT EMP.DEPTNO,EMP.ENAME ,EMP.JOB ,DEPT.LOC FROM EMP JOIN DEPT
ON EMP.DEPTNO = DEPT.DEPTNO;

--PLAYER 테이블에서 송종국 선수가 속한 팀의 전화번호 검색하기
SELECT * FROM PLAYER;
SELECT * FROM TEAM;

SELECT T.TEAM_ID,P.PLAYER_ID , P.PLAYER_NAME , T.TEAM_NAME , T.TEL FROM PLAYER P JOIN TEAM T
ON P.TEAM_ID = T.TEAM_ID AND P.PLAYER_NAME='송종국';

--JOBS 테이블에서 JOB_ID로 EMPLOYESS의 EMAIL,성,이름 검색
SELECT * FROM JOBS;
SELECT * FROM EMPLOYEES;

--등가 조인
SELECT J.JOB_ID , J.JOB_TITLE , E.EMAIL , E.LAST_NAME ||' '|| E.FIRST_NAME "이름"
FROM JOBS J JOIN EMPLOYEES E
ON J.JOB_ID = E.JOB_ID;

--비등가 조인
--급여로 등급 나누기
SELECT * FROM SALGRADE;
SELECT * FROM EMP;

SELECT * FROM SALGRADE S JOIN EMP E
ON E.SAL BETWEEN S.LOSAL AND S.HISAL;


SELECT E.EMPNO , D.DNAME , E.ENAME , S.GRADE , E.SAL FROM SALGRADE S JOIN EMP E
ON E.SAL BETWEEN S.LOSAL AND S.HISAL
JOIN DEPT D
ON E.DEPTNO = D.DEPTNO;













