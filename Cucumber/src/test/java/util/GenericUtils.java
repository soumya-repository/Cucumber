package util;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class GenericUtils {
    private WebDriver driver;

    public GenericUtils(WebDriver driver){
        this.driver = driver;
    }

    public void switchToSecondaryWindow(){
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> itr = handles.iterator();
        String parent = itr.next();
        String child = itr.next();
        driver.switchTo().window(child);
    }
}
