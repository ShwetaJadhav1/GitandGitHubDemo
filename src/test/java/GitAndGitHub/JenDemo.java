package GitAndGitHub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenDemo {
	@Test
	public void Test11()
	{
	
		 WebDriver driver = new FirefoxDriver();
		
		   //open sauce demo web page
			driver.get("https://www.saucedemo.com");
			
			//locate user name ...tag#id
			driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
			
			//Locate password -tag[attribute name=attribute value]
			driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
			
			//locate login button using tag.value of class name
			driver.findElement(By.cssSelector("input.submit-button")).click();
	}
}


