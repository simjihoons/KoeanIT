--���� ��� ���ν���
CREATE OR REPLACE PROCEDURE GET_GRADE
(
	--�ܺο��� ���� ���� ��
	SCORE NUMBER
)
IS
	--BEGIN���� �� ����
	GRADE VARCHAR2(5);
BEGIN
	IF SCORE >=90 THEN GRADE := 'A';
	ELSIF SCORE >=80 THEN GRADE := 'B';
	ELSIF SCORE >=70 THEN GRADE := 'C';
	ELSIF SCORE >=60 THEN GRADE := 'D';
	ELSE GRADE := 'F';
	END IF;
	DBMS_OUTPUT.ENABLE;
	DBMS_OUTPUT.PUT_LINE('����� ���� : '||SCORE||'��'||CHR(10)||'���� : '||GRADE);
END;

CALL GET_GRADE(100);

-----------------------------------------------------------------------------------------
--JOB_ID�� �ߺ��� ������ ������Ʈ�� �ȴ�.
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
	--CNT�� 0�̶�� ���� ������ ���� �ִ°�(�ߺ��� �ִٴ� ��)
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













