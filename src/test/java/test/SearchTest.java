package test;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import page.MainPage;

import static com.codeborne.selenide.Selenide.back;

@Owner("ibokov")
@Feature("Поиск статьи")
class SearchTest extends TestBase {

    @Test
    @DisplayName("Проверка поиска статьи")
    void searchTest() {
        back();
        mainPage.searchArticle("BrowserStack")
                .checkCountArticle();
    }
}