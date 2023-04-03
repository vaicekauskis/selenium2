import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;

public class Skelbiu {
    public WebDriver driver;


    @Test
     public void beforeClass() throws InterruptedException{
        driver.get("https://skelbiu.lt");
        WebElement oneTrustBtn = driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div[1]/div/div[2]/div/button[1]"));
        oneTrustBtn.click();
        WebElement searchField = driver.findElement(By.id("searchKeyword"));
        searchField.sendKeys("huawei p30 pro");
        WebElement button = driver.findElement(By.xpath("//*[@id=\"searchButton\"]"));
        button.click();









     }

     @BeforeClass
        public void beforeClass2 (){
         System.setProperty("webdriver.chrome.driver","drivers\\chromedriver111.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

     }
     @AfterClass
    public void afterClas(){
       // driver.quit();
     }

}
