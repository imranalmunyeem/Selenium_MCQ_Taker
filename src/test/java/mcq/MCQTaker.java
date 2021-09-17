package mcq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base_class.DriverSetup;

public class MCQTaker extends DriverSetup {
	@Test
	public void TakeMCQ() throws InterruptedException {
		
		//Navigate to Login
		driver.get("https://job.mediusware.com/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Login
		WebElement login = driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/ul/li[3]/a"));
		login.click();
		Thread.sleep(2000);
		
		//Login Fields
		driver.findElement(By.id("email")).sendKeys("todaystest@mailinator.com");
		driver.findElement(By.xpath("/html/body/div/div[1]/main/div/div/div/div/div/form/div[1]/div[3]/div/div/input")).sendKeys("12345678");
		driver.findElement(By.xpath("/html/body/div/div[1]/main/div/div/div/div/div/form/div[2]/button")).click();
		Thread.sleep(2000);
		
		//Dashboard
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		
		//Examination
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/a[3]")).click();
		Thread.sleep(2000);
		
		//Start Now
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div[2]/div[1]/div[2]/div[1]/div/div/a")).click();
		Thread.sleep(2000);
		
		//Start Exam
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[4]/div/button")).click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
