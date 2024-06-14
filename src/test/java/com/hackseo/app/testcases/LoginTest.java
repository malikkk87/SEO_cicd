package com.hackseo.app.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.hackseo.app.base.BaseTest;
import com.hackseo.app.factory.DriverFactory;
import com.hackseo.app.pages.LoginPage;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class LoginTest extends BaseTest {

		@Story("Login avec un Email Et Password")
		@Description("je vais connecté dans le site et je mettre le login et le mot de passe puis je vais clické a la button connexion")
		@Test(description = "Connecté avec Login et Mot De Passe")
		public void ConnecteLoginAvecEmailEtPassword()  {
			LoginPage loginPage=new LoginPage(driver);
			loginPage.load();
			loginPage.login("benamiramalek@gmail.com","benamiramalek@gmail.com");
			boolean isHacKTheSeaIsDisplayed=driver.findElement(By.xpath("//img[@class='header-brand-img desktop-lgo']")).isDisplayed();
			AssertJUnit.assertTrue(isHacKTheSeaIsDisplayed);
	}
		
		
		@Story("Mot De Passe Oublié")
		 @Test(description ="mot de passe oublié")
		 public void ForgetPasword() {
			LoginPage loginPage=new LoginPage(driver);
			loginPage.load();
			loginPage.forget_password("benamiramalek@gmail.com","benamiramalek@gmail.com");
			
			
			
	}
	}


 
