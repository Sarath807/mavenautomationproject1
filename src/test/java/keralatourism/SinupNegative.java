package keralatourism;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SinupNegative extends Base{
	 @BeforeMethod
	    public void setup() {
	       
	    	 //WebElement SignupButton = driver.findElement(By.xpath("//a[text()='Signup']"));
	         
	        // SignupButton.click();
	    	
	    	
	        driver.get("https://hashirakb.github.io/Kerala-Tourism-Website/signup.html");
	    }

	    @Test
	    public void signupTest() {
	        // Fill the signup form
	        WebElement fullnamefield = driver.findElement(By.xpath("//input[@placeholder='Please enter a userame']"));
	       fullnamefield .sendKeys("123");
	       WebElement emailfield =driver.findElement(By.xpath("//input[@id='semail']"));
	         emailfield.sendKeys("123@gmail.com");
	         WebElement phonenumberfield = driver.findElement(By.xpath("//input[@id='phone']"));
	         phonenumberfield .sendKeys("9876543210");
	        WebElement passwordfield =driver.findElement(By.xpath("//input[@id='password1']"));
	        passwordfield .sendKeys("Test@123");
	        WebElement cpasswordfield= driver.findElement(By.xpath("//input[@id='password2']"));
	        cpasswordfield .sendKeys("Test@123");
	        
	      
	        // Click on Submit
	        WebElement submitButton = driver.findElement(By.xpath("//button[text()='Signup']"));
	        submitButton.click();
	        
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

	    @AfterMethod
	    public void tearDown() {
	        //driver.quit();
	    }
	}



