package pageHaloOglasi;

import baseHaloOglasi.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AktivacijaNalogaPage extends BaseTest {
    public AktivacijaNalogaPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".row.user-section")
    WebElement aktivacijaNalogaMessage;

    public boolean aktivacijaNalogaMessageIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(aktivacijaNalogaMessage));
        return aktivacijaNalogaMessage.isDisplayed();
    }
    public String aktivacijaNalogaMessageGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(aktivacijaNalogaMessage));
        return aktivacijaNalogaMessage.getText();
    }
}
