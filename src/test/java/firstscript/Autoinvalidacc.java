package firstscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autoinvalidacc {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("a[href='/login']")).click();
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("sateesh1417@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("blueaea");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		WebElement mess =driver.findElement(By.xpath("//p[normalize-space()='Your email or password is incorrect!']"));
		String txt = mess.getText();
		String acttxt = "Your email or password is incorrect!";
		if(txt.equals(acttxt))
		{
			System.out.println("Test passed with invalid credentials");
		}
		else
		{
			System.out.println("Test failed");
		}
		
		

	}

}
