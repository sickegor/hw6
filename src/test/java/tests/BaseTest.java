package tests;

import com.codeborne.selenide.Configuration;
import data.Service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    RegistrationFormPageObject registration = new RegistrationFormPageObject();

    @BeforeEach
    void openPage() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        open("https://demoqa.com/automation-practice-form");
    }

    @Test
    void fillFormTest() {
        registration.fillForm();
        registration.clickButton();
        registration.assertForm();
    }
}
