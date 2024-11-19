package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConduitGlobalFeedPage {
	@FindBy(xpath = "//*[@class=\"nav-link active\" and text()='Global Feed']") WebElement globalPageCheck;
	@FindBy(xpath = "(//div[@class='article-preview'][1])/*[2]") WebElement latestArticle;
	
	
	public ConduitGlobalFeedPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public boolean isOnGlobalPage() {
		return globalPageCheck.isDisplayed();
	}
	
	public void clickOnLatestArticle() {
		latestArticle.click();
	}
}
