package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    public WebDriver driver;

    public WebDriver getDriver() throws IOException {
        FileInputStream fis = new FileInputStream("./src/test/resources/properties/config.properties");
        Properties prop = new Properties();
        prop.load(fis);
        if(driver==null) {
            if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
                //System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            driver.get(prop.getProperty("url"));
        }
        return driver;
    }

}
