package org.cts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CanaraBank {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Greens-09\\eclipse-Ashok\\Alert\\driver\\chromedriver.exe");
		WebDriver site=new ChromeDriver();
		site.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		//site.switchTo().frame(1);
		
		WebElement click=site.findElement(By.xpath("//input[@class='btn btn-default']"));
		click.click();
		Thread.sleep(3000);
		Alert al=site.switchTo().alert();
		al.accept();
		site.close();
		System.out.println("ashok");
	}

}
