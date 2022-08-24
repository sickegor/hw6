package data;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.selector.ByText;
import com.github.javafaker.Faker;
import pages.Locators;

import java.io.File;



public class RegistrationFormPageObject {

    public void fillForm() {
        fillName(firstName);
        fillSurname(lastName);
        fillEmail(email);
        clickRadioButton();
        fillPhoneNumber(phoneNumber);
        fillPictureForm(pathFile);
        fillSubjects(subjects);
        clickHobbies(hobbiesText);
        fillAddress(addressText);
        clickState(ncrText);
        clickCity(cityText);
    }

    public void clickButton() {
        Locators.submitButton.click();
    }

    public void assertForm() {
        Locators.nameForm.shouldHave(Condition.text(submittingText));
    }

    private void fillName(String firstName) {
        Locators.name.setValue(firstName);
    }

    private void fillSurname(String lastName) {
        Locators.surname.setValue(lastName);
    }

    private void fillEmail(String email) {
        Locators.email.setValue(email);
    }

    private void clickRadioButton() {
        Locators.radioButton.click();
    }

    private void fillPhoneNumber(String phoneNumber) {
        Locators.phone.setValue(phoneNumber);
    }

    private void fillPictureForm(String pathFile) {
        Locators.picture.uploadFile(new File(pathFile));
    }

    private void fillSubjects(String subjects) {
        Locators.subjects.setValue(subjects);
    }

    private void clickHobbies(String hobbiesText) {
        Locators.hobbies.find(new ByText(hobbiesText)).click();
    }

    private void fillAddress(String addressText) {
        Locators.currentAddress.setValue(addressText);
    }

    private void clickState(String ncrText) {
        Locators.state.click();
        Locators.state.find(new ByText(ncrText)).click();
    }

    private void clickCity(String cityText) {
        Locators.city.click();
        Locators.city.find(new ByText(cityText)).click();
    }
}
