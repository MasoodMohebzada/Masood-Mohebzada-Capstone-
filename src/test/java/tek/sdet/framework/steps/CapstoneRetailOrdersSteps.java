package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class CapstoneRetailOrdersSteps extends CommonUtility{

	POMFactory factory = new POMFactory();
	private Object expected;
	
	@Then("User click on orders section")
	public void userClickOnOrdersSection() {
		click(factory.homePage().ordersOption);
		logger.info("user clicked on orders section");
		
	}
	@Then("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.ordersPage().firstorderItem);
		logger.info("user clicked on first order in list");
		
	}
	@Then("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.ordersPage().cancelButton);
		logger.info("user clicked on Cancel The Order button");
		
	}
	@Then("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String reason) {
		selectByVisibleText(factory.ordersPage().cancelationReasonDropDown, reason);
		logger.info("user selected the cancelation Reason " + reason);
		
		
	}
	@Then("User click on Cancel order button")
	public void userClickOnCancelOrderButton() {
		click(factory.ordersPage().CancelOrderButton);
		logger.info("User clicked on Cancel Order Button");
		
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String expectedMessage) {
		
		if(expectedMessage.contains("Your Order Has Been Cancelled")) {
		Assert.assertEquals(expectedMessage, factory.ordersPage().yourOrderHasBeenCancelledMessage.getText());
		logger.info("a cancelation message displayed " +expectedMessage);	
	    }else if(expectedMessage.contains("Return was successfull")){
		Assert.assertEquals(expectedMessage, factory.ordersPage().returnWasSuccessfullMessage.getText());
		logger.info("a cancelation message displayed " +expectedMessage);
        }
}
	@Then("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.ordersPage().returnItemButton);
		logger.info("user clicked on Return Items Button");
		
		
	}
	@Then("User select the Return Reason{string}")
	public void userSelectTheReturnReason(String reason) {
		selectByVisibleText(factory.ordersPage().cancelationReasonDropDown, reason);
		logger.info("user selected the cancelation Reason " + reason);
		
	}
	@Then("User select the drop off service {string}")
	public void userSelectTheDropOffService(String dropOffLocation) {
		selectByVisibleText(factory.ordersPage().dropOffDropDown,dropOffLocation);
		logger.info("User select the drop off service" + dropOffLocation);
		
		
	}
	@Then("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.ordersPage().CancelOrderButton);
		logger.info("User click on Return Order button");
		
	}
	@Then("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.ordersPage().reviewButton);
		logger.info("user click on Review Button");
		
	}
	@Then("User write REview headline {string} and {string}")
	public void userWriteREviewHeadlineAnd(String headline, String body) {
		sendText(factory.ordersPage().reviewHeadlineInput, headline);
		sendText(factory.ordersPage().reviewDescriptionInput, body);
		logger.info("user wrote review on product");
		
	}
	@Then("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.ordersPage().reviewSubmitButton);
		logger.info("user clicked add your review button");
		
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String string) {
		waitTillPresence(factory.ordersPage().yourReviewWasAddedSuccessfullyMessage);
		Assert.assertEquals(factory.ordersPage().yourReviewWasAddedSuccessfullyMessage.getText(), expected);
		logger.info("a review message displayed");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
