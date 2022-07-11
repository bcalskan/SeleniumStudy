package d04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_AmazonSearch {
    public static void main(String[] args) {
        /*
        2. Main method olusturun ve asagidaki görevi tamamlayin
        a- Amazon sayfasina gidin : https://www.amazon.com/
        b- Search(ara) "city bike"
        c- Amazon´da görüntülenen ilgili sonuclarin sayisini yazdirin
        e- Sonra karsiniza cikan ilk sonucun resmine tiklayin
        */

        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("city bike" + Keys.ENTER);
        WebElement searchedProductText = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        System.out.println(searchedProductText.getText());
        List<WebElement> productList = driver.findElements(By.xpath("//img[@class='s-image']"));
        productList.get(0).click();
        driver.close();


    }
}
