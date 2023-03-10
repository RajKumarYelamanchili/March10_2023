package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailTxtBox;
	
	public WebElement getEmailTextBox()
	{
		return emailTxtBox;
	}

	public Object getEmailTxtBox() {
		// TODO Auto-generated method stub
		return null;
	}

}
