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

  // リンクをクリックしたときメニューを閉じる
  $(".gnav__item a").on("click", function () {
    $("#hamburger").removeClass("open");
    $("#gnav").hide();
    $(".header .container").removeClass("container-open");
  });

  const label = $("#hamburger").find(".hamburger-label");
  label.text("Menu");

  // works表示制限
  let visibleCount; // 最初に表示する個数

  // 画面幅によって表示数を変更
  if ($(window).width() <= 768) {
    // スマホの場合
    visibleCount = 4;
  } else {
    // PCの場合
    visibleCount = 6;
  }

  $(".works__item").slice(visibleCount).addClass("hidden");

  // 1回のクリックですべて表示
  $(".works__more-button").on("click", function (e) {
    e.preventDefault();
    $(".works__item.hidden").removeClass("hidden");
    $(this).fadeOut();
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

  // worksスライドショー
  document.addEventListener("DOMContentLoaded", () => {
    let currentIndex = 0;
    const slides = document.querySelectorAll(".slide-item");
    const totalSlides = slides.length;

    document.getElementById("next").addEventListener("click", () => {
      moveToNextSlide();
    });

    document.getElementById("prev").addEventListener("click", () => {
      moveToPrevSlide();
    });

    function moveToNextSlide() {
      if (currentIndex < totalSlides - 1) {
        currentIndex++;
      } else {
        currentIndex = 0;
      }
      updateSlidePosition();
    }

    function moveToPrevSlide() {
      if (currentIndex > 0) {
        currentIndex--;
      } else {
        currentIndex = totalSlides - 1;
      }
      updateSlidePosition();
    }

    function updateSlidePosition() {
      const newTranslateValue = -currentIndex * 100;
      slides.forEach((slide) => {
        slide.style.transform = `translateX(${newTranslateValue}%)`;
      });
    }
  });
});
