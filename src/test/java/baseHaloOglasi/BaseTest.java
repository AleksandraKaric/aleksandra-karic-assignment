package baseHaloOglasi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;
    public static WebDriverWait wdWait;
    public static Actions actions;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver( co );
        wdWait = new WebDriverWait(driver, Duration.ofSeconds(60));
        actions = new Actions(driver);

        driver.manage().window().maximize();
        driver.get("https://www.halooglasi.com/");

    }
    @After
    public void tearDown(){ //TODO podsetnik: Otkomentarisi ovo ispod kad zavrsis pisanje svih testova
        //driver.close(); // zatvara tab koji je trenutno u fokusu
        //driver.quit();  // zatvara ceo browser
    }
}

