package HWSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWSeleniumN1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement userName = driver.findElement(By.name("username") );
//        userName.sendKeys("abc");
//       Thread.sleep(2000);
//        userName.clear();
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        WebElement buttonText= driver.findElement(By.tagName("button"));
        String text=buttonText.getText();
        System.out.println("login text is: "+text);
        WebElement clickButton= driver.findElement(By.tagName("button"));
        clickButton.click();

    }
}
