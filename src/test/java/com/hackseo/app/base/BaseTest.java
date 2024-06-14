package com.hackseo.app.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.hackseo.app.factory.DriverFactory;

public class BaseTest {
   protected  WebDriver driver;
   
   
   
  @BeforeMethod
   public void setup() {
	  driver=new DriverFactory().initaliser_le_driver();
  }
  @AfterMethod
  public void teardown() {
	  driver.quit();
  }
}
