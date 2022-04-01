package com.sit.W3School;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_search_bar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Resourses/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		WebElement search = driver.findElement(By.id("search2"));
		highlightermethod(driver,search);
		search.sendKeys("html");
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.id("learntocode_searchbtn"));
		element.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.close();
		if(search!=element) {
			System.out.println("Search bar Test passed");
		}
		else {
			System.out.println("Search bar Test fail");
		}
	}

	public static void highlightermethod(WebDriver driver, WebElement search) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",search);
		
	}

}
