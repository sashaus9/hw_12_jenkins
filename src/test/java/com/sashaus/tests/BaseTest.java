package com.sashaus.tests;

import com.codeborne.selenide.Configuration;
import com.sashaus.pages.AutomationPracticeFormPage;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    AutomationPracticeFormPage automationPracticeFormPage = new AutomationPracticeFormPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }
}
