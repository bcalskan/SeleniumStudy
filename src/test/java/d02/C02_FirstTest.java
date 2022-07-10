package d02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_FirstTest {
    public static void main(String[] args) {
        /*
        1- https://www.amazon.com url´ine gidin
        2- Basligin Amazon kelimesi icerdigini test edin
        3- Url´in https://www.amazon.com´a esit oldugunu test edin
        4- Sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        String expectedWord = "Amazon";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedWord)) {
            System.out.println("Actual title contain expected word");
        } else System.out.println("not contain");

        driver.close();

    }
}
