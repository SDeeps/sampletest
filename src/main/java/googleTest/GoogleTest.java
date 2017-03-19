package googleTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleTest {
	
	@Test
	public void google() throws IOException{
		WebDriver wd=new FirefoxDriver();
		wd.get("https://mvnrepository.com");
		File src=((TakesScreenshot)wd). getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src, new File("S:\\seleniumworkspace\\git_hub_project\\screenshot\\gitscreen.jpg"));
	}

}
