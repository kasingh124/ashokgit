package org.cts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-09\\eclipse-Ashok\\Alert\\driver\\chromedriver.exe");
	WebDriver site=new ChromeDriver();
	site.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
	site.switchTo().frame(0);
	Thread.sleep(3000);
	WebElement click=site.findElement(By.xpath("(//img[@alt='continue'])[1]"));
	click.click();
	Thread.sleep(3000);
	Alert al=site.switchTo().alert();
	al.accept();
	site.close();
}
}
