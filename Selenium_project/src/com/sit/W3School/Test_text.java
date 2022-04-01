package com.sit.W3School;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_text {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Resourses/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		WebElement Tesxt = driver.findElement(By.className("learntocodeh1"));
		highlightermethod(driver,Tesxt);
		if(Tesxt.isDisplayed());
		System.out.println("text message option for  is displayed");
	}

	public static void highlightermethod(WebDriver driver, WebElement logo) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", logo);
		
	}
	}


