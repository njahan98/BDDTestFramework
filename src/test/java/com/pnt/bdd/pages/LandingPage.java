package com.pnt.bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LandingPage {
    @FindBy(xpath = "//img[@class='fb_logo _8ilh img']")
    private WebElement fbLogo;

    @FindBy(linkText = "Log In")
    private WebElement logInBtnFooter;

    @FindBy(id = "u_0_b")
    private WebElement logInBtn;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "pass")
    private WebElement passwordField;

    @FindBy(xpath = "//div[@class='_9ay7']")
    private WebElement errorMessage;

    public void validateFBLogIsDisplayed() {
        Assert.assertTrue(fbLogo.isDisplayed());
    }

    public void clickOnLoginButtonFromFooter() {
        logInBtnFooter.click();
    }

    public void clickOnLoginButton() {
        logInBtn.click();
    }

    public void fillUserNameAndPasswordField(String username, String password) {
        emailField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    public void validateErrorLoginMessage() {
        errorMessage.isDisplayed();
    }

}