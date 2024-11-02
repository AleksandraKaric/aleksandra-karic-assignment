package pageMailinator;

import baseHaloOglasi.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.Set;

public class EmailPage extends BaseTest {
    public EmailPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "html_msg_body")
    WebElement iFrameElement;
    @FindBy (xpath ="//strong[normalize-space()='Aktiviraj nalog']")
    WebElement aktivirajNalogButton;

    public void switchFocusToIFrame(){
        wdWait.until(ExpectedConditions.visibilityOf(iFrameElement));
        driver.switchTo().frame(iFrameElement);
    }

    public void aktivirajNalogButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(aktivirajNalogButton));
        actions.moveToElement(aktivirajNalogButton).perform();
        aktivirajNalogButton.click();
    }

    public void switchBackToOutsideHTML(){
        driver.switchTo().defaultContent(); //vracamo fokus na glavni html
    }

    public void setUpWindowSwitch(){
        Set<String> windowHandles = driver.getWindowHandles();
        // Switch to the new window
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(driver.getWindowHandle())) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    public void switchFocusToNewTab(){
        wdWait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
}

