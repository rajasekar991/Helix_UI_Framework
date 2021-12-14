package com.helix.team.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelixRequestMeetingPage {
	
private WebDriver driver;
private HelixAdminTools adminTools;
private By lnk_AdminTool = By.xpath("//a[@href='AdminTools.aspx']");

	
	public HelixRequestMeetingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickOnAdminToolsSection()
	{
		driver.findElement(lnk_AdminTool).click();
	}


}
