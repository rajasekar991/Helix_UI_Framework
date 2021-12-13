package com.helix.team.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.helix.team.utils.BasePage_Helix;

public class HelixLoginPage extends BasePage_Helix{
	
	
	
	@FindBy(xpath = "//input[@value='Email address']")
	WebElement tbx_username_login;
	@FindBy(xpath = "//input[@id='ctl00_BodyContent_TextBoxPassword_I_CLND']")
	WebElement tbx_password_login;
	@FindBy(xpath = "//button[@value='Login']")
	WebElement btn_loin_login;
	
	@FindBy(xpath = "//div[text()='Login Page']")
	WebElement txt_login_page_word;
	
	protected WebDriver driver = null;
	
	
	public HelixLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		if(!txt_login_page_word.getText().equalsIgnoreCase("Login Page"))
		{
			throw new IllegalStateException("We are not on login page. We are on this"+driver.getCurrentUrl());
		}
	}
	public void helixLogin(String username, String password)
	{
		tbx_username_login.sendKeys(username);
		tbx_password_login.sendKeys(password);
		btn_loin_login.click();
	}
	
	

}
