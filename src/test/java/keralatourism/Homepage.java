package keralatourism;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Homepage extends SinupAutomation {
	public void setup() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement homepagebutton = driver.findElement(By.xpath("//a[text()='Home']"));
			homepagebutton.click();
			
			
			driver.get("https://hashirakb.github.io/Kerala-Tourism-Website/index.html");
			
	}
	@Test (priority=3)
    public void screenshot() {
		driver.navigate().to("https://hashirakb.github.io/Kerala-Tourism-Website/index.html");
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("screenshort");
		
		
		try {
			 Files.copy(source.toPath(), destination.toPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//print Exception Details
		}
	
			
	

}
}
