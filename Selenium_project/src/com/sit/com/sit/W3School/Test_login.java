package com.sit.com.sit.W3School;

import org.testng.annotations.Test;

import com.sit.W3School.Test_login_page;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Test_login extends Test_login_page{
	String driverPath = "./Resourses/chromedriver.exe";
    public WebDriver driver ; 
  @Test
  public void fnverify_log1_w3school() throws InterruptedException {
	  WebElement login = driver.findElement(By.id("w3loginbtn"));
		login.click();
		Thread.sleep(3000);
  }
  @Test
  public void fnverify_log2_w3school() throws InterruptedException {
	  driver.findElement(By.name("email")).sendKeys("msushanth55@gmail.com");
		Thread.sleep(3000);
  }
  @Test
  public void fnverify_log3_w3school() throws InterruptedException {
	  driver.findElement(By.name("current-password")).sendKeys("Nature@2000");
		Thread.sleep(3000);
  }
  @Test
  public void fnverify_log4_w3school() {
	  driver.findElement(By.xpath("//button[@class='_1VfsI _OD95i _3_H0V']")).click();
	  String expectedtitle="Log in - W3Schools";
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		if(expectedtitle.equals(actualtitle)==true) {
			System.out.println("Login page Test passed");
		}
		else {
			System.out.println("logi page test fail");
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
