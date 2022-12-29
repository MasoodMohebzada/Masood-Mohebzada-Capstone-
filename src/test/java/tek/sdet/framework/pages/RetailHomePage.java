	package tek.sdet.framework.pages;
	import java.util.List;

import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);

	}

	@FindBy(xpath = "//a[@class='top-nav__logo active']")
	public WebElement logo;

	@FindBy(id = "search")
	public WebElement allDepartments;

	@FindBy(id = "searchInput")
	public WebElement searchInputField;
	
	@FindBy(id = "searchBtn")
	public WebElement searchButton;
	
	@FindBy(xpath ="//img[@alt='PlayStation 5 Console']")
	public WebElement playStationItem;
	
	@FindBy(xpath = "//span[text()='All']") 
	public WebElement allElement;
	
	@FindBy(id="contentHeader")
	public WebElement shopByDepartment;
	
	@FindBy(id="cartBtn")
	public WebElement cart;

	@FindBy(id="signinLink")
	public WebElement signIn;
	
	@FindBy(id="accountLink")
	public WebElement account;
	
	@FindBy(xpath = "//div[@class='sidebar_contact-item']/span'")
	public List<WebElement> sideBar;
	
	
	@FindBy(xpath ="//p[@class='products__name']")
	public WebElement productNameItem; 
	
	@FindBy(xpath ="//select[@class='product__select']")
	public WebElement quantitySelection;
	
	@FindBy(xpath="//span[text()'Add to Cart']")
	public WebElement addToCartButton;
	
	@FindBy(id="cartQuantity")
	public WebElement cartQuantity;
	
	@FindBy(id="proceedBtn")
	public WebElement proceedToCheckOut;
	
	@FindBy(id="addAddressBtn")
	public WebElement addAddressBtnCheckOut; 
	
	@FindBy(id="addPaymentBtn")
	public WebElement addPaymentBtnCheckout;
	
	@FindBy(id="placeOrderBtn")
	public WebElement placeOrderBtn;
	
	@FindBy(xpath = "//p[text()='Order placed, Thanks']")
	public WebElement orderPlacedMessage;
	
	@FindBy(id="orderLink")
	public WebElement ordersOption; 
	
	
	
	
	       
	
	
	
	
	
	
	
}
