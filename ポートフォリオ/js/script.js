$(function () {
  // ハンバーガー
  $("#hamburger").on("click", function () {
    $(this).toggleClass("open");
    $("#gnav").stop().slideToggle();

    // .header の中の .container のみに open をトグル
    $(".header .container").toggleClass("container-open");

    const label = $(this).find(".hamburger-label");
    if ($(this).hasClass("open")) {
      label.text("Close");
    } else {
      label.text("Menu");
    }
  });

  // works表示制限
  const visibleCount = 4; // 最初に表示する個数
  const loadCount = 2; // クリックで追加表示する個数

  $(".works__item").slice(visibleCount).addClass("hidden");

  $(".works__more-button").on("click", function (e) {
    e.preventDefault();
    $(".works__item.hidden").slice(0, loadCount).removeClass("hidden");
    if ($(".works__item.hidden").length === 0) {
      $(this).fadeOut();
    }
  });

  // スクロールしたときにボタンを表示
  window.onscroll = function () {
    scrollFunction();
  };

  function scrollFunction() {
    const btn = document.getElementById("scrollToTopBtn");
    if (
      document.body.scrollTop > 20 ||
      document.documentElement.scrollTop > 20
    ) {
      btn.style.display = "block";
    } else {
      btn.style.display = "none";
    }
  }

  // ボタンをクリックしたときにトップに戻る
  document.getElementById("scrollToTopBtn").onclick = function () {
    window.scrollTo({ top: 0, behavior: "smooth" });
  };
});
