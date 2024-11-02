package pageMailinator;

import baseHaloOglasi.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InboxPage extends BaseTest {
    public InboxPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//td[contains(text(),'Molimo aktivirajte Vaš Halo oglasi nalog')]")
    WebElement emailZaAktivacijuNalogaLink;

    public void emailZaAktivacijuNalogaLinkClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(emailZaAktivacijuNalogaLink)).click();
    }
}
