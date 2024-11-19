package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConduitHomePage {
	@FindBy(xpath = "//*[text()= 'Home']") WebElement homepageButton;
	@FindBy(xpath = "//*[text()= 'New Article']") WebElement newArticleButton;
	@FindBy(xpath = "//*[text()= 'Your Feed']") WebElement yourFeedButton;
	@FindBy(xpath = "//*[text()= 'Global Feed']") WebElement globleFeedButton;
	
	public ConduitHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void navigateToHomePage(){
		homepageButton.click();
	}
	public void navigateToNewArticlePage(){
		homepageButton.click();
		newArticleButton.click();
	}
	public void navigateToYourFeedPage(){
		homepageButton.click();
		yourFeedButton.click();
	}
	public void navigateToGlobleFeedPage(){
		homepageButton.click();
		globleFeedButton.click();
	}
	public boolean isOnHomePage(){
		return homepageButton.isDisplayed();
	}

}
