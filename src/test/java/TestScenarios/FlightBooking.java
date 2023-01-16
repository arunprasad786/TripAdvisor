package TestScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.HotelHomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightBooking {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.tripadvisor.in/");
	}

	@Test
	public void HotelBooking() {
		HotelHomePage hotels = new HotelHomePage(driver);
		hotels.selectHotelsTab();
		hotels.enterHotelName("Park Elanza Coimbatore");

	}

	@AfterTest
	public void afterTest() {

		driver.quit();
	}

}
