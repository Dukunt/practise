package firstscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excelwithlogin {

	public static void main(String[] args) throws IOException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileInputStream file = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\mymavenproj\\src\\test\\testing.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sh = book.getSheet("sheet1");
		int r = sh.getLastRowNum();
		int c = sh.getRow(1).getLastCellNum();
		for (int i=1;i<=r;i++)
		   {
			XSSFRow cr = sh.getRow(i);
			XSSFCell ce = cr.getCell(0);
			String id = ce.toString();
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(id);
			XSSFCell cel =cr.getCell(1);
			String pw = cel.toString();
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pw);
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			System.out.println("Tested with login");
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
            
			
	}

	}
}


