package Com.QA.Pages;

import com.microsoft.playwright.*;

public class LoginPage {

	Page page;
	

	private String LoginLogo="a#signin2";
	private String loginusernameBox="input#sign-username";
	private String loginpasswordBox="input#sign-password";
	private String loginButton="button[onClick='register()']";
	
	public LoginPage(Page page) {
		this.page=page;
	}
	
	
	public void clickonLoginLogo() {
		page.click(LoginLogo);
	}
	
	public void performLoginAction(String username,String password) {
		page.fill(loginusernameBox, username);
		page.waitForLoadState();
		page.fill(loginpasswordBox, password);
		page.waitForLoadState();
		page.click(loginButton);
	}
}
