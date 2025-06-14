package keralatourism;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginAutomationTest extends Base{
	@Test (priority=1)
	public void loginWithvalidCridential() {
		
		
		
		 driver.navigate().to("https://hashirakb.github.io/Kerala-Tourism-Website/login.html");
		   // Locate useremail, password fields and login button
          WebElement useremailField = driver.findElement(By.xpath("//input[@id='email']"));
          useremailField.sendKeys("sarath85@gmail.com");
          WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
          passwordField.sendKeys("Sarath@123");
          
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
		 loginButton .click();
		 try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	            String alertText = alert.getText();
	            System.out.println("Alert Message: " + alertText);

	            if (alertText.contains("validation Success")) {
	                alert.accept();
	                System.out.println("Alert accepted.");
	            }

	        } catch (Exception e) {
	            System.out.println("No alert appeared or error occurred: " + e.getMessage());
	        }
	    }
	}