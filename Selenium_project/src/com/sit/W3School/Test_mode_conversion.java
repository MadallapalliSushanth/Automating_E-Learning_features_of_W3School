package com.sit.W3School;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_mode_conversion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Resourses/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		WebElement mode = driver.findElement(By.xpath("//a[@class='w3-bar-item w3-button bar-icon-hover w3-right w3-hide-small']"));
		Thread.sleep(3000);
		mode.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//driver.navigate().refresh();
		String expectedtitle="W3Schools Online Web Tutorials";
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		if(expectedtitle.equals(actualtitle)==true) {
			System.out.println("Mode Conversion Test passed");
		}
		else {
			System.out.println("Mode Conversion test fail");
		}
		driver.close();
	}

}
