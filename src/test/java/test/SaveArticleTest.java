package test;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import page.MainPage;

import static com.codeborne.selenide.Selenide.back;

@Owner("ibokov")
@Feature("Сохранение статьи")
class SaveArticleTest extends TestBase {

    @Test
    @DisplayName("Проверка сохранения статьи")
    void saveArticleTest() {
        back();
        mainPage.searchArticle("BrowserStack")
                .openArticle()
                .saveArticle()
                .returnToMainPage()
                .openSavedArticle()
                .checkDecriptionSavedArticle("1 article, 0.18 MB");
    }
}