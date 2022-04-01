package com.sit.com.sit.W3School;

import org.testng.annotations.Test;

import com.sit.W3School.Test_logo;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Test_logs extends Test_logo {
	String driverPath = "./Resourses/chromedriver.exe";
    public WebDriver driver ; 
  @Test
  public void fnverify_logos_w3school() throws InterruptedException {
	  WebElement logo = driver.findElement(By.xpath("//a[@class='w3-bar-item w3-button w3-hover-none w3-left w3-padding-16']"));
		highlightermethod(driver,logo);
		Thread.sleep(3000);
		logo.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String expectedtitle="W3Schools Online Web Tutorials";
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		if(expectedtitle.equals(actualtitle)==true) {
			System.out.println("Website logo Test passed");
		}
		else {
			System.out.println("Website logo test fail");
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
