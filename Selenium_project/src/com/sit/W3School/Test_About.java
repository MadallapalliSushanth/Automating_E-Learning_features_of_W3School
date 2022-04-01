package com.sit.W3School;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_About {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Resourses/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		WebElement W3About = driver.findElement(By.xpath("//a[@title='About W3Schools']"));
		highlightermethod(driver,W3About);
		Thread.sleep(3000);
		W3About.click();
		WebElement Aboutterms = driver.findElement(By.linkText("About Terms"));
		Thread.sleep(1500);
		Aboutterms.click();
		WebElement Aboutprivacy = driver.findElement(By.linkText("About Privacy"));
		Thread.sleep(1500);
		Aboutprivacy.click();		
		if(W3About!=null) {
			System.out.println("W3School About,Terms,Privacy test pass");
		}
		else {
			System.out.println("W3School about test fail");
		}
	}

	public static void highlightermethod(WebDriver driver, WebElement W3About) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",W3About);
		
	}

}
