package Firsttestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Newtest {
	   
     
       
       @BeforeTest    
	   void app() {
		  
    	   System.out.println("This is before test");
	  }
       
       @Test
	   void login() 
       {
		   System.out.println("This is during test");
       }
       
       @AfterTest
       void end()
       {
    	   System.out.println("This is after test");
       }
}