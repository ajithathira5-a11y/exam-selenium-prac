package com.indus.test;

import org.testng.annotations.Test;

import com.indus.base.indusBase;

public class HomeTest extends indusBase{
	
	
	@Test(priority = 3)
	public void cookerver()
	{
		String s = ho.ckr();
		System.out.println("text  ckkr  = "+s);
		
		ho.ckkr();
		
	}
	
	@Test(priority = 4)
	public void searchitem()
	{
		ho.srch("castiron");
	}
	
	

}
