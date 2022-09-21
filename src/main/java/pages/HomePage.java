package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath = "//span[text()='30']")
    private WebElement resultPage;

    public String getAmountOfResults(){
        return resultPage.getText();
    }


}
