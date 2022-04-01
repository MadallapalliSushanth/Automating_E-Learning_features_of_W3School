package com.sit.com.sit.W3School;

import org.testng.annotations.Test;

import com.sit.W3School.Test_About;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Test_terms extends Test_About{
	
	String driverPath = "./Resourses/chromedriver.exe";
    public WebDriver driver ; 
  @Test
  public void fnverify_aboutlink_w3school() throws InterruptedException {
	  WebElement W3About = driver.findElement(By.xpath("//a[@title='About W3Schools']"));
		highlightermethod(driver,W3About);
		Thread.sleep(3000);
		W3About.click();
		if(W3About!=null) {
			System.out.println("W3School About,Terms,Privacy test pass");
		}
		else {
			System.out.println("W3School about test fail");
		}
	}
  
  @Test
  public void fnverify_privacy_w3school() throws InterruptedException{
	  WebElement Aboutterms = driver.findElement(By.linkText("About Terms"));
		Thread.sleep(1500);
		Aboutterms.click();
  }
  @Test
  public void fnverify_tems_w3school() throws InterruptedException {
	  WebElement Aboutprivacy = driver.findElement(By.linkText("About Privacy"));
		Thread.sleep(1500);
		Aboutprivacy.click();
  }
  @BeforeTest
  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver",driverPath);
			driver = new ChromeDriver();
			driver.get("https://www.w3schools.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }
}
