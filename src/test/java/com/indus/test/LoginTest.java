package com.indus.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.indus.base.indusBase;

public class LoginTest extends indusBase{
	
	@Test(priority = 1)
	public void lcount()
	{
		int c = lo.linkcount();
		System.out.println("link cout="+c);
		Assert.assertEquals(c, 670);
	}
	
	@Test(priority = 2)
	public void ttl()
	{
		String t = lo.titleget();
		System.out.println("title  ="+t);
		Assert.assertEquals(t, "The Indus Valley - 100% Healthy Cookware | Toxin-free");
			
	}

}
