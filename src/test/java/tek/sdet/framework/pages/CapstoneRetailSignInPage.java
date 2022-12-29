package tek.sdet.framework.pages;

import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class CapstoneRetailSignInPage extends BaseSetup {
	
	private RetailHomePage homePage;
	private RetailHomePage signInPage;
	private RetailHomePage accountPage;
	
		public CapstoneRetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
		
	}

}
