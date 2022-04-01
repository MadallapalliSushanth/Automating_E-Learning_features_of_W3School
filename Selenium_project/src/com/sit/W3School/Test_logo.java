package com.sit.W3School;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_logo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Resourses/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
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
		driver.close();
	}

	public static void highlightermethod(WebDriver driver, WebElement logo) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 6px solid red;');", logo);
		
	}

}
