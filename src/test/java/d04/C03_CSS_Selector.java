package d04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_CSS_Selector {
    public static void main(String[] args) {
        /*
        1 ) Bir class oluşturun : Locators_css
        2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        b. Locate email textbox
        c. Locate password textbox ve
        d. Locate signin button
        e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
         */

        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));

        email.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        submitButton.click();
        driver.close();

    }
}
