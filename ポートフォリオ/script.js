$(function () {
  // ハンバーガー
  $("#hamburger").on("click", function () {
    $(this).toggleClass("open");
    $("#gnav").stop().slideToggle();

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

  $(".works-item").slice(visibleCount).addClass("hidden");

  $(".more-button").on("click", function (e) {
    e.preventDefault();
    $(".works-item.hidden").slice(0, loadCount).removeClass("hidden");
    if ($(".works-item.hidden").length === 0) {
      $(this).fadeOut();
    }
  });
});
