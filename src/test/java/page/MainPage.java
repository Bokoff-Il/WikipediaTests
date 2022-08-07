package page;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.back;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

public class MainPage {
    SelenideElement searchContainer = $(AppiumBy.id("org.wikipedia.alpha:id/search_container"));
    SelenideElement searchField = $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text"));
    SelenideElement announcementText = $(AppiumBy.id("org.wikipedia.alpha:id/view_announcement_text"));
    SelenideElement savedArticle = $(AppiumBy.id("org.wikipedia.alpha:id/nav_tab_reading_lists"));
    SelenideElement saveArticleButton = $(AppiumBy.id("org.wikipedia.alpha:id/page_save"));
    SelenideElement descriptionSavedArticle = $(AppiumBy.id("org.wikipedia.alpha:id/item_reading_list_statistical_description"));
    ElementsCollection articleList = $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"));

    @Step("Поиск статьи по наименованию")
    public MainPage searchArticle(String text) {
        searchContainer.click();
        searchField.sendKeys(text);
        return this;
    }

    @Step("Проверка что статья найдена")
    public MainPage checkCountArticle() {
        articleList.shouldHave(CollectionCondition.sizeGreaterThan(0));
        return this;
    }

    @Step("Открыть найденную статью")
    public MainPage openArticle() {
        articleList.get(0).click();
        return this;
    }

    @Step("Сохранить статью")
    public MainPage saveArticle() {
        saveArticleButton.click();
        return this;
    }

    @Step("Проверка текста на начальном экране")
    public MainPage checkAnnounecementText() {
        announcementText.shouldHave(text("Customize your Explore feed You can now choose what to show on your feed," +
                " and also prioritize your favorite types of content."));
        return this;
    }

    @Step("Открыть сохраненные статьи")
    public MainPage openSavedArticle() {
        savedArticle.click();
        return this;
    }

    @Step("Проверить описание сохраненной статьи")
    public MainPage checkDecriptionSavedArticle(String text) {
        descriptionSavedArticle.shouldHave(text(text));
        return this;
    }

    @Step("Закрыть статью и вернуться на главный экран")
    public MainPage returnToMainPage() {
        back();
        back();
        back();
        return this;
    }
}