 	package tek.sdet.framework.pages;
 	
 	import tek.sdet.framework.base.BaseSetup;
import tek.sdet.framework.steps.CapstoneRetailOrdersSteps;
 	
 	public class POMFactory extends BaseSetup {
	
	private static final CapstoneRetailOrdersPage CapstoneRetailOrdersPage = null;
	private RetailHomePage homePage;
	private RetailSignInPage signInPage;
	private CapstoneRetailAccountPage accountPage;
	private CapstoneRetailOrdersSteps ordersPage;
	
	
	
    public POMFactory() {
	this.homePage = new RetailHomePage();
	this.signInPage = new RetailSignInPage();
	this.accountPage = new CapstoneRetailAccountPage();
	this.ordersPage = new CapstoneRetailOrdersSteps();
	
    }
	public RetailHomePage homePage() {
		return this.homePage;
		
	}	
	public RetailSignInPage signInPage() {
		
		return this.signInPage;
    }
	public CapstoneRetailAccountPage accountPage() { 
		return this.accountPage;
	

	}
	public CapstoneRetailOrdersPage ordersPage() {
		return this.ordersPage();
		
		
	}
 	}
