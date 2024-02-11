package firstscript;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstscrptchrome {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.edge.driver","D:\\Selenium\\edge\\msedgedriver");
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
				driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
				driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
				Thread.sleep(5000);
				String title = null;
				try
				{
                title =driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).getText();
				
				}
                catch(NoSuchElementException e) {
                	title ="";
                }
				String acttit = "Dashboard";
				System.out.println(title);
				
				if (acttit.equalsIgnoreCase(title))
				{
				 System.out.println("test Passed");
				 
				}
				else
				{
					System.out.println("test Fail");
				}
	}				
}				

