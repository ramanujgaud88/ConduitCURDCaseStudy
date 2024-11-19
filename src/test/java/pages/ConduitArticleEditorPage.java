package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConduitArticleEditorPage {
	@FindBy(xpath = "//*[@placeholder='Article Title']") WebElement artTitle;
	@FindBy(xpath = "//input[@name='description']") WebElement artDesc;
	@FindBy(xpath = "//*[@name='body']") WebElement artContent;
	@FindBy(xpath = "//*[@name='tags']") WebElement artTags;
	@FindBy(xpath = "//*[text()='Publish Article']") WebElement publishArticleButton;
	@FindBy(xpath = "//*[text()='Update Article']") WebElement updateArticleButton;
	
	
	public ConduitArticleEditorPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public boolean isOnNewArticleEditorPage() {
		return artTitle.isDisplayed();
	}
	
	public void publishArticleWIthNewDetails(String Title, String Desc, String Content, String Tags){
		artTitle.sendKeys(Title);
		artDesc.sendKeys(Desc);
		artContent.sendKeys(Content);
		artTags.sendKeys(Tags);
		publishArticleButton.click();
	}
	
	public void updateArticleTitle(String updateValue) {
		artTitle.clear();
		artTitle.sendKeys(updateValue);
		updateArticleButton.click();
	}
	
	public void updateArticleDescription(String updateValue) {
		artDesc.clear();
		artDesc.sendKeys(updateValue);
		updateArticleButton.click();
	}
	
	public void updateArticleContent(String updateValue) {
		artContent.clear();
		artContent.sendKeys(updateValue);
		updateArticleButton.click();
	}
	
	public void updateArticleTag(String updateValue) {
		artTags.clear();
		artTags.sendKeys(updateValue);
		updateArticleButton.click();
	}
}
