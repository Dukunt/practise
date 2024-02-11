package firstscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automationacccreation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sateesh");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("sateesh1417@gmail.com");
		driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Bluestar@1");
		WebElement day = driver.findElement(By.xpath("//select[@id='days']"));
		Select dat = new Select(day);
		dat.selectByValue("15");
		WebElement mnth=driver.findElement(By.xpath("//select[@id='months']"));
		Select monthdd = new Select(mnth);
		monthdd.selectByValue("8");
		WebElement y=driver.findElement(By.xpath("//select[@id='years']"));
		Select yea = new Select(y);
		yea.selectByValue("1983");
		driver.findElement(By.xpath("//input[@id ='newsletter']")).click();
		driver.findElement(By.xpath("//input[@name ='first_name']")).sendKeys("Sateesh");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("dukuntla");
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("TCS");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("adibhatla");
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Hyd");
		WebElement cou =driver.findElement(By.xpath("//select[@id='country']"));
		Select ctry = new Select(cou);
		ctry.selectByValue("India");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Telangana");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("501510");
		driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("7799834456");
		driver.findElement(By.xpath("//button[normalize-space()='Create Account']")).click();
        		

	}

}
