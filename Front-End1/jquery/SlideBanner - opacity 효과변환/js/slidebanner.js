$(function () {
  let current = 0;
  let setIntervalID;

  //첫번쨰 버튼에 현재 이미지가 보이니까 주석으로 클랙스 적용
  $("#btns > li").eq(0).addClass("on");

  $("#btns > li").click(function () {
    let i = $(this).index();

    $("#btns > li").removeClass("on");
    $(this).addClass("on");

    move(i);
  });

  //left right 버튼 눌렀을때 이동
  $(".l_mn").click(function () {
    let n = current - 1;
    if (n == -1) n = 3;
    $("#btns > li").removeClass("on");
    $("#btns > li").eq(n).addClass("on");
    move(n);
  });
  $(".r_mn").click(function () {
    let n = current + 1;
    if (n == 4) n = 0;
    $("#btns > li").removeClass("on");
    $("#btns > li").eq(n).addClass("on");
    move2(n);
  });

  //자동실행되는 함수를 제어
  $("#wrap").on({
    mouseover: function () {
      clearInterval(setIntervalID);
    },
    mouseout: function () {
      timer();
    },
  });

  //자동 실행 함수
  //setInterval(실행문 , 시간) 시간차를 자동으로 실행
  //clearInterval() : sectInterval()를 중지하는 명령
  timer();
  function timer() {
    setIntervalID = setInterval(() => {
      let n = current + 1;
      if (n > 3) n = 0;
      $("#btns > li").removeClass("on");
      $("#btns > li").eq(n).addClass("on");
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

      currentEl.css({ opacity: 1 }).animate({ opacity: 0 });
      nextEl.css({ opacity: 0 }).animate({ opacity: 1 });
      current = n;
    }
  }

  function move2(n) {
    if (current == n) {
      return;
    } else {
      let currentEl = $("#view ul li").eq(current);
      let nextEl = $("#view ul li").eq(n);

      currentEl.css({ opacity: 1 }).animate({ opacity: 0 });
      nextEl.css({ opacity: 0 }).animate({ opacity: 1 });
      current = n;
    }
  }
});
