package Com.QA.Pages;

import com.microsoft.playwright.*;

public class HomePage {


	Page page;

	private String HomePageLogo="a#nava";
	private String HomePageProducts="div[class='col-lg-9'] :nth-child(3)";
	private String HomePageFooterLinks="div#fotcont";
	private String HomePageAllHyperlink="a";

	public HomePage(Page page) {
		this.page=page;
	}

	public String getTitle() {
		String title= page.title();
		return title;
	}

	public String geturl() {
		String url= page.url();
		return url;
	}

	public boolean VerifyHomePageLogo() {
		boolean found;
		if(page.locator(HomePageLogo).isVisible()) {
			found=true;

			if(found=true) {
				String text= page.locator(HomePageLogo).textContent();
				System.out.println(text);
			}
			else {
				System.out.println("HomePageLocator no found..");
			}
		}
		else {
			found=false;
		}
		return found;
	}

	public int getAllHomePageProducts() {
		int count=0;
		Locator products= page.locator(HomePageProducts);

		for(int a=0;a<products.count();a++) {
			String text= products.nth(a).textContent();
			System.out.println(text);
			count++;
		}
		return count;
	}

	public int getAllHomePageFooterTexts() {
		int count=0;

		Locator footer= page.locator(HomePageFooterLinks);
		for(int a=0;a<footer.count();a++) {
			if(footer.isVisible()) {
				String text= footer.nth(a).textContent();
				System.out.println(text);
			}
			else {
				System.out.println("Footer Not Found");
			}
			count++;
		}
		return count;
	}

	public int CounAllHyperLinkOnWebPage() {
		int count=0;

		Locator links= page.locator(HomePageAllHyperlink);

		for(int a=0;a<links.count();a++) {
			String text= links.nth(a).textContent();
			System.out.println(text);
			count++;
		}
		return count;
	}
}


