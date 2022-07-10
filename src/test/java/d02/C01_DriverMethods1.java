package d02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.amazon.com");
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl()); // actual url
        System.out.println(driver.getTitle()); // actual title
        driver.close();
    }
}
