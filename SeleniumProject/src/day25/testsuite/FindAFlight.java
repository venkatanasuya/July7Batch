package day25.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FindAFlight  extends BaseClass{
	
	@Test
	public void findAFlighttest()
	{
		driver.findElement(By.name("passCount")).sendKeys("2");
		driver.findElement(By.name("fromPort")).sendKeys("London");
		driver.findElement(By.name("toPort")).sendKeys("Paris");
		driver.findElement(By.name("airline")).sendKeys("Unified Airlines");
		driver.findElement(By.name("findFlights")).click();
	}

}
