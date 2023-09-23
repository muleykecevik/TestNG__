package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
    @FindBy (xpath = "//input[@id='genderMale']")
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







}
