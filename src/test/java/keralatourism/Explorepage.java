package keralatourism;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Explorepage extends Base {
	@Test (priority=2)
	public void explor() {
		
		
		driver.navigate().to("https://hashirakb.github.io/Kerala-Tourism-Website/login.html");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement explorepage = driver.findElement(By.xpath("//a[text()='Explore']"));
		 explorepage  .click();
		 
			
	}
	
		
	@Test (priority=3)
	public void  pag() {
		
		driver.navigate().to("https://hashirakb.github.io/Kerala-Tourism-Website/districts.html");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement pagetovisit = driver.findElement(By.xpath("//a[text()='Places To Visit']"));
    pagetovisit.click();
    
}
}

