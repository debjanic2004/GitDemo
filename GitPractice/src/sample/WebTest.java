package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTest {
	@Test
	public void amazonHomePageTest() {
		System.setProperty("webdriver.chrome.driver","/Users/Debjani/Documents/GitX/chromedriver");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.amazon.com/");
		
	}

}
