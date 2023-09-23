package tests;

import executor.JavaScriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.N11page;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;


import static utilities.Driver.getDriver;

public class N11_Test01 {

    /*
    Senaryo Başlangıcı ve Sayfa Erişimi:
Senaryo "n11.com" anasayfasında başlar.
Tarayıcıyı aç ve "https://www.n11.com/" adresine git.
Üye Olma Sayfasına Geçiş:
Anasayfada "Üye Ol" veya "Giriş Yap" butonuna tıkla.
"Üye Ol" seçeneğine tıkla, yeni üye kaydı için sayfaya geçiş yap.
Kişisel Bilgilerin Girilmesi:
Ad ve soyad bilgilerini ilgili alanlara gir.
E-posta adresini ilgili alana gir.
Şifreyi belirle ve şifre tekrarını ilgili alanlara gir.
Üyelik Bilgilerinin Tamamlanması:
Cinsiyet seçeneğini uygun şekilde işaretle.
Doğum tarihini ilgili alana gir.
Telefon numarasını ilgili alana gir.
Üyelik Sözleşmesi ve İzinler:
Üyelik sözleşmesini ve gizlilik politikasını oku (isteğe bağlı).
Gerekliyse iletişim ve pazarlama izinlerini işaretle veya işaretsiz bırak.
Üyelik İşleminin Onaylanması:
"Üye Ol" veya "Kaydol" gibi bir onay butonuna tıkla.
Üyelik Onayı ve Giriş Yapma:
Üyelik işlemi başarılıysa, "Üyelik tamamlandı" mesajını doğrula.
E-posta adresine gönderilen doğrulama bağlantısını kontrol et (isteğe bağlı).
Giriş Yapma (Opsiyonel):
Üyelik işlemi tamamlandıktan sonra "Giriş Yap" butonuna tıkla.
Kullanıcı adı (e-posta) ve şifre ile oturum aç.
Çıkış ve Temizlik (Opsiyonel):
Senaryo tamamlandıktan sonra oturumu kapat veya sayfayı kapat.
     */

     /*
     @Test
    public void test01() {
        extentTest = extentReports.createTest("tripandway Destinations buttonu test.",
                "The visitor should be able to go to the Destinations page by clicking the Destinations button on the Homepage.");

        //01_The browser opens and the visitor goes to the https://www.tripandway.com homepage.
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("goes to tripandway ");

        //02_Clicks the Destinations button.
        DestinationPage destinationsPage = new DestinationPage();
        destinationsPage.destinationsButton.click();
        extentTest.info("Clicks the Destinations button.");

        //03_Verifies that you've gone to the Destinations page.
        Assert.assertTrue(destinationsPage.destinationsPageValidationElement.isDisplayed());
        extentTest.pass("It has been tested that it redirects to the Destinations page.");


        //04_The browser is closed.
        Driver.closeDriver();
        extentTest.info("Driver closed.");
    }
     */

    @Test
    public void test01(){

       /*
        Senaryo "n11.com" anasayfasında başlar.

        Üye Olma Sayfasına Geçiş:
        Anasayfada "Üye Ol" veya "Giriş Yap" butonuna tıkla.
        "Üye Ol" seçeneğine tıkla, yeni üye kaydı için sayfaya geçiş yap.
        Kişisel Bilgilerin Girilmesi:
        Ad ve soyad bilgilerini ilgili alanlara gir.
                E-posta adresini ilgili alana gir.
        Şifreyi belirle ve şifre tekrarını ilgili alanlara gir.
        Üyelik Bilgilerinin Tamamlanması:
        Cinsiyet seçeneğini uygun şekilde işaretle.
                Doğum tarihini ilgili alana gir.
        Telefon numarasını ilgili alana gir.
                Üyelik Sözleşmesi ve İzinler:
        Üyelik sözleşmesini ve gizlilik politikasını oku (isteğe bağlı).
        Gerekliyse iletişim ve pazarlama izinlerini işaretle veya işaretsiz bırak.
                Üyelik İşleminin Onaylanması:
        "Üye Ol" veya "Kaydol" gibi bir onay butonuna tıkla.
                Üyelik Onayı ve Giriş Yapma:
        Üyelik işlemi başarılıysa, "Üyelik tamamlandı" mesajını doğrula.
        E-posta adresine gönderilen doğrulama bağlantısını kontrol et (isteğe bağlı).
        Giriş Yapma (Opsiyonel):
        Üyelik işlemi tamamlandıktan sonra "Giriş Yap" butonuna tıkla.
        Kullanıcı adı (e-posta) ve şifre ile oturum aç.
                Çıkış ve Temizlik (Opsiyonel):
        Senaryo tamamlandıktan sonra oturumu kapat veya sayfayı kapat.

        */
       /*
       Cerez cikarsa
       JavaScriptExecutor js = (JavaScriptExecutor)getDriver();
        js.executeScript("document.querySelector(\"body > efilli-layout-n11\").shadowRoot.querySelector(\"div.desktop > div > div.banner__accept-button\").click();");

        */
        N11page n11page=new N11page();
        Actions actions=new Actions(Driver.getDriver());
        //Tarayıcıyı aç ve "https://www.n11.com/" adresine git.
        Driver.getDriver().get(ConfigReader.getProperty("n11_url"));
        //  "Üye Ol" seçeneğine tıkla, yeni üye kaydı için sayfaya geçiş yap.
        n11page.uyeOlButton.click();
        // Ad ve soyad bilgilerini ilgili alanlara gir.
        // E-posta adresini ilgili alana gir.
        // Şifreyi belirle ve şifre tekrarını ilgili alanlara gir.
        actions.sendKeys(ConfigReader.getProperty("isim"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("soyisim"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("email"))
                .sendKeys(ConfigReader.getProperty("sifre"))
                .sendKeys(Keys.TAB)
                .sendKeys((ConfigReader.getProperty("sifre")))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("telefon"));
        //Cinsiyet seçeneğini uygun şekilde işaretle.
        n11page.genderMaleRadioButton.click();
        // Doğum tarihini ilgili alana gir.
        Select select= new Select(n11page.birthday);
        select.selectByVisibleText("4");
        select=new Select(n11page.birthMonth);
        select.selectByVisibleText("11");
        select=new Select(n11page.birthYear);
        select.selectByVisibleText("1998");
        //Gerekliyse iletişim ve pazarlama izinlerini işaretle veya işaretsiz bırak.
        n11page.contractAccept.click();
        //"Üye Ol" veya "Kaydol" gibi bir onay butonuna tıkla.
        n11page.uyeOlButton.click();







    }






}
