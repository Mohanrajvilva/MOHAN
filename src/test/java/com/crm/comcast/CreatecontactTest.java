package com.crm.comcast;

import org.testng.annotations.Test;

public class CreatecontactTest {
	
	@Test(groups="smoketesting")
	public void contacttest()
	{
		System.out.println("Contact created sucessfully");
	}
	@Test(groups="regresstesting")
	public void modifycontacttest()
	{
		System.out.println("contact modified sucessfully");
	}

}
