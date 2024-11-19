package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConduitLoginPage {
	@FindBy(name = "email") WebElement emailid;
	@FindBy(name = "password") WebElement password;
	@FindBy(xpath = "(//*[text()='Login'])[2]") WebElement loginButton;
	
	public ConduitLoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void couditValidLogin(String emailId, String passWord){
		emailid.sendKeys(emailId);
		password.sendKeys(passWord);
		loginButton.click();
	}
}
