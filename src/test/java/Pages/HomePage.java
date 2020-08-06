package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	//Contents of home page
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div/div/div[3]/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/div/button/a/div")
	WebElement video_content;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div/div/div[3]/div/div/div[1]/div/div/div/video-js/button/span[1]")
	WebElement play_content;		
	
    public void ClickOnContent()
    {
    	video_content.click();
    }
    
    public void ClickToPlayContent()
    {
    	play_content.click();
    }
	
}
