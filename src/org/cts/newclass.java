package org.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newclass {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-09\\eclipse-Ashok\\Selenium\\src\\org\\cts\\newclass.java");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.adactin.com/HotelApp/");
		
		Thread.sleep(2000);
		
		WebElement Username = driver.findElement(By.id("username"));
		
		WebElement Userpass = driver.findElement(By.id("password"));
		
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		
		jk.executeScript("arguments[0], setAttribute ('value', 'Jai123@gmail.com', Username)");
		
		jk.executeScript("arguments[0], setAttribute ('value', '123456', Userpass)");
			System.out.println("1");	
	}

}
