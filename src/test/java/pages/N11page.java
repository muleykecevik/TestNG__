package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;

import java.nio.file.WatchEvent;

public class N11page {

    public N11page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    //@FindBy(xpath = "//*[@id=\"menu\"]/li[5]/a")
    //   public WebElement aboutUsButton;

    @FindBy (xpath = "(//*[@title='Üye Ol'])[1]")
    public WebElement uyeOlButton;
    @FindBy (xpath = "//*[@name='firstName']")
    public WebElement adBox;
    @FindBy (xpath = "//label[@for='genderFemale']")
    public WebElement genderMaleRadioButton;
    @FindBy (xpath = "//select[@id='birthDay'][1]")
    public WebElement birthday;
    @FindBy (xpath = "//select[@id='birthMonth'][1]")
    public WebElement birthMonth;
    @FindBy(xpath = "//select[@id='birthYear'][1]")
    public WebElement birthYear;
    @FindBy (xpath = "//label[@for='acceptContract']")
    public WebElement contractAccept;
    @FindBy(xpath = "//div[@id='submitButton']")
    public WebElement submitButton;

    @FindBy(id="submitButton")
    public WebElement uyeOlNumaraniDogrula;

    public void membershipFormFill (){

        // Ad ve soyad bilgilerini ilgili alanlara gir.
        // E-posta adresini ilgili alana gir.
        // Şifreyi belirle ve şifre tekrarını ilgili alanlara gir.
        Actions actions=new Actions(Driver.getDriver());
        actions.click(adBox);
        actions.sendKeys(ConfigReader.getProperty("isim"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("soyisim"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("email"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("telefon"))
                .sendKeys(Keys.TAB)
                .sendKeys((ConfigReader.getProperty("sifre")))
                .perform();

        actions.scrollToElement(uyeOlNumaraniDogrula).perform();
        //Cinsiyet seçeneğini uygun şekilde işaretle.
        genderMaleRadioButton.click();
        //
    }
}
