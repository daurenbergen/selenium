package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookExample {
    public static void main(String[] args) {
        // instance
        WebDriver driver= new ChromeDriver();
        // go to fb.com
        driver.get("https://www.facebook.com");
        // maximize window
        driver.manage().window().maximize();
// Find the email address
        WebElement email= driver.findElement(By.id("email"));
        email.sendKeys("daur.bergen@gmail.com");
        // find the password
        WebElement password=driver.findElement(By.name("pass"));
        password.sendKeys("1234567");
        // find the login button
        WebElement loginBtn=driver.findElement(By.name("login"));
        loginBtn.click();
    }
}
