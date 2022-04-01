package com.sit.com.sit.W3School;

import org.testng.annotations.Test;

import com.sit.W3School.Test_prev_next_buttons;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Test_navigation_buttons extends Test_prev_next_buttons {
	String driverPath = "./Resourses/chromedriver.exe";
    public WebDriver driver ; 
  @Test
  public void fnverify_buttons_w3school() throws InterruptedException {
	  WebElement tuto = driver.findElement(By.xpath("//a[@title='Tutorials']"));
		highlightermethod(driver,tuto);
		Thread.sleep(3000);
		tuto.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
  }
  @Test
  public void fnverify_buttons1_w3school() throws InterruptedException {
	  WebElement cour=driver.findElement(By.linkText("Learn HTML"));
	    highlightermethod(driver,cour);
	    Thread.sleep(3000);
	    cour.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    if(cour!=null) {
	    	System.out.println("buttons test passed");
	    }
	    else {
	    	System.out.println("buttons test fail");
	    }
  }
  @Test
  public void fnverify_buttons2_w3school() throws InterruptedException {
	  WebElement next = driver.findElement(By.linkText("Next ❯"));
	    highlightermethod(driver,next);
	    //Thread.sleep(3000);
	    next.click();
	    //next.click();
	    Thread.sleep(3000);
  }
  @Test
  public void fnverify_buttons3_w3school() throws InterruptedException {
	  WebElement prev = driver.findElement(By.linkText("❮ Previous"));
	    highlightermethod(driver,prev);
	    Thread.sleep(3000);
	    prev.click();
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
