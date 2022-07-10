package d02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_ManageMethods1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());
        Thread.sleep(2000);

        //driver.manage().window().setPosition(new Point());
        //driver.manage().window().setSize(new Dimension());
    }
}
