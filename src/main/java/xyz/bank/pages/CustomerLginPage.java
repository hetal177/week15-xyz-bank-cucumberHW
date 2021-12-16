package xyz.bank.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import xyz.bank.utility.Utility;

public class CustomerLginPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomerLginPage.class.getName());
    public CustomerLginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement _searchCreatedcustomerName;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement _loginBtn;

    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement _verifyYourNameText;


    public void clickOnLoginButton() {
        log.info(" Clicking onn login button" + _loginBtn.toString());
        clickOnElement(_loginBtn);

    }


    public void assertYourNameText(String yourNameTxt) {
        log.info("Verify your name text " + yourNameTxt + " displayed on login page" + _verifyYourNameText.toString());
        verifyText(_verifyYourNameText, "Your Name :");

    }
}


