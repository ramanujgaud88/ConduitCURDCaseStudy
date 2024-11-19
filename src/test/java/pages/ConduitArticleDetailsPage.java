package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConduitArticleDetailsPage {
	@FindBy(xpath = "//div[@class='article-page']/*[1]/*[1]/*[1]") WebElement articlePageElement;
	@FindBy(xpath = "(//*[text() = ' Edit Article'])[1]") WebElement editArticleArticleDetailsPage;
	@FindBy(xpath = "(//*[text() = ' Delete Article'])[1]") WebElement deleteArticleArticleDetailsPage;
	@FindBy(xpath = "//*[@class='article-page']//*[@class='banner']//*[@class='container']") WebElement artTitle;
	@FindBy(xpath = "//*[@class='row article-content']/*[1]/*[1]") WebElement artContent;
	
	public ConduitArticleDetailsPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnEditArticle() {
		editArticleArticleDetailsPage.click();
	}
	public void clickOnDeleteArticle() {
		deleteArticleArticleDetailsPage.click();
	}
	
	public boolean isOnArticleDetailsPage() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("To Check if Article Details Page is loaded I have validated Article Title using 'article-page' class");
		return articlePageElement.isDisplayed();
	}
	
	public String getArticleContentFromArticleDetailsPage() throws InterruptedException {
		Thread.sleep(5000);
		return artContent.getText();
	}
}
