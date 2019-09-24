package tests;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Tests extends BaseClass{



	@Test
	public void testOne(){

		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test1 = extent.createTest("Test One", "Sample test case for demo");

		test1.log(Status.INFO, "Test One started");

		driver.get("https://google.com");
		test1.log(Status.PASS, "Navigate to https://google.com");

		driver.findElement(By.name("q")).sendKeys("Automation");
		test1.log(Status.PASS, "Enter 'Automation' in google search box");

		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		test1.log(Status.PASS, "Hit the keyboard enter key");

		System.out.println("Completed Test One...");
		test1.log(Status.INFO, "Test One completed");
	}


	@Test
	public void testTwo(){
		//	driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Raghav");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		System.out.println("Completed Test Two...");
	}

	@Test
	public void loginTest() throws InterruptedException {

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LOGIN Panel'])[1]/following::span[1]")).click();
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("txtPassword")).sendKeys(Keys.ENTER);
		//		    
		//		    for (int second = 0;; second++) {
		//		    	if (second >= 30) fail("timeout");
		//		    	try { if (isElementPresent(By.id("btnLogin"))) break; } catch (Exception e) {}
		//		    	Thread.sleep(1000);
		//		    }
		//		    
		//		    driver.findElement(By.id("btnLogin")).click();


		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();

	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}


}


