package com.sit.com.sit.W3School;

import org.testng.annotations.Test;

import com.sit.W3School.Test_insta;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Test_Instagram extends Test_insta{
	String driverPath = "./Resourses/chromedriver.exe";
    public WebDriver driver ; 
  @Test
  public void fnverify_Insta_w3school() throws InterruptedException {
	  WebElement W3insta = driver.findElement(By.xpath("//a[@title='W3Schools on Instagram']"));
		highlightermethod(driver,W3insta);
		Thread.sleep(3000);
		W3insta.click();
		if(W3insta.isDisplayed()) {
			System.out.println("W3School instagram test passed");
		}
		else {
			System.out.println("W3School instagram test fail");
		}
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
