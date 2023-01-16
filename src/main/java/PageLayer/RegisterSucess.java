package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class RegisterSucess extends BaseClass {

	@FindBy(xpath = "(//b)[3]")
	private WebElement firstandlastname;

	@FindBy(xpath = "(//b)[4]")
	private WebElement username;

	@FindBy(xpath = "(//font)[5]")
	private WebElement message;

	public RegisterSucess() {
		PageFactory.initElements(driver, this);
	}

	public String captureSucessPageUrl() {
		return driver.getCurrentUrl();
	}

	public String captureFirstAndLastname() {
		return firstandlastname.getText();
	}

	public String captureUsername() {
		return username.getText();
	}

	public String captureMessage() {
		return message.getText();
	}

}
