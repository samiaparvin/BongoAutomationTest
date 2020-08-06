package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;

//the sleep function has been given after every event so that they can be seen clearly

public class HomePageTest {
	WebDriver driver = new FirefoxDriver();
    JavascriptExecutor js = (JavascriptExecutor) driver;
	
	 @BeforeTest
	    public void startBrowserTNG() throws InterruptedException {
	        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
	        driver.get("https://bongobd.com/");
	        Thread.sleep(5000);
	    }
	 
	 @Test (priority = 1)
	 public void LocateVideoContentAndClick() throws InterruptedException
	    {
		        js.executeScript("window.scrollBy(0, 350)");
		        Thread.sleep(5000);
	            HomePage Hp = PageFactory.initElements(driver, HomePage.class);
	            Hp.ClickOnContent();
	            Thread.sleep(10000);
	    }
	 
	 @Test (priority = 2)
	 public void PlayLocatedVideoContent() throws InterruptedException
	    {
	            HomePage Hp = PageFactory.initElements(driver, HomePage.class);
	            Hp.ClickToPlayContent();
	            Thread.sleep(20000);
	    }
	 
	 
	    @AfterTest
	    public void tearDownTNG() {
	    	driver.quit();
	        
	    }
	
}
