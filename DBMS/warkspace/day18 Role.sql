--ROLE : ������ �����ִ�(���ִ�) ����
-- CONNECT , RESOURCE , DBA
-- GRANT ���Ѹ�(ROLE�̸�),���Ѹ�2 --- TO ������;
-- REVOKE ���Ѹ�(ROLE�̸�) FROM ������;


--A��� ������ ���̺� DML�� ����ϱ� ���ؼ��� A�������� ������ �ο��޾ƾ� �Ѵ�.
CREATE TABLE COPY_PLAYER AS SELECT * FROM HR.PLAYER;
SELECT * FROM COPY_PLAYER CP JOIN HR .TEAM T ON CP.TEAM_ID = T.TEAM_ID;

--SCOTT ���̺��� SALGRADE�� ������ �� GRADE �÷����� LEVEL�� ���� ,���� �ݴ�� �ٲٱ� (5����� ���� ������ 1�������)

--cmd
--sqlplus scott/tiger
--grant select on SALGRADE to flower;
CREATE TABLE SALGRADE AS SELECT * FROM SCOTT.SALGRADE;