package Stepdef;

import io.github.bonigarcia.wdm.WebDriverManager;
import object_repo.Applijob_Pageobj;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class baseclass {

    public static WebDriver driver;
    public static Applijob_Pageobj Applijobpageobj;


    public static void driverinit(){
        String browser="Chrome";

        switch (browser) {

            case "Chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;

            case "Edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                break;

            case "Firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                break;
        }
        driver.get("https://careers.hardingretail.com/Department/Landside");
        driver.manage().window().maximize();

        Applijobpageobj =new Applijob_Pageobj(driver);
    }
}
