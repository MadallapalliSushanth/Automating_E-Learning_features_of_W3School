package com.sit.com.sit.W3School;

import org.testng.annotations.Test;

import com.sit.W3School.Test_mode_conversion;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Test_coloure_conversion extends Test_mode_conversion {
	String driverPath = "./Resourses/chromedriver.exe";
    public WebDriver driver ; 
  @Test
  public void fnverify_mode_convert_w3school() throws InterruptedException {
	  WebElement mode = driver.findElement(By.xpath("//a[@class='w3-bar-item w3-button bar-icon-hover w3-right w3-hide-small']"));
		Thread.sleep(3000);
		mode.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String expectedtitle="W3Schools Online Web Tutorials";
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		if(expectedtitle.equals(actualtitle)==true) {
			System.out.println("Mode Conversion Test passed");
		}
		else {
			System.out.println("Mode Conversion test fail");
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
