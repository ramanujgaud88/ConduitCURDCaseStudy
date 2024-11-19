package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConduitArticleEditorPage {
	@FindBy(xpath = "//input[@placeholder='Article Title']") WebElement artTitle;
	@FindBy(xpath = "//input[@name='description']") WebElement artDesc;
	@FindBy(xpath = "//input[@placeholder='Write your article (in markdown)']") WebElement artContent;
	@FindBy(xpath = "//input[@placeholder='Enter tags']") WebElement artTags;
	@FindBy(xpath = "//input[text()='Publish Article']") WebElement publishArticleButton;
	
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
}
