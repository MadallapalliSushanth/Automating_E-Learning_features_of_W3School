package com.sit.com.sit.W3School;

import org.testng.annotations.Test;

import com.sit.W3School.Test_search_bar;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Test_search extends Test_search_bar {
	String driverPath = "./Resourses/chromedriver.exe";
    public WebDriver driver ; 
  @Test
  public void fnverify_search_w3school() throws InterruptedException {
	  WebElement element=driver.findElement(By.xpath("//button[@onclick='click_learntocode_search_btn()']"));
		element.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		if(element!=null) {
			System.out.println("search bar passed");
		}
		else {
			System.out.println("search bar fail");
		}
	  
  }
  @Test
  public void fnverify_search1_w3school() throws InterruptedException {
	  WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search our tutorials, e.g. HTML']"));
		highlightermethod(driver,search);
		search.sendKeys("html");
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
