package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Owner("sergeyglukhov")
@Tags({@Tag("local"), @Tag("browserstack")})
@DisplayName("Тесты для мобильного приложения Wikipedia")
public class UniversalWikiMobileTests extends TestBase{

    @Test
    @DisplayName("Успешное прохождение стартовых экранов и проверка компонентов на главном экране")
    void searchNewWikiTest() {
        startScreen.verifyWelcomePage("The Free Encyclopedia …in over 300 languages")
                .clickOnForwardButton()
                .verifyWelcomePage("New ways to explore")
                .clickOnForwardButton()
                .verifyWelcomePage("Reading lists with sync")
                .clickOnForwardButton()
                .verifyWelcomePage("Data & Privacy")
                .clickOnDoneButton();

        mainScreen.checkThatSearchContainerIsVisible()
                .checkThatHeaderImageIsVisible()
                .checkHeader("Customize your Explore feed");
    }
}
