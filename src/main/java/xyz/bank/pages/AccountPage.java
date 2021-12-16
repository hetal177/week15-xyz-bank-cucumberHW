package xyz.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());
    public AccountPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement _verifylogOutText;

    @FindBy(xpath = "//button[contains(text(),'Deposit')]")
    WebElement _depositeTab;

    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement _amountToBeDepositedField;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement _depositebtn;

    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement _verifyDepositSuccessfulText;

    @FindBy(xpath = "//button[contains(text(),'Withdrawl')]")
    WebElement _withdrawlTab;

    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement _amountToBeWithdrawlsField;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement _withdrawlBtn;

    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement verifyTransactionSuccessfulText;

    public void assertLogOutText(String logOutTxt) {
        Reporter.log(" Verify logout text " + logOutTxt + " dispalyed on login page" + _verifylogOutText.toString() + "<br>");
        verifyText(_verifylogOutText, "Logout");

    }

    public void clickOnLogOutButton() {
        log.info(" Click on logout button " + _verifylogOutText.toString());
        clickOnElement(_verifylogOutText);

    }

    // Method for click ondeposit tab
    public void clickOnDepositeTab() {
        log.info(" Click on deposit tab " + _depositeTab.toString());
        clickOnElement(_depositeTab);


    }

    // Method for enter deposit field
    public void enterdDepositAmount100(int amount) {
        log.info(" Enter £100 on deposit field " + _amountToBeDepositedField.toString());
        sendTextToElement(this._amountToBeDepositedField, String.valueOf(amount));

    }

    // Method for Click on deposit button
    public void clickOnDepositeButton() {
        log.info(" Clicking on deposite button " + _depositebtn.toString());
        clickOnElement(_depositebtn);

    }

    public void assertDepositeSuccessfulText(String depSuccessTxt) {
        log.info(" Verify Deposite successful text " + depSuccessTxt + " displayed on account page" + _verifyDepositSuccessfulText.toString());
        verifyText(_verifyDepositSuccessfulText, "Deposit Successful");

    }

    public void clickOnWithdrawlTab() {
        log.info(" Clicking withdrawal tab" + _withdrawlTab.toString());
        clickOnElement(_withdrawlTab);

    }

    public void enterWithdrawlAmount50(String withdrawalAmt) {
        log.info(" Enter £50 in withdrawal field" + withdrawalAmt + " to withdraw money" + _amountToBeWithdrawlsField.toString());
        sendTextToElement(_amountToBeWithdrawlsField, withdrawalAmt);

    }

    public void clicOnWithdrawlButton() {
        log.info(" Clicking withdrawal button " + _withdrawlBtn.toString());
        clickOnElement(_withdrawlBtn);

    }

    public void assertTransactionSuccessfulText(String tranSuccessTxt) {
        log.info(" Verify transaction success text " + tranSuccessTxt + " for withdrawal amt" + _verifyDepositSuccessfulText.toString());
        verifyText(verifyTransactionSuccessfulText, "Transaction successful");

    }
}


