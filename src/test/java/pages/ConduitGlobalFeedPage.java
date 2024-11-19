package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ConduitGlobalFeedPage {
	@FindBy(xpath = "//*[@class=\"nav-link active\" and text()='Global Feed']") WebElement globalPageCheck;
	@FindBy(xpath = "(//div[@class='article-preview'][1])/*[2]/*[1]") WebElement latestArticle;
	
	
	public ConduitGlobalFeedPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public boolean isOnGlobalPage() {
		return globalPageCheck.isDisplayed();
	}
	
	public void validateAndClickOnLatestArticle(WebDriver driver, String artTitle) {
		//Assert.assertEquals(latestArticle.getText(), artTitle);
		String artTitleXpath = "//*[text()= '"+ artTitle + "']";
		driver.findElement(By.xpath(artTitleXpath)).click();
	}
}
