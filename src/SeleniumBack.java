import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class SeleniumBack {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.facebook.com");
        {
            driver.findElement(By.id("email")).sendKeys("rada.foxx.pl@gmail.com");
            WebElement pass = driver.findElement(By.id("pass"));
            pass.sendKeys("k4Zr3kA==bool");
            pass.sendKeys(Keys.RETURN);
        }
        Thread.sleep(5000);

        driver.get("https://www.facebook.com/groups/344364473393853/");
        Thread.sleep(2000);
        WebElement postBox = driver.findElement(By.xpath("//*[@name='xhpc_message_text']"));

        postBox.sendKeys("iufuioagewsdfuio");
        driver.findElement(By.xpath("//input[@type='file' and @display='inline']")).sendKeys("/home/kemik/Downloads/jp2.jpg");

        WebDriverWait wait = new WebDriverWait(driver, 25);

        WebElement postBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='_1mf7 _4jy0 _4jy3 _4jy1 _51sy selected _42ft']")));
        postBtn.click();
        Thread.sleep(5000);

        driver.get("https://www.facebook.com/groups/598502741047161/");
        postBox = driver.findElement(By.xpath("//*[@name='xhpc_message_text']"));
        postBox.sendKeys("b");
        postBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='_1mf7 _4jy0 _4jy3 _4jy1 _51sy selected _42ft']")));
        postBtn.click();
    }
}
