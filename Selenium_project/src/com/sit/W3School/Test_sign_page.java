package com.sit.W3School;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_sign_page {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Resourses/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.id("w3loginbtn")).click();
		WebElement sign_up = driver.findElement(By.cssSelector("#root > div > div > div:nth-child(4) > div._MdeUd._3-XBs._1YER7 > div > div:nth-child(3) > form > div._yDlxv.-fif_wrp > div._1bOWP.-fif_label_wrp > span > span"));
		sign_up.click();
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("pramodvendra86@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("new-password")).sendKeys("Pramod@2001");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_1VfsI _OD95i _3_H0V']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_1VfsI _OD95i _3_H0V']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='modal_first_name']")).sendKeys("Pramod");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='modal_last_name']")).sendKeys("Vendra");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_1VfsI _OD95i _3_H0V']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String expectedtitle="Log in - W3Schools";
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		if(expectedtitle.equals(actualtitle)==true) {
			System.out.println("Sign page Test passed");
		}
		else {
			System.out.println("Sign page test fail");
		}
		driver.close();
		
	}

}
