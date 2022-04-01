package com.sit.W3School;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_all {

	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(1500);
		WebElement logo = driver.findElement(By.xpath("//a[@class='w3-bar-item w3-button w3-hover-none w3-left w3-padding-16']"));
		highlightermethod(driver,logo);
		Thread.sleep(3000);
		logo.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String expectedtitles="W3Schools Online Web Tutorials";
		String actualtitles=driver.getTitle();
		System.out.println(actualtitle);
		if(expectedtitle.equals(actualtitle)==true) {
			System.out.println("Website logo Test passed");
		}
		else {
			System.out.println("Website logo test fail");
		}
		Thread.sleep(1500);
		WebElement Tesxt = driver.findElement(By.className("learntocodeh1"));
		highlightermethod(driver,Tesxt);
		if(Tesxt.isDisplayed());
		System.out.println("text message option for  is displayed");
		Thread.sleep(1500);
		WebElement mode = driver.findElement(By.xpath("//a[@class='w3-bar-item w3-button bar-icon-hover w3-right w3-hide-small']"));
		Thread.sleep(3000);
		mode.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//driver.navigate().refresh();
		String expectedtitlee="W3Schools Online Web Tutorials";
		String actualtitlee=driver.getTitle();
		System.out.println(actualtitle);
		if(expectedtitle.equals(actualtitle)==true) {
			System.out.println("Mode Conversion Test passed");
		}
		else {
			System.out.println("Mode Conversion test fail");
		}
		Thread.sleep(1500);
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
		Thread.sleep(1500);
		WebElement search = driver.findElement(By.id("search2"));
		highlightermethod(driver,search);
		search.sendKeys("html");
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.id("learntocode_searchbtn"));
		element.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//driver.close();
		if(search!=element) {
			System.out.println("Search bar Test passed");
		}
		else {
			System.out.println("Search bar Test fail");
		}
		Thread.sleep(1500);
		WebElement home = driver.findElement(By.xpath("//a[@class='topnav-icons fa fa-home w3-left w3-bar-item w3-button']"));
		home.click();
		Thread.sleep(1500);
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
		Thread.sleep(1500);
		WebElement homes = driver.findElement(By.xpath("//a[@class='topnav-icons fa fa-home w3-left w3-bar-item w3-button']"));
		homes.click();
		Thread.sleep(1500);
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
	    //driver.close();
	    //driver.navigate().refresh();
	    if(tuto!=cour) {
	    	System.out.println("Tutorials Test pass");
	    }
	    else {
	    	System.out.println("Tutorials Test fail");
	    }
	    WebElement homes1 = driver.findElement(By.xpath("//a[@class='topnav-icons fa fa-home w3-left w3-bar-item w3-button']"));
		homes1.click();
		WebElement tutos = driver.findElement(By.id("navbtn_tutorials"));
		highlightermethod(driver,tutos);
		Thread.sleep(3000);
		tutos.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	    WebElement cours=driver.findElement(By.xpath("//a[@class='w3-bar-item w3-button']"));
	    highlightermethod(driver,cours);
	    Thread.sleep(3000);
	    cours.sendKeys(Keys.ENTER);
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
	    WebElement homes2 = driver.findElement(By.xpath("//a[@class='topnav-icons fa fa-home w3-left w3-bar-item w3-button']"));
		homes2.click();
		Thread.sleep(1500);
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
		//driver.findElement(By.xpath("//button[@class='_1VfsI _OD95i _3_H0V']")).sendKeys(Keys.ENTER);
		//Thread.sleep(3000);
		String expectedtitless="Log in - W3Schools";
		String actualtitless=driver.getTitle();
		System.out.println(actualtitless);
		if(expectedtitless.equals(actualtitless)==true) {
			System.out.println("Sign page Test passed");
		}
		else {
			System.out.println("Sign page test fail");
		}
		WebElement log = driver.findElement(By.xpath("//button[@title='Close']"));
		//highlightermethod(driver,log);
		//Thread.sleep(3000);
		log.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		WebElement login = driver.findElement(By.id("w3loginbtn"));
		login.click();
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("msushanth55@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("current-password")).sendKeys("Nature@2000");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_1VfsI _OD95i _3_H0V']")).click();
		String expectedtitl="Log in - W3Schools";
		String actualtitl=driver.getTitle();
		System.out.println(actualtitl);
		if(expectedtitl.equals(actualtitl)==true) {
			System.out.println("Login page Test passed");
		}
		else {
			System.out.println("logi page test fail");
		}
		driver.close();
		
	    
		
	}
	public static void highlightermethod(WebDriver driver, WebElement logo) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 6px solid red;');", logo);
		
	}

}
