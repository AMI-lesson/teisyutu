$(function () {
  $("#hamburger").on("click", function () {
    $(this).toggleClass("open");
    $("#gnav").stop().slideToggle();

    // テキストの切り替え
    const label = $(this).find(".hamburger-label");
    if ($(this).hasClass("open")) {
      label.text("Close");
    } else {
      label.text("Menu");
    }
  });
});
