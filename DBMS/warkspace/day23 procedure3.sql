--학점 출력 프로시저
CREATE OR REPLACE PROCEDURE GET_GRADE
(
	--외부에서 전달 받을 값
	SCORE NUMBER
)
IS
	--BEGIN에서 쓸 변수
	GRADE VARCHAR2(5);
BEGIN
	IF SCORE >=90 THEN GRADE := 'A';
	ELSIF SCORE >=80 THEN GRADE := 'B';
	ELSIF SCORE >=70 THEN GRADE := 'C';
	ELSIF SCORE >=60 THEN GRADE := 'D';
	ELSE GRADE := 'F';
	END IF;
	DBMS_OUTPUT.ENABLE;
	DBMS_OUTPUT.PUT_LINE('당신의 점수 : '||SCORE||'점'||CHR(10)||'학점 : '||GRADE);
END;

CALL GET_GRADE(100);

-----------------------------------------------------------------------------------------
--JOB_ID가 중복이 됬을때 업데이트가 된다.
CALL MY_NEW_JOB_PROC('IT','DEVELOPER',5000,20000);

SELECT * FROM JOBS;
------------------------------------------------------------------------------------------
CREATE OR RELEASE PROCEDURE DEL_JOB_PROC
(
	P_JOB_ID IN JOBS.JOB_ID%TYPE
)
IS 
	CNT NUMBER := 0;
BEGIN
	SELECT COUNT(JOB_ID) INTO CNT
	FROM JOBS WHERE JOB_ID = P_JOB_ID;
	--CNT가 0이라는 것은 삭제할 것이 있는것(중복이 있다는 뜻)
	IF CNT != 0 THEN DELETE 
		FROM JOBS 
		WHERE JOB_ID = P_JOB_ID;
		DBMS_OUTPUT.ENABLE;
		DBMS_OUTPUT.PUT_LINE('DELETE ALL ONE ABOUT'||' '||P_JOB_ID);
	ELSE
		DBMS_OUTPUT.ENABLE;
		DBMS_OUTPUT.PUT_LINE('NO EXIST'||' '||P_JOB_ID);	
	END IF;
END;













