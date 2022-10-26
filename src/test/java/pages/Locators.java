package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Locators {


    static public SelenideElement
            name = $("#firstName"),
            surname = $("#lastName"),
            userEmail = $("#userEmail"),
            radioButton = $("[for=gender-radio-1]"),
            phone = $("#userNumber"),
            picture = $("#uploadPicture"),
            dateOfBorn = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            hobbies = $("#hobbiesWrapper"),
            currentAddress = $("#currentAddress"),
            state = $("#state"),
            city = $("#city"),
            submitButton = $("#submit"),
            nameForm = $("#modal-title h4");
}
