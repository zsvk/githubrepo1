package UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.BaseLayer.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportClass extends BaseClass {
	public static ExtentReports extentreport;

	public static String captureCurrentdateAndTime() {
		return new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
	}

	public static ExtentReports setUp() {

		ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(
				System.getProperty("user.dir") + "//Reports//" + captureCurrentdateAndTime() + ".txt");

		extentreport = new ExtentReports();
		extentreport.attachReporter(extentSparkReporter);
		return extentreport;
	}

	public static String captureScreenshot(String foldername, String methodname) {
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String dist = System.getProperty("user.dir") + "//" + foldername + "//" + methodname
				+ captureCurrentdateAndTime() + ".png";

		try {
			FileUtils.copyFile(f, new File(dist));
		} catch (IOException e) {

			e.printStackTrace();
		}
		return dist;

	}

}
