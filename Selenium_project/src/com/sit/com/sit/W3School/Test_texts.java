package com.sit.com.sit.W3School;

import org.testng.annotations.Test;

import com.sit.W3School.Test_text;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Test_texts extends Test_text{
	String driverPath = "./Resourses/chromedriver.exe";
    public WebDriver driver ;
  @Test
  public void fnverify_text_w3school() {
	  WebElement Tesxt = driver.findElement(By.className("learntocodeh1"));
		highlightermethod(driver,Tesxt);
		if(Tesxt.isDisplayed());
		System.out.println("text message option for  is displayed");
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
