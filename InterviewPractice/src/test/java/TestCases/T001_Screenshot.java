package TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import Utilities.BaseClass;

public class T001_Screenshot extends BaseClass {
	
	@Test
	public void screenShot() throws IOException {
		
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot tsc=((TakesScreenshot)driver);
		File srcFile=tsc.getScreenshotAs(OutputType.FILE);
		
		File destinationFile=new File("C:\\Digital Point\\Screenshot\\Facebook.png");
		
		FileUtils.copyFile(srcFile, destinationFile);
		
		
	}

}
