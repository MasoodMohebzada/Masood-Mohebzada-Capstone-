package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class CapstoneRetailAccountPage extends BaseSetup{
	
	public static final WebElement confirmPasswordInput = null;

	public CapstoneRetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(id= "nameInput")
	public WebElement nameField;
	
	@FindBy(id= "personalPhoneInput" )
	public WebElement phoneInputField;
	
	@FindBy(id= "emailInput" )
	public WebElement emailInputField;
	
	@FindBy(xpath ="//button[text()='Update']" )
	public WebElement updateButton;
	
	@FindBy(xpath ="//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInformationUpdateMessage1;
	
	@FindBy(id="prevoiusPasswordInput")
	public WebElement prevoiusPasswordInput;
	
	@FindBy(id="newPasswordInput")
	public WebElement newPasswordInput;
	
	@FindBy(id="confirmPasswordInput")
	public WebElement confimPasswordInput1;
		
	@FindBy(id="credentialSubmitBtn")
	public WebElement changePasswordButton;
	
	@FindBy(xpath="//div[text()='Password Updated Successfully']")
	public WebElement passwordUpdatedSuccessfulyMess;
	
	@FindBy(xpath="//p[text()='Add a payment method']")
	public WebElement addPaymentMethodLink;
	
	@FindBy(id="cardNUmberInput")
	public WebElement cardNumberInput;
	
	@FindBy(id="nameOnCardInput")
	public WebElement nameOnCardInput1;
	
	@FindBy(id="expirationMonthInput")
	public WebElement expirationMonthInput;
	
	@FindBy(id="expirationYearInput")
	public WebElement expirationYearInput ;
	
	@FindBy(id="securityCodeInput")
	public WebElement securityCodeInput;
	
	@FindBy(id="paymentSubnitBtn")
	public WebElement addYourCardbutton;
	
	@FindBy(xpath="//div[text()='Payment Method added successfully']")
	public WebElement paymentMethodAddedSuccessfullyMessage;
	
	@FindBy(xpath="//div[@class='account_payment-sub']/p")
	public List<WebElement> cardEndingNumber;
	
	@FindBy(xpath="//button[text()='Edit']")
	public WebElement cardEditButton;
	
	@FindBy(xpath="//button[text()='Update Your Card']")
	public WebElement updateYourCardButton; 
	
	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement paymentMethodUpdatedSuccessfullyMessage;
	
	@FindBy(xpath ="//button[text()='remove']")
	public WebElement removeCardLink;
	
	@FindBy(xpath ="//div[@class='account__payment-sub']")
	public WebElement cardPresent;
	
	@FindBy(xpath ="//p[text()='Add Address']")
	public WebElement addAddressButton; 
	
	@FindBy(id ="countryDropdown")
	public WebElement countryDropDown;
	
	@FindBy(id ="fullNameInput")
	public WebElement addressFullNameInput;
	
	@FindBy(id ="phoneNumberInput")
	public WebElement addressPhoneNumberInput;
	
	@FindBy(id ="streetInput")
	public WebElement addressInput; 
	
	@FindBy(id ="apartmentInput")
	public WebElement apartmentInput;
	
	@FindBy(id ="cityInput")
	public WebElement cityInput;
	
	@FindBy(xpath ="//select[@name='state']")
	public WebElement stateInput;
	
	@FindBy(id ="zipCodeInput")
	public WebElement zipCodeInput;
	
	@FindBy(id="addressBtn")
	public WebElement addYourAddress;
	
	@FindBy(xpath= "//div[text()='Address Added Successfully']")
	public WebElement addAddressSuccessfullyMessage;
	
	@FindBy(xpath="//button[text()='Edit']")
	public WebElement editAddressButton;
	
	@FindBy(xpath="//button[text()'Update Your Address']")
	public WebElement updateAddressButton; 
	
	@FindBy(xpath ="//div[text()='Address Updated Successfully']")
	public WebElement addressUpdatedSuccessfullyMessage;
	
	@FindBy(xpath ="//button[text()='Remove']")
	public WebElement removeAddressOption;
	
	
	
	
	
	
	
	
	
	
	
}
	
	

















	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


