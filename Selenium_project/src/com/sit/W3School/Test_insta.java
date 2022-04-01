package com.sit.W3School;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_insta {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Resourses/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		WebElement W3insta = driver.findElement(By.xpath("//a[@title='W3Schools on Instagram']"));
		highlightermethod(driver,W3insta);
		Thread.sleep(3000);
		W3insta.click();
		if(W3insta.isDisplayed()) {
			System.out.println("W3School instagram test passed");
		}
		else {
			System.out.println("W3School instagram test fail");
		}
		}

	public static void highlightermethod(WebDriver driver, WebElement W3insta) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",W3insta);
	}

}
