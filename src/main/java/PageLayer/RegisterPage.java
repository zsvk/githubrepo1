package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

import UtilsLayer.DropDownMethods;
import UtilsLayer.UtilsClass;

public class RegisterPage extends BaseClass {

	@FindBy(name = "firstName")
	private WebElement fname;

	@FindBy(name = "lastName")
	private WebElement lname;

	@FindBy(name = "phone")
	private WebElement phone;

	@FindBy(name = "userName")
	private WebElement email;

	@FindBy(name = "address1")
	private WebElement add;

	@FindBy(name = "city")
	private WebElement city;

	@FindBy(name = "state")
	private WebElement state;

	@FindBy(name = "postalCode")
	private WebElement postalCode;

	@FindBy(name = "country")
	private WebElement country;

	@FindBy(name = "email")
	private WebElement unameemail;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(name = "confirmPassword")
	private WebElement confirmPassword;

	@FindBy(name = "submit")
	private WebElement submit;

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterfirstname(String firstname) {
		UtilsClass.enterData(fname, firstname);
	}

	public void enterlastname(String lastname) {
		UtilsClass.enterData(lname, lastname);
	}

	public void enterMobileNo(String mob) {
		UtilsClass.enterData(phone, mob);
	}

	public void enterEmail(String mail) {
		UtilsClass.enterData(email, mail);
	}

	public void enterAddress(String address) {
		UtilsClass.enterData(add, address);
	}

	public void enterCity(String usercity) {
		UtilsClass.enterData(city, usercity);
	}

	public void enterState(String userstate) {
		UtilsClass.enterData(state, userstate);
	}

	public void enterPincode(String pincode) {
		UtilsClass.enterData(postalCode, pincode);
	}

	public void selectCountry(String value) {
		DropDownMethods.seletvalueByVisibleText(country, value);
	}

	public void enterUsername(String username) {
		UtilsClass.enterData(unameemail, username);
	}

	public void enterPassword(String pass) {
		UtilsClass.enterData(password, pass);
	}

	public void enterConfirmPassword(String cpass) {
		UtilsClass.enterData(confirmPassword, cpass);
	}

	public void clickonSubmit() {
		UtilsClass.clickOnElement(submit);
	}

	public void RegisterUser(String firstname, String lastname, String mobile, String emailid,

			String address, String city, String state, String pincode, String country, String uname, String pass,
			String cpass) {
		enterfirstname(firstname);
		enterlastname(lastname);
		enterMobileNo(mobile);
		enterEmail(emailid);
		enterAddress(address);
		enterCity(city);
		enterState(state);
		enterPincode(pincode);
		selectCountry(country);
		enterUsername(uname);
		enterPassword(pass);
		enterConfirmPassword(cpass);
		clickonSubmit();

	}

}
