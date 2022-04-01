package com.sit.W3School;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_prev_next_buttons {

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
	    WebElement next = driver.findElement(By.linkText("Next ❯"));
	    highlightermethod(driver,next);
	    //Thread.sleep(3000);
	    next.click();
	    //next.click();
	    Thread.sleep(3000);
	    WebElement prev = driver.findElement(By.linkText("❮ Previous"));
	    highlightermethod(driver,prev);
	    Thread.sleep(3000);
	    prev.click();
	    Thread.sleep(3000);
	    //driver.close();
	    if(cour!=null) {
	    	System.out.println("buttons test passed");
	    }
	    else {
	    	System.out.println("buttons test fail");
	    }
	    
	}

	public static void highlightermethod(WebDriver driver, WebElement tuto) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 6px solid red;');",tuto);
	}

}
