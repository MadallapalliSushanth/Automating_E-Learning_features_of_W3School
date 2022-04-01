package com.sit.com.sit.W3School;

import org.testng.annotations.Test;

import com.sit.W3School.Test_languages;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Test_lang extends Test_languages{
	String driverPath = "./Resourses/chromedriver.exe";
    public WebDriver driver ; 
  @Test
  public void fnverify_lang_w3school() throws InterruptedException {
	  WebElement lang2=driver.findElement(By.xpath("//div[@class='skiptranslate goog-te-gadget']"));
		lang2.click();
		highlightermethod(driver,lang2);
		Thread.sleep(3000);
	  
  }
  @Test
  public void fnverify_lang1_w3school() throws InterruptedException {
	  WebElement lang=driver.findElement(By.xpath("//a[@class='w3-bar-item w3-button bar-icon-hover w3-right w3translatebtntopnav']"));
		lang.click();
		highlightermethod(driver,lang);
		Thread.sleep(3000);
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
