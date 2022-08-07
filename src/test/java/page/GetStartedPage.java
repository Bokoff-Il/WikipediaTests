package page;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

public class GetStartedPage {

    SelenideElement firstPageTitle = $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"));
    SelenideElement nextPageButton = $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"));
    SelenideElement textOnePage = $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"));

    @Step("Проверить текст на первой странице")
    public GetStartedPage checkTextOnFirstPage() {
        firstPageTitle.shouldHave(Condition.text("The Free Encyclopedia"));
        return this;
    }

    @Step("Перейти на следующую страницу")
    public GetStartedPage openNextPage() {
        nextPageButton.click();
        return this;
    }

    @Step("Проверить текст на второй странице")
    public GetStartedPage checkTextSecondPage() {
        textOnePage.shouldHave(Condition.text("New ways to explore"));
        return this;
    }

    @Step("Проверить текст на третьей странице")
    public GetStartedPage checkTextThirdPage() {
        textOnePage.shouldHave(Condition.text("Reading lists with sync"));
        return this;
    }

    @Step("Проверить текст на четвертой странице")
    public GetStartedPage checkTextFourthPage() {
        textOnePage.shouldHave(Condition.text("Send anonymous data"));
        return this;
    }
}