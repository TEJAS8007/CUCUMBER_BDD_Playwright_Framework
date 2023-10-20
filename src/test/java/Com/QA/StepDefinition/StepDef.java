package Com.QA.StepDefinition;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import Com.QA.Base.BaseClass;
import Com.QA.Pages.HomePage;
import Com.QA.Pages.LoginPage;
import Com.utilities.PropertiesHandler;
import io.cucumber.java.en.*;


public class StepDef extends BaseClass{

	@Given("^user should navigate to \"(.*)\"$")
	public void user_should_navigate_to(String url)   {
		playwright=Playwright.create();
		browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		context=browser.newContext();
		page=context.newPage();
		homepage=new HomePage(page);
		login=new LoginPage(page);
		prop=new PropertiesHandler();
		pro= prop.init_Prop();
		page.navigate(url);
	}

	@When("^user should validate title as \"(.*)\"$")
	public void user_should_validate_title_as(String title)   {
		String Expectedtitle= homepage.getTitle();
		System.out.println(Expectedtitle);
	}

	@When("^User shoulg validate url as \"(.*)\"$")
	public void user_shoulg_validate_url_as(String url)   {
		String Expectedurl= homepage.geturl();
		System.out.println(Expectedurl);
	}

	@When("^user should verify products displayed on HomePage$")
	public void user_should_verify_products_displayed_on_HomePage()   {
        int productCount= homepage.getAllHomePageProducts();
        System.out.println(productCount);
	}

	@When("^user should Evaluate Home Page logo$")
	public void user_should_Evaluate_Home_Page_logo()   {
		boolean found= homepage.VerifyHomePageLogo();
		System.out.println(found);
	}

	@When("^user should verify Footer Content$")
	public void user_should_verify_Footer_Content()   {
		int footercount= homepage.getAllHomePageFooterTexts();
		System.out.println(footercount);
	}

	@When("^user validate HyperLink on WebPage$")
	public void user_validate_HyperLink_on_WebPage() throws Throwable {
		int hyperlinkcount= homepage.CounAllHyperLinkOnWebPage();
		System.out.println(hyperlinkcount);
	}

	@Then("^Home Page Validation is Complete$")
	public void home_Page_Validation_is_Complete() throws Throwable {
		System.out.println("Complete");
	}

	@Given("^user should have completely validated Home Page$")
	public void user_should_have_completely_validated_Home_Page() throws Throwable {
		System.out.println("Home Page Done");
	}

	@When("^user should click on login Logo$")
	public void user_should_click_on_login_Logo() throws Throwable {
		login.clickonLoginLogo();
	}

	@Then("^user should perform login Action$")
	public void user_should_perform_login_Action()   {
		login.performLoginAction(pro.getProperty("username"), pro.getProperty("password"));
	}

	@Then("^login action should be completed$")
	public void login_action_should_be_completed() throws Throwable {
		System.out.println("Hey Bhagwan");
	}

}
