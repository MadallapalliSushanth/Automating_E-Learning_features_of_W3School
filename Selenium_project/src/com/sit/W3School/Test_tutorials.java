package com.sit.W3School;

import java.util.concurrent.TimeUnit;

import org.antlr.v4.runtime.tree.pattern.TokenTagToken;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_tutorials {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Resourses/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		WebElement tuto = driver.findElement(By.id("navbtn_tutorials"));
		highlightermethod(driver,tuto);
		Thread.sleep(3000);
		tuto.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	    WebElement cour=driver.findElement(By.xpath("//a[@class='w3-bar-item w3-button']"));
	    highlightermethod(driver,cour);
	    Thread.sleep(3000);
	    cour.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    driver.close();
	    //driver.navigate().refresh();
	    if(tuto!=cour) {
	    	System.out.println("Tutorials Test pass");
	    }
	    else {
	    	System.out.println("Tutorials Test fail");
	    }
		
	}

	public static void highlightermethod(WebDriver driver, WebElement tuto) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",tuto);
		//js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",cour);
	}

}
