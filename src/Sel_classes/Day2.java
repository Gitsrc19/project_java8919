package Sel_classes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        String url= driver.getCurrentUrl();
        System.out.println(url);
       // String title= driver.getTitle();
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();


    }

}
