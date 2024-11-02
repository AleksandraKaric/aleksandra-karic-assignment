package pageHaloOglasi;

import baseHaloOglasi.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UlogujSePage extends BaseTest {

    public UlogujSePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Registrujte se →")
    WebElement registrujSeLink;

    public void registrujSeLinkClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(registrujSeLink)).click();
    }
}

