package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelHomePage {

	WebDriver driver;

	public HotelHomePage(WebDriver driver) {

		this.driver = driver;

	}

	By hotelsTab = By.xpath("//span[text()='Hotels']	");

	By hotelSearchBox = By.xpath("//div[@class='kaEuY']/div/form/input[@type='search'] [@placeholder='Where to?']");

	By tajHotel = By.xpath("//div[text()='Taj Coromandel Chennai']");

	public void selectHotelsTab() {

		driver.findElement(hotelsTab).click();
	}

	public void enterHotelName( String hotelName) {		
		
		driver.findElement(hotelSearchBox).sendKeys(hotelName);
	}

}
