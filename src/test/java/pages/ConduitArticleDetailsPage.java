package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConduitArticleDetailsPage {
	@FindBy(xpath = "//div[@class='article-page']/*[1]/*[1]") WebElement articlePageElement;
	@FindBy(xpath = "(//*[text() = ' Edit Article'])[1]") WebElement editArticleArticleDetailsPage;
	@FindBy(xpath = "(//*[text() = ' Delete Article'])[1]") WebElement deleteArticleArticleDetailsPage;
	
	public ConduitArticleDetailsPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnEditArticle() {
		editArticleArticleDetailsPage.click();
	}
	public void clickOnDeleteArticle() {
		deleteArticleArticleDetailsPage.click();
	}
	
	public boolean isOnArticleDetailsPage() {
		return articlePageElement.isDisplayed();
	}
}
