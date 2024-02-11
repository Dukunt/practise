package firstscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Conditionalmethodsprac {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		//WebElement img =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println("Logo presence "+img.isDisplayed());
		//WebElement box =driver.findElement(By.xpath("//h2[normalize-space()='Welcome to our store']"));
		//System.out.println("Search box enabled"  +box.isEnabled());
		WebElement mrb=driver.findElement(By.xpath("//input[@id='gender-male']"));
		System.out.println("Radio button for gender male status" +mrb.isSelected()); 
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		System.out.println("Radio button for gender male status" +mrb.isSelected()); 
		

	}

}
