package pageHaloOglasi;

import baseHaloOglasi.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrujSePage extends BaseTest {
    public RegistrujSePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//span[text()='Fizičkog lica']")
    WebElement fizickogLicaRadioButton;
    @FindBy (id = "UserName")
    WebElement korisnickoImeInputField;
    @FindBy (id = "Email")
    WebElement emailInputField;
    @FindBy (id = "Password")
    WebElement lozinkaInputField;
    @FindBy (id = "ConfirmPassword")
    WebElement ponoviLozinkuInputField;
    @FindBy (id = "HasAgreedToGetFiscalReceiptByEmail")
    WebElement saglasnostZaFiskalneRacuneCheckbox;
    @FindBy (css = ".button-reg.save.save-entity.person-face.btn-main")
    WebElement registrujMeButton;

    public void fizickogLicaRadioButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(fizickogLicaRadioButton));
        if (fizickogLicaRadioButton.isSelected()){
        }
        else{
            fizickogLicaRadioButton.click();
        }
    }

    public void korisnickoImeInputFieldSendKeys(String korisnickoIme){
        wdWait.until(ExpectedConditions.visibilityOf(korisnickoImeInputField)).clear();
        korisnickoImeInputField.sendKeys(korisnickoIme);
    }

    public void emailInputFieldSendKeys(String email){
        wdWait.until(ExpectedConditions.visibilityOf(emailInputField)).clear();
        emailInputField.sendKeys(email);
    }

    public void lozinkaInputFieldSednKeys(String password){
        wdWait.until(ExpectedConditions.visibilityOf(lozinkaInputField)).clear();
        lozinkaInputField.sendKeys(password);
    }

    public void ponoviLozinkuInputFieldSendKeys(String password){
        wdWait.until(ExpectedConditions.visibilityOf(ponoviLozinkuInputField)).clear();
        ponoviLozinkuInputField.sendKeys(password);
    }

    public void saglasnostZaFiskalneRacuneCheckboxClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(saglasnostZaFiskalneRacuneCheckbox)).click();
    }

    public void registrujMeButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(registrujMeButton)).click();
    }

}