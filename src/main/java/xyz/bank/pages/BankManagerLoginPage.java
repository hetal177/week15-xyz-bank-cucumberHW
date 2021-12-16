package xyz.bank.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import xyz.bank.utility.Utility;

public class BankManagerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());
    public BankManagerLoginPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement _addCustomerLink;

    @FindBy(xpath = "//button[contains(text(),'Open Account')]")
    WebElement _openAccountLink;

    @FindBy(xpath = "//button[contains(text(),'Customers')]")
    WebElement _customersLink;


    public void clickOnAddCustomerLink() {
        log.info(" Clicking on add customer link" + _addCustomerLink.toString());
        clickOnElement(_addCustomerLink);


    }

    public void clickOnOpenAccountLink() {
        log.info(" Clicking on open account link" + _openAccountLink.toString());
        clickOnElement(_openAccountLink);

    }

    public void clickOnCustomersLink() {
        log.info(" Clickink on customer link" + _customersLink.toString());
        clickOnElement(_customersLink);

    }

}

