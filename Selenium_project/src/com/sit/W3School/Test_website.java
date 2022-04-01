package com.sit.W3School;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_website {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Resourses/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		WebElement google=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		google.sendKeys("https://www.w3schools.com/");
		google.click();
		String baseurl="https://www.w3schools.com/";
		String expectedtitle="W3Schools Online Web Tutorials";
		String actualtitle="";
		driver.get(baseurl);	
		actualtitle=driver.getTitle();
		if(actualtitle.contentEquals(expectedtitle))
		{
			System.out.println("Website Test passed");
		} else {
			System.out.println("Website Test fail");
		}
		driver.close();

	}

}
