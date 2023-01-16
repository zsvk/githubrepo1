package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;

import PageLayer.RegisterSucess;

@Test(groups = { "RegisterSucess" }, dependsOnGroups = { "RegisterPage" })
public class RegisterSucessTest extends BaseClass {
	private RegisterSucess registersucess;

	@Test(priority = 1)
	public void validateSucessPageUrl() {
		registersucess = new RegisterSucess();
		Assert.assertEquals(true, registersucess.captureSucessPageUrl().contains("sucess"));
	}

	@Test(priority = 2)
	public void validateFirstName() {
		Assert.assertEquals(true, registersucess.captureFirstAndLastname().contains(prop.getProperty("fname")));
	}

	@Test(priority = 3)
	public void validateLastName() {
		Assert.assertEquals(true, registersucess.captureFirstAndLastname().contains(prop.getProperty("lname")));
	}

	@Test(priority = 4)
	public void validateEmailId() {
		Assert.assertEquals(true, registersucess.captureUsername().contains(prop.getProperty("uname")));
	}

}
