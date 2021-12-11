package com.helix.team.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.helix.team.utils.BasePage_Helix;

public class HelixLoginPage extends BasePage_Helix{
	
	By tbx_username_login = By.xpath("//input[@value='Email address']");
	By tbx_password_login = By.xpath("//input[@id='ctl00_BodyContent_TextBoxPassword_I_CLND']");
	By btn_loin_login = By.xpath("//button[@value='Login']");
	WebDriver driver = null;
	
	public HelixLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void helixLogin(String username, String password)
	{
		driver.findElement(tbx_username_login).sendKeys(username);
		driver.findElement(tbx_password_login).sendKeys(password);
		driver.findElement(btn_loin_login).click();
	}

}
