package com.hackseo.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hackseo.app.base.BasePage;

public class AjouterSitePage extends BasePage {

	public AjouterSitePage(WebDriver driver) {
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
	
	

	@FindBy(id = "dropdownMenuButton1")
    private WebElement dropdown;
	
	@FindBy(id = "add-site")
    private WebElement addSite;
	
	@FindBy(id = "site-input")
    private WebElement siteinput;
	
	@FindBy(id = "submit-btn")
    private WebElement submit_btn;
	
	public void load() {
		driver.get("https://app.hacktheseo.com/");
	}
	
	public void AddSite(String email,String password,String site) {
		button_connexion.click();
		emailInput.sendKeys(email);
		passowrdInput.sendKeys(password);
		submit.click();
		dropdown.click();
		addSite.click();
		siteinput.sendKeys(site);
		submit_btn.click();
	}
}

