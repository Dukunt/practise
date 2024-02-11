package Firsttestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sectest {
	WebDriver driver = new EdgeDriver();
    
    @BeforeTest  
	 void f() {
	  WebDriverManager.edgedriver().setup();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ; 
	 
  }
    @Test
    void login()
    {
    	driver.findElement(By.xpath("//input[@placeholder='username']")).sendKeys("Admin");
    	driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys("admin123");
    	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    }
}
