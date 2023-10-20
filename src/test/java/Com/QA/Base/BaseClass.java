package Com.QA.Base;

import java.util.Properties;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import Com.QA.Pages.HomePage;
import Com.QA.Pages.LoginPage;
import Com.utilities.PropertiesHandler;

public class BaseClass {

	protected static Playwright playwright;
	protected static Browser browser;
	protected static BrowserContext context;
	protected static Page page;
	protected static HomePage homepage;
	protected static LoginPage login;
    protected PropertiesHandler prop;
    protected Properties pro;
	
}
