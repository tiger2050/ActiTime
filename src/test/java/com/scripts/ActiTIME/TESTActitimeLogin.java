package com.scripts.ActiTIME;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.ActiTIME.BaseTest;
import com.pages.ActiTIME.ActitimeLoginPage;

public class TESTActitimeLogin extends BaseTest
{
	@Test
	public void login() throws IOException
	{
		ActitimeLoginPage login= new ActitimeLoginPage(driver);
		login.loginMethod();
	}

}
