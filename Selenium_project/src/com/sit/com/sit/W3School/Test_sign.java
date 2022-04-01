package com.sit.com.sit.W3School;

import org.testng.annotations.Test;

import com.sit.W3School.Test_sign_page;

import org.testng.annotations.BeforeTest;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Test_sign extends Test_sign_page {
	String driverPath = "./Resourses/chromedriver.exe";
    public WebDriver driver ; 
  @Test
  public void fnverify_sign1_w3school() {
	  WebElement log = driver.findElement(By.linkText("Log in"));
	  log.click();
  }
  @Test
  public void fnverify_sign2_w3school() {
	  WebElement signpage = driver.findElement(By.cssSelector("#root > div > div > div:nth-child(4) > div._MdeUd._3-XBs._1YER7 > div > div:nth-child(3) > form > div._yDlxv.-fif_wrp > div._1bOWP.-fif_label_wrp > span > span"));
	  signpage.click();
  }
  @Test
  public void fnverify_sign3_w3school() throws InterruptedException {
	  WebElement sign_email = driver.findElement(By.xpath("//input[@name='email']"));
	  Thread.sleep(1500);
	  sign_email.sendKeys("knsskmanoj7119@gmail.com");
  }
  @Test
  public void fnverify_sign4_w3school() throws InterruptedException {
	  WebElement sign_passward = driver.findElement(By.xpath("//input[@name='new-password']"));
	  Thread.sleep(1500);
	  sign_passward.sendKeys("Pramod@2001");
  }
  @Test
  public void fnverify_sign5_w3school() {
	  WebElement sign_free = driver.findElement(By.xpath("//button[@class='_1VfsI _OD95i _3_H0V']"));
	  sign_free.sendKeys(Keys.ENTER);
  }
  @Test
  public void fnverify_sign6_w3school() throws InterruptedException {
	  WebElement first_name = driver.findElement(By.xpath("//input[@name='first_name']"));
	  Thread.sleep(1500);
	  first_name.sendKeys("Pramod");
  }
  @Test
  public void fnverify_sign7_w3school() throws InterruptedException {
	  WebElement last_name = driver.findElement(By.xpath("//input[@name='last_name']"));
	  Thread.sleep(1500);
	  last_name.sendKeys("Vendra");
  }
  @Test
  public void fnverify_sign8_w3school() {
	  WebElement conti = driver.findElement(By.xpath("//button[@class='_1VfsI _OD95i _3_H0V']"));
	  conti.click();
	  String expectedtitle="Log in - W3Schools";
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		if(expectedtitle.equals(actualtitle)==true) {
			System.out.println("Sign page Test passed");
		}
		else {
			System.out.println("Sign page test fail");
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
