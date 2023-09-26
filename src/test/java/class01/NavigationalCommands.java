package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
    // go to google.com
        driver.get("https:www.google.com");
        // maximize
        driver.manage().window().maximize();
        // slow down the process
        Thread.sleep(2000);
        //go to facebook.com
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);
        // go back
        driver.navigate().back();
        // slow down
        Thread.sleep(2000);
        //go forward
        driver.navigate().forward();
        // slow down
        Thread.sleep(2000);
        driver.navigate().refresh();
        //close
        driver.close();
        //also we can use
        // driver.quit();

    }
}
