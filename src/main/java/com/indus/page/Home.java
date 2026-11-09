package com.indus.page;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(id="st-search")
	WebElement search;
	
	@FindBy(xpath = "//*[@id=\"collection-template--20386411544753__quinn_tab_widget_JQWKHh\"]/div[2]/div[1]/div/div/div[3]")
	WebElement cooker;
	
	
	public Home(WebDriver driver,WebDriverWait wait)
	{
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
	}
	
	public void srch(String item)
	{
		search.click();
		search.sendKeys(item);
		search.sendKeys(Keys.RETURN);
	}
	
	public String ckr()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({block:'center'})",cooker);
		
		wait.until(ExpectedConditions.visibilityOf(cooker));
		
		return cooker.getText();
		
	}
	
	public void ckkr()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({block:'center'})",cooker);
		wait.until(ExpectedConditions.elementToBeClickable(cooker));

		cooker.click();

	}

}
