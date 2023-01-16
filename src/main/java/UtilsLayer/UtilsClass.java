package UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;

public class UtilsClass extends BaseClass {

	public static void enterData(WebElement wb, String value) {

		if ((wb.isDisplayed()) && (wb.isEnabled())) {
			wb.sendKeys(value);
		}
	}

	public static void clickOnElement(WebElement wb) {

		if ((wb.isDisplayed()) && (wb.isEnabled())) {
			wb.click();
		}
	}

	public static String takeSceenshot(String methodname) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		String date = new SimpleDateFormat("_ddMMyyyy_HHmmss").format(new Date());
		String distpath = System.getProperty("user.dir") + "//PassScreenshot//" + methodname + date + ".png";
		File dist = new File(distpath);
		try {
			FileUtils.copyFile(f, dist);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return distpath;
	}

	public static String takeFailSceenshot(String methodname) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		String date = new SimpleDateFormat("_ddMMyyyy_HHmmss").format(new Date());
		String distpath = System.getProperty("user.dir") + "//FailScreenshot//" + methodname + date + ".png";
		File dist = new File(distpath);
		try {
			FileUtils.copyFile(f, dist);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return distpath;
	}

}
