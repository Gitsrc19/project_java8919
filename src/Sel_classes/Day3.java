package Sel_classes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Day3 {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/register");
        driver.manage().window().maximize();
        WebElement mr = driver.findElement(By.id("gender-male"));
        mr.click();
        driver.findElement(By.id("FirstName")).sendKeys("abc");
        driver.findElement(By.name("LastName")).sendKeys("a");
        driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("abc@123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("abc@123");
        driver.findElement(By.name("register-button")).click();
        driver.close();


    }
}
