package d02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethods2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        String pageSources = driver.getPageSource();
        String searchedWord = "Gateway";

        if (pageSources.contains(searchedWord)) {
            System.out.println("Page Source Test PASSED");
        } else System.out.println("Page Source Test FAILED");

        driver.close();

    }
}
