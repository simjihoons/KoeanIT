$(function () {
  let current = 0;
  $("#btns > li").click(function () {
    let i = $(this).index();
    move(i);
  });

  //자동 실행 함수
  //setInterval(실행문 , 시간)
  timer();
  function timer() {
    setInterval(() => {
      let n = current + 1;
      if (n > 3) n = 0;
      move(n);
    }, 3000);
  }

  //애니메이션 함수
  function move(n) {
    if (current == n) {
      return;
    } else {
      let currentEl = $("#view ul li").eq(current);
      let nextEl = $("#view ul li").eq(n);

      currentEl.css({ left: "0%" }).animate({ left: "-100%" });
      nextEl.css({ left: "100%" }).animate({ left: "0%" });
      current = n;
    }
  }
});
