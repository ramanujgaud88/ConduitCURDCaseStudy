package stepDefs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pages.ConduitArticleDetailsPage;
import pages.ConduitArticleEditorPage;
import pages.ConduitGlobalFeedPage;
import pages.ConduitHomePage;
import pages.ConduitLoginPage;

public class ConduitCURDStefDef  {
	WebDriver driver = TestBase.getDriver();
	ConduitLoginPage loginPage;
	ConduitGlobalFeedPage globFeedPgae;
	ConduitArticleDetailsPage articleDetailspage;
	ConduitHomePage homePage;
	ConduitArticleEditorPage newArtEditorPage;
	
	public ConduitCURDStefDef(){
		loginPage = new ConduitLoginPage(driver);
		globFeedPgae = new ConduitGlobalFeedPage(driver);
		articleDetailspage = new ConduitArticleDetailsPage(driver);
		homePage = new ConduitHomePage(driver);
		newArtEditorPage = new ConduitArticleEditorPage(driver);
	}
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/#/login");
	}
	
	@When("User provide {string} and {string}")
	public void user_provide_and(String userEmail, String password) {
		loginPage.couditValidLogin(userEmail, password);		
	}
	
	@Then("User should be on Home page")
	public void user_should_be_on_home_page() {
		Assert.assertTrue(homePage.isOnHomePage());
	}
	
	@Given("User should be on New Article Page")
	public void user_should_be_on_new_article_page() {
		homePage.navigateToNewArticlePage();
		Assert.assertTrue(newArtEditorPage.isOnNewArticleEditorPage());
	}
	
	@When("User enters Article details")
	public void user_enters_article_details(DataTable dataTable1) {
		List<List<String>> data = dataTable1.asLists();
		String artTitle = data.get(0).get(0);
		String artDesc = data.get(0).get(1);
		String artContent = data.get(0).get(2);
		String artTags = data.get(0).get(3);
		
	newArtEditorPage.publishArticleWIthNewDetails(artTitle, artDesc, artContent, artTags);		
	}
	
	@Then("Article must be created")	
	public void article_must_be_created() {
		Assert.assertTrue(articleDetailspage.isOnArticleDetailsPage());
	}

}
