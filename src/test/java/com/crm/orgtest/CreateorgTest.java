package com.crm.orgtest;



import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

public class CreateorgTest {
	WebDriver driver;
@Test(groups="smoketesting")
public void createorgtest()
{
	System.out.println("Created organisation");
	
	}
	@Test(groups="regresstesting")
	public void modifyorgTest()
	{
		System.out.println("org modified");
		
	}
	

}
