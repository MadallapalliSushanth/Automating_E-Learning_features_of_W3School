package com.sit.com.sit.W3School;

import org.testng.annotations.Test;

import com.sit.W3School.Test_tutorials;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Test_tutorilas_bar extends Test_tutorials {
	String driverPath = "./Resourses/chromedriver.exe";
    public WebDriver driver ; 
  @Test
  public void fnverify_tutorials1_w3school() throws InterruptedException {
	  WebElement tuto = driver.findElement(By.id("navbtn_tutorials"));
		highlightermethod(driver,tuto);
		Thread.sleep(3000);
		tuto.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		if(tuto!=null) {
	    	System.out.println("Tutorials Test pass");
	    }
	    else {
	    	System.out.println("Tutorials Test fail");
	    }
  }
  @Test
  public void fnverify_tutorials2_w3school() throws InterruptedException {
	  WebElement cour=driver.findElement(By.xpath("//a[@class='w3-bar-item w3-button']"));
	    highlightermethod(driver,cour);
	    Thread.sleep(3000);
	    cour.sendKeys(Keys.ENTER);
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
