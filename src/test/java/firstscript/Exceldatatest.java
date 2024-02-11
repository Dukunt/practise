package firstscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exceldatatest {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		FileInputStream file = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\mymavenproj\\src\\test\\testing.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("sheet1");
		int row = sheet.getLastRowNum();
		int col = sheet.getRow(1).getLastCellNum();
		System.out.println("number of rows "+row);
		System.out.println("number of columns "+col);
		for (int r=0;r<=row;r++)
		{
			XSSFRow currentrow = sheet.getRow(r);
			for(int c=0;c<col;c++)
			{
				XSSFCell cell = currentrow.getCell(c);
				String value = cell.toString();
				System.out.println(value);
								
			}
		}
		

	}

}
