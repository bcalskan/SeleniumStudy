package d03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_FindElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //search Nutella on Amazon
        driver.get("https://www.amazon.com");

        //links on Amazon
        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        System.out.println("Counter : " + linkList.size());
        driver.close();
    }
}
