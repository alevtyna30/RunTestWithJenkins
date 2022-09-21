package finance_ua_tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class MainPageTest {

    MainPage mainPage = new MainPage();

    public static final String EXPECTED_RESULTS = "1";

    @BeforeClass
    public static void setUpAll(){
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeMethod
    public void setUp(){
        open("https://finance.ua/");

    }

    @Test
    public void CheckInterbankCurrency(){
        //mainPage.interbankButton.click();
        $("[data-vr-contentbox='Всі кредити']").click();
        $("#loanLimit-input").sendKeys("5000");
        assertTrue(mainPage.resultPage.exists());


    }
}
