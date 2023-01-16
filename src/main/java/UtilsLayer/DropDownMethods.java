package UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseLayer.BaseClass;

public class DropDownMethods extends BaseClass {

	public static void seletvalueByIndex(WebElement wb, int index) {
		new Select(wb).selectByIndex(index);
	}

	public static void seletvalueByValue(WebElement wb, String value) {
		new Select(wb).selectByValue(value);
	}

	public static void seletvalueByVisibleText(WebElement wb, String visibleText) {
		new Select(wb).selectByVisibleText(visibleText);
	}

	public static String getselectedValue(WebElement wb) {
		return new Select(wb).getFirstSelectedOption().getText();
	}

	public static int dropdownSize(WebElement wb) {
		return new Select(wb).getOptions().size();
	}

	public static void checkSpecificValuePresent(WebElement wb, String value) {
		List<WebElement> ls = new Select(wb).getOptions();

		for (WebElement abc : ls) {
			if (abc.getText().equals(value)) {
				System.out.println("Value is present " + abc.getText());
				break;
			}
		}
	}

	public static void printAllValue(WebElement wb) {
		List<WebElement> ls = new Select(wb).getOptions();

		for (WebElement abc : ls) {
			System.out.println(abc.getText());
		}
	}

}
