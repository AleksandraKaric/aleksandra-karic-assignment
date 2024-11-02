package pageMailinator;

import baseHaloOglasi.BaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MailinatorHomePage extends BaseTest {
    public MailinatorHomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "search")
    WebElement enterPublicMailinatorInboxInputField;

    // @FindBy (css = "button[value=\"Search for public inbox for free\"]")
    //WebElement goButton;

    public void enterPublicMailinatorInboxInputFieldSendKeys(String email) {
        wdWait.until(ExpectedConditions.visibilityOf(enterPublicMailinatorInboxInputField)).clear();
        enterPublicMailinatorInboxInputField.sendKeys(email);
        enterPublicMailinatorInboxInputField.sendKeys(Keys.ENTER);
    }
}