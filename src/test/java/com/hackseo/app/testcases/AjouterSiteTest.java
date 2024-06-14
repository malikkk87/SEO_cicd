package com.hackseo.app.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.hackseo.app.base.BaseTest;
import com.hackseo.app.factory.DriverFactory;
import com.hackseo.app.pages.AjouterSitePage;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class AjouterSiteTest extends BaseTest {
	
	
	public void addsite() {
		AjouterSitePage ajoutersitepage=new AjouterSitePage(driver);
		ajoutersitepage.load();
		ajoutersitepage.AddSite("benamiramalek@gmail.com", "benamiramalek@gmail.com","https://fr.linkedin.com/" );
		
	
		
		
	}

}


