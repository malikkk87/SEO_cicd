package com.hackseo.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hackseo.app.base.BasePage;

public class LoginPage extends BasePage {
	

	public LoginPage(WebDriver driver) {
		super(driver);
	
	}
	@FindBy(linkText = "Connexion")
	 private WebElement button_connexion;
	
	
	@FindBy(id ="email")
	 private WebElement emailInput;
	
	@FindBy(id = "password")
    private WebElement passowrdInput;
	
	@FindBy(xpath = "//button[@type='submit']")
    private WebElement submit;
	
	@FindBy(linkText = "Vous avez oublié votre mot de passe ?")
	 private WebElement button_oublié;
	
	
	public void login(String email,String password) {
		button_connexion.click();
		emailInput.sendKeys(email);
		passowrdInput.sendKeys(password);
		submit.click();
	}
	public void forget_password(String email,String password) {
		button_connexion.click();
		emailInput.sendKeys(email);
		passowrdInput.sendKeys(password);
		button_oublié.click();
		
	}
	public void load() {
		driver.get("https://app.hacktheseo.com/");
	}
	

}

