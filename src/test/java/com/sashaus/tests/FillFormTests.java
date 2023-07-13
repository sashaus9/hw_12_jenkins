package com.sashaus.tests;

import com.sashaus.utils.TestDataGenerator;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class FillFormTests extends BaseTest {

    private final Map<String, String> resultValues = new HashMap<>() {{
        put("Student Name", TestDataGenerator.firstName + " " + TestDataGenerator.lastName);
        put("Student Email", TestDataGenerator.userEmail);
        put("Gender", TestDataGenerator.gender);
        put("Mobile", TestDataGenerator.mobilePhone);
        put("Date of Birth", TestDataGenerator.day + " " + TestDataGenerator.month + "," + TestDataGenerator.year);
        put("Subjects", TestDataGenerator.subject);
        put("Hobbies", TestDataGenerator.hobby);
        put("Picture", TestDataGenerator.photo);
        put("Address", TestDataGenerator.currentAddress);
        put("State and City", TestDataGenerator.state + " " + TestDataGenerator.city);
    }};

    @Test
    void fillFormTest() {
        automationPracticeFormPage.openPage()
                .removeBannerAndFooter()
                .setFirstName(TestDataGenerator.firstName)
                .setLastName(TestDataGenerator.lastName)
                .setUserEmail(TestDataGenerator.userEmail)
                .setGender(TestDataGenerator.gender)
                .setUserNumber(TestDataGenerator.mobilePhone)
                .setBirthDate(TestDataGenerator.day, TestDataGenerator.month, TestDataGenerator.year)
                .setSubjects(TestDataGenerator.subject)
                .setHobbies(TestDataGenerator.hobby)
                .uploadPicture(TestDataGenerator.photo)
                .setCurrentAddress(TestDataGenerator.currentAddress)
                .setState(TestDataGenerator.state)
                .setCity(TestDataGenerator.city)
                .clickSubmitButton();

        automationPracticeFormPage.checkThatRegistrationResultsBlockAppears()
                .checkResultValues(resultValues)
                .closeResultModalWindow();
    }
}
