package com.sit.W3School;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_languages {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Resourses/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		WebElement lang=driver.findElement(By.id("nav_translate_btn"));
		lang.click();
		highlightermethod(driver,lang);
		Thread.sleep(3000);
		driver.findElement(By.id(":0.targetLanguage")).click();
		Thread.sleep(3000);
		WebElement langs=driver.findElement(By.xpath("//a/span"));
		langs.click();
		if(lang!=null) {
			System.out.println("languages test passed");
		}
		else {
			System.out.println("languages test fail");
		}
		
	}

	public static void highlightermethod(WebDriver driver, WebElement lang) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",lang);
		
	}

}
