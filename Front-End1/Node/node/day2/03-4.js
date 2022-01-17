/*
    시스템 이벤트
    process 객체는 노드에서 항상 사용할 수 있는 객체
    on()과 emit() 메소드는 객체를 생성하거나 모듁을 가져오지 않아도 바로 사용가능
    on() 메소드를 호출하면서 이벤트 이름은 exit로 지정하면 내부적으로 프로세스가 끝날떄를 알수있음
*/

process.on("exit", () => {
  console.log("exit 이벤트 발생");
});

setTimeout(() => {
  console.log("3초 후 시스템 종료");
  process.exit;
}, 3000);
