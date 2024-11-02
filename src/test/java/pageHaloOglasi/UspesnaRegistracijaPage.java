package pageHaloOglasi;

import baseHaloOglasi.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UspesnaRegistracijaPage extends BaseTest {
    public UspesnaRegistracijaPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "regsitration-success")
    WebElement uspesnaRegistracijaMessage;

    public boolean uspesnaRegistracijaMessageIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(uspesnaRegistracijaMessage));
        return uspesnaRegistracijaMessage.isDisplayed();
    }
    public String uspesnaRegistracijaMessageGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(uspesnaRegistracijaMessage));
        return uspesnaRegistracijaMessage.getText();
    }

    public void otvoriStranicuMailinator(){
        driver.get("https://www.mailinator.com/");
    }
}

