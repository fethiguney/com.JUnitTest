package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class TestBase_Before_After {

    protected WebDriver driver;

    LocalDateTime date=LocalDateTime.now();
    DateTimeFormatter formatter=DateTimeFormatter.ofPattern("YYYYMMddhhmmss");
    protected String tarih=date.format(formatter);

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @After
    public void tearDown(){
    //    driver.quit();
    }



}
