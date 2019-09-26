package org.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Greens-09\\eclipse-Ashok\\Selenium\\driver\\chromedriver.exe");
	WebDriver site=new ChromeDriver();
	site.get("https://www.facebook.com");
	
	WebElement email=site.findElement(By.id("email"));
	email.sendKeys("kasingh124@gmail.com");
	
	WebElement pass=site.findElement(By.id("pass"));
	pass.sendKeys("12456789");
	
	WebElement click=site.findElement(By.id("loginbutton"));
	click.click();
	
	site.close();
	
	WebDriver site1= new ChromeDriver();
	site1.get("https://www.facebook.com");
	
	WebElement email1= site1.findElement(By.id("email"));
	email1.sendKeys("kasingh124");
	
	WebElement pass1=site1.findElement(By.id("pass"));
	pass1.sendKeys("ashok.4");
	
	WebElement Click1=site1.findElement(By.id("loginbutton"));
	Click1.click();
	
	site1.close();
	
	WebDriver site2= new ChromeDriver();
	site2.get("https://www.facebook.com");
	
	WebElement email2= site2.findElement(By.id("email"));
	email2.sendKeys("kasingh124");
	
	WebElement pass2=site2.findElement(By.id("pass"));
	pass2.sendKeys("258974");
	
	WebElement Click2=site2.findElement(By.id("loginbutton"));
	Click2.click();
	
	site2.close();
	
	WebDriver site3= new ChromeDriver();
	site3.get("https://www.facebook.com");
	
	WebElement email3= site3.findElement(By.id("email"));
	email3.sendKeys("kasingh124@gmail.com");
	
	WebElement pass3=site3.findElement(By.id("pass"));
	pass3.sendKeys("ashok.143");
	
	WebElement Click3=site3.findElement(By.id("loginbutton"));
	Click3.click();
	System.out.println("sre");
}
}
