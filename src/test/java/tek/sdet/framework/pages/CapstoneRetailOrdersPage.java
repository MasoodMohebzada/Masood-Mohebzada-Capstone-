package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class CapstoneRetailOrdersPage extends BaseSetup{
	
	public CapstoneRetailOrdersPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	@FindBy(xpath="//p[@class= 'order__item-img']")
	public WebElement firstorderItem; 
	
	@FindBy(id="cancelBtn")
	public WebElement cancelButton; 
	
	@FindBy(id= "reasonInput")
	public WebElement cancelationReasonDropDown; 
	
	@FindBy(xpath="//button[@class='order__cancel-submit']")
	public WebElement CancelOrderButton; 
	
	@FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
	public WebElement yourOrderHasBeenCancelledMessage; 
	
	@FindBy(id = "returnBtn")
	public WebElement returnItemButton;
	
	@FindBy(id ="dropOffInput")
	public WebElement dropOffDropDown;
	
	@FindBy(xpath ="//p[text()='Return was successfull']")
	public WebElement returnWasSuccessfullMessage;
	
	@FindBy(id ="reviewBtn")
	public WebElement reviewButton;
	
	@FindBy(id ="headlineInput")
	public WebElement reviewHeadlineInput;
	
	@FindBy(id ="descriptionInput")
	public WebElement  reviewDescriptionInput;
	
	@FindBy(id ="reviewSubmitBtn")
	public WebElement reviewSubmitButton;
	
	@FindBy(xpath ="//div[text()='Your review was added successfully']")
	public WebElement yourReviewWasAddedSuccessfullyMessage;
	
	
	
	
	
	
	
	

}
