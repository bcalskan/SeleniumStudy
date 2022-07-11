package d04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) {
        /*
        1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        2- add element butonuna basin
        3- Delete butonunun görünür oldugunu test edin
        4- Delete tusuna basin
        5- "Add/Remove Elements" yazisinin görünür oldugunu test edin
        */

        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addElementButton = driver.findElement(By.xpath("//*[text()='Add Element']"));
        if (addElementButton.isDisplayed()) {
            System.out.println("Test PASSED");
        } else System.out.println("Test FAILED");

        addElementButton.click();

        WebElement deleteButton = driver.findElement(By.xpath("//*[text()='Delete']"));
        if (deleteButton.isDisplayed()) {
            System.out.println("Test PASSED");
        } else System.out.println("Test FAILED");




    }
}
