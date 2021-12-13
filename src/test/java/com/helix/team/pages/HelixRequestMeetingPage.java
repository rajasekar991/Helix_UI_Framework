package com.helix.team.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelixRequestMeetingPage {
	
	public boolean isWelcomeTextIsDisplayed = false;
	
	@FindBy(xpath = "//input[@value='Email address']")
	WebElement txt_welcome;
	WebDriver driver;
	public HelixRequestMeetingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean validateIsWelcomeDisplayed(String welcomeMessage)
	{
		
		if(txt_welcome.getText().contains(welcomeMessage))
		{
			isWelcomeTextIsDisplayed = true;
		}
		return isWelcomeTextIsDisplayed;
	}

}
