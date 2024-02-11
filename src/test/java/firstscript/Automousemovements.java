package firstscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automousemovements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
       driver.get("https://automationexercise.com/login");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("sateesh1417@gmail.com");
       driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Bluestar@1");
       driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	   WebElement logut = driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
	   Actions act = new Actions(driver);
	   act.moveToElement(logut).click().build().perform();
	
	}

}
