package Com.sgtesting.level2driversScript;

import org.openqa.selenium.WebDriver;

public class DriverScript {

	public static void main(String[] args) {
		WebDriver oBrowser=null;
		try
		{
			//Create User Scenario
			oBrowser=Com.sgtesting.level2.Initialize.launchBrowser();
			Com.sgtesting.level2.Initialize.navigate(oBrowser);
			Com.sgtesting.level2.LoginLogout.login(oBrowser);
			Com.sgtesting.level2.HomePage.minimizeFlyOutWindow(oBrowser);
			Com.sgtesting.level2.Users.createUser(oBrowser);
			Com.sgtesting.level2.Users.deleteUser(oBrowser);
			Com.sgtesting.level2.LoginLogout.logout(oBrowser);
			Com.sgtesting.level2.Initialize.closeApplication(oBrowser);

			//Modify User Scenario
			oBrowser=Com.sgtesting.level2.Initialize.launchBrowser();
			Com.sgtesting.level2.Initialize.navigate(oBrowser);
			Com.sgtesting.level2.LoginLogout.login(oBrowser);
			Com.sgtesting.level2.HomePage.minimizeFlyOutWindow(oBrowser);
			Com.sgtesting.level2.Users.createUser(oBrowser);
			Com.sgtesting.level2.Users.modifyUser(oBrowser);
			Com.sgtesting.level2.Users.deleteUser(oBrowser);
			Com.sgtesting.level2.LoginLogout.logout(oBrowser);
			Com.sgtesting.level2.Initialize.closeApplication(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
