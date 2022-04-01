package com.sit.W3School;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_login_page {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Resourses/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		//driver.findElement(By.id("w3loginbtn")).click();
		WebElement login = driver.findElement(By.id("w3loginbtn"));
		login.click();
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("msushanth55@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("current-password")).sendKeys("Nature@2000");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_1VfsI _OD95i _3_H0V']")).click();
		
		String expectedtitle="Log in - W3Schools";
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		if(expectedtitle.equals(actualtitle)==true) {
			System.out.println("Login page Test passed");
		}
		else {
			System.out.println("logi page test fail");
		}
		//driver.close();

	}

}
