package xyz.bank.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import xyz.bank.utility.Utility;

public class CustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomerPage.class.getName());

    public void CustomersPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@placeholder='Search Customer']")
    WebElement _searchCustomerField;

    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    WebElement _deleteCustomer;

    public void clickOnSearchCustomerField() {
        log.info(" Clicking on search customer field" + _searchCustomerField.toString());
        clickOnElement(_searchCustomerField);

    }

    public void enterCustomerThatCreatedInCustomerPage(String customerField) {
        log.info(" Enter text " + customerField + " to search customer field" + _searchCustomerField.toString());
        sendTextToElement(_searchCustomerField, customerField);

    }

    public void clickOnDeleteButton() {
        log.info(" Delete customer " + _deleteCustomer.toString());
        clickOnElement(_deleteCustomer);

    }

}


