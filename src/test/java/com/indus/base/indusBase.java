package com.indus.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.indus.page.Login;
import com.indus.page.Home;


public class indusBase {
	
	public static WebDriver driver;
	public WebDriverWait wait;
	
	public Login lo;
	public Home ho;
	
	@BeforeTest
	public void setup()
	{
		ChromeOptions op =new ChromeOptions();
		op.addArguments("--incognito");
		driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.theindusvalley.in/");
	}
	
	@BeforeMethod
	public void before()
	{
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		lo = new Login(driver,wait);
		ho=new Home(driver,wait);
	}

}
