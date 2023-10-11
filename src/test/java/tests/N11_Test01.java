package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.N11page;
import utilities.ConfigReader;
import utilities.Driver;

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

    @Test
    public void test01(){

        N11page n11page=new N11page();

        //Tarayıcıyı aç ve "https://www.n11.com/" adresine git.
        Driver.getDriver().get(ConfigReader.getProperty("n11_url"));

        //Cookies kabul edilir.
        //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //js.executeScript("480698fc-e6ac-41bc-a722-51059b783200.click();");

        // "Üye Ol" seçeneğine tıkla, yeni üye kaydı için sayfaya geçiş yap.
        n11page.uyeOlButton.click();
        n11page.membershipFormFill();

        //Gerekliyse iletişim ve pazarlama izinlerini işaretle veya işaretsiz bırak.
        n11page.contractAccept.click();

        //"Üye Ol" veya "Kaydol" gibi bir onay butonuna tıkla.
        //n11page.uyeOlButton.click();

        //Driver kapatılır.
        Driver.closeDriver();

    }
}
