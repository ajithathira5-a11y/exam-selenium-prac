package com.indus.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(tagName = "a")
	List<WebElement>  linkList;
	
	public Login(WebDriver driver,WebDriverWait wait)
	{
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
	}
	
	public int linkcount()
	{
		return linkList.size();
	}
	
	public String titleget()
	{
		return driver.getTitle();
	}

}
