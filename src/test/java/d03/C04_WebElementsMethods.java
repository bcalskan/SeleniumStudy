package d03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementsMethods {
    public static void main(String[] args) {
         /*
        1- amazon.com´a gidip arama kutusunu locate edin
        2- arama kutusunun tagName´inin input oldugunu test edin
        3- arama kutusunun name attribute´nun degerinin "field-keywords" oldugunu test edin
         */
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        String expectedTagName = "input";
        System.out.println(expectedTagName.equals(searchBox.getTagName()) ? "Test PASSED" : "Test FAILED");
        driver.close();


    }
}
