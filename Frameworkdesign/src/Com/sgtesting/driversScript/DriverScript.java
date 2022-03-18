package Com.sgtesting.driversScript;

import Com.sgtesting.level1.HomePage;
import Com.sgtesting.level1.Initialize;
import Com.sgtesting.level1.LoginLogout;
import Com.sgtesting.level1.Users;

public class DriverScript {

	public static void main(String[] args) {

		try
		{
			//Create User Scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			HomePage.minimizeFlyOutWindow();
			Users.createUser();
			Users.deleteUser();
			LoginLogout.logout();
			Initialize.closeApplication();

			//Modify User Scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			HomePage.minimizeFlyOutWindow();
			Users.createUser();
			Users.modifyUser();
			Users.deleteUser();
			LoginLogout.logout();
			Initialize.closeApplication();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
