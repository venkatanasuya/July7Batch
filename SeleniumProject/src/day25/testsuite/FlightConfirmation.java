package day25.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FlightConfirmation  extends BaseClass{

	@Test
	public void flightConfirmtest()
	{
		String expmsg="Your itinerary has been booked!";
		String actmsg=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText();
		if(expmsg.equals(actmsg))
		{
			System.out.println("Tickek booking successfull");
		}
		else
		{
			System.out.println("Tickek booking un successfull");
		}
		driver.close();
	}
}
