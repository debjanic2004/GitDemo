package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest {
	@Test
	public void amazonHomePageTest() {
		System.setProperty("webdriver.chrome.driver","/Users/Debjani/Documents/GitX/chromedriver");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.amazon.com/");
		Actions a=new Actions(dr);
		a.moveToElement(dr.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"))).build().perform();
		
		dr.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
		dr.findElement(By.cssSelector("#ap_email")).sendKeys("debchou@gmail.com");
		dr.findElement(By.cssSelector("#continue")).click();
		String txt=dr.findElement(By.cssSelector(".a-list-item")).getText();
		String exp="We cannot find an account with that email address"; 
		Assert.assertEquals(txt, exp);
		
	}

}
