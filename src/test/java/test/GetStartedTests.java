package test;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import page.GetStartedPage;
import page.MainPage;

import static com.codeborne.selenide.Selenide.back;

@Owner("ibokov")
@Feature("Начальная страница")
public class GetStartedTests extends TestBase {

    @Test
    @DisplayName("Проверка страниц онбординга")
    void onboardPagesTest() {
        getStartedPage.checkTextOnFirstPage()
                .openNextPage()
                .checkTextSecondPage()
                .openNextPage()
                .checkTextThirdPage()
                .openNextPage()
                .checkTextFourthPage();
    }

    @Test
    @DisplayName("Проверка объявления на стартовой странице")
    void announcementOnStartPageTest() {
        back();
        mainPage.checkAnnounecementText();
    }
}