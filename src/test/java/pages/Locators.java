package pages;

import com.codeborne.selenide.SelenideElement;
import data.RegistrationFormPageObject;
import static com.codeborne.selenide.Selenide.$;

public class Locators {

    Faker faker = new Faker();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String email = faker.internet().emailAddress();
    String phoneNumber = faker.phoneNumber().phoneNumber();
    String subjects = faker.pokemon().name();

    String submittingText = "Thanks for submitting the form";
    String hobbiesText = "Code";
    String addressText = "Moscow";
    String ncrText = "NCR";
    String cityText = "Delhi";
    String pathFile = "src/test/resources/pngegg.png";

    static public SelenideElement
            name = $("#firstName"),
            surname = $("#lastName"),
            email = $("#userEmail"),
            radioButton = $("[for=gender-radio-1]"),
            phone = $("#userNumber"),
            picture = $("#uploadPicture"),
            dateOfBorn = $("#dateOfBirthInput"),
            subjects = $("#subjectsInput"),
            hobbies = $("#hobbiesWrapper"),
            currentAddress = $("#currentAddress"),
            state = $("#state"),
            city = $("#city"),
            submitButton = $("#submit"),
            nameForm = $("#modal-title h4");
}
