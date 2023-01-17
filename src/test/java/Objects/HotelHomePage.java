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

	By selectHotel = By.xpath("//div[text()='Hotel Park Elanza Coimbatore']");

	By checkinDatePicker = By.xpath("//div[@data-automation='checkin']");

	By fromDate = By.xpath("//div[@aria-label='Tue Jan 24 2023']");

	By toDate = By.xpath("//div[@aria-label='Wed Jan 25 2023']");
	
	By updateGuests = By.xpath("//button[text()='Update']");
	
	By viewDeals = By.xpath("//div[@data-provider='BookingCom']/div/div[3]/div/span");

	public void selectHotelsTab() {

		driver.findElement(hotelsTab).click();
	}

	public void enterHotelName(String hotelName) {

		driver.findElement(hotelSearchBox).sendKeys(hotelName);
	}

	public void selectHotel() {

		driver.findElement(selectHotel).click();
	}

	public void selectFromDate() {

		driver.findElement(fromDate).click();
	}

	public void selectToDate() {

		driver.findElement(toDate).click();
	}
	
	public void updateGuests() {

		driver.findElement(updateGuests).click();
	}
	
	public void viewDeals() throws InterruptedException {

		driver.findElement(viewDeals).click();
	}

}
