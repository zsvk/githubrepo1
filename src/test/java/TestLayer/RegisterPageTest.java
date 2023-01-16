package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;

import PageLayer.RegisterPage;

@Test(groups= {"RegisterPage"})
public class RegisterPageTest extends BaseClass {
	@Parameters({ "browsers" })
	@BeforeTest
	public void setUp(String browses) {
		BaseClass.iniliazation(browses);
	}

	@Test
	public void validateRegisterFunctionality() {
		RegisterPage registerpage = new RegisterPage();
		registerpage.RegisterUser(prop.getProperty("fname"), prop.getProperty("lname"), "9019923321",
				prop.getProperty("uname"), "Pune", "Pune", "MH", "413412", "INDIA", prop.getProperty("uname"),
				prop.getProperty("pass"), prop.getProperty("cpass"));
	}

	@AfterTest
	public void tearDown() {
		//driver.close();
	}

}
