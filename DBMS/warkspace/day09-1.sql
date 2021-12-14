SELECT * FROM PLAYER;
COMMIT;

-- player 테이블 에서 팀 아이디가 'K01'인 선수 이름을 내 이름으로 바꾸기
SELECT * FROM PLAYER WHERE TEAM_ID = 'K01';

UPDATE PLAYER
SET PLAYER_NAME='홍길동'
WHERE TEAM_ID='K01';
ROLLBACK;

--PLAYER 테이블에서 포지션이 MF인 선수 삭제
DELETE FROM PLAYER
WHERE "POSITION"='MF';

--PLAYER 테이블에서 키가 180이상인 선수 삭제
DELETE FROM PLAYER
WHERE HEIGHT>=180;

SELECT * FROM PLAYER WHERE HEIGHT>=180;

--AS(ALIAS) : 별칭
-- SELECT 절 : AS뒤에 별칭을 작성, 한칸 띄우고 작성
SELECT PLAYER_ID AS 선수번호 FROM PLAYER;
SELECT PLAYER_ID AS "선수 번호" FROM PLAYER;
SELECT PLAYER_ID  "선수번호" FROM PLAYER;
SELECT PLAYER_ID "선수번호",PLAYER_NAME "이름" FROM PLAYER;

SELECT BACK_NO "등 번호", NICKNAME "선수별명" FROM PLAYER;

-- FROM 절
SELECT P.TEAM_ID "선수 테이블",T.TEAM_ID "팀 테이블" FROM PLAYER P,TEAM T;
