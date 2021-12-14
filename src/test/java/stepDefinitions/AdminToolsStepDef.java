package stepDefinitions;

import java.util.List;
import java.util.Map;

import com.helix.team.factory.DriverFactory;
import com.helix.team.pages.HelixLoginPage;
import com.helix.team.pages.HelixMeetingListPage;
import com.helix.team.pages.HelixRequestMeetingPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class AdminToolsStepDef {
	
	HelixLoginPage helixLogin = new HelixLoginPage(DriverFactory.getDriver());
	HelixMeetingListPage helixmeetingListPage;
	
	@Given("User is on Admin Tools Page")
	public void user_on_admin_page(DataTable datatable) throws InterruptedException
	{
		List<Map<String, String>> credList = datatable.asMaps();
		String username = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		DriverFactory.getDriver().get("http://3.6.26.96:8085/Default.aspx");
		helixmeetingListPage = helixLogin.doLogin(username, password);
		Thread.sleep(5000);
		helixmeetingListPage.clickOnAdminToolsSection();
	}
	
	@Given("Validate Admin Tools label on the page")
	public void validate_Admin_Tools_label_on_the_page()
	{
		
	}

}
