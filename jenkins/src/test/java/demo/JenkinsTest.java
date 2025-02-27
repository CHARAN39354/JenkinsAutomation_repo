package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsTest {
	@Test
	public void lanuch() {
		WebDriver driver=new ChromeDriver();
		Reporter.log("JnekinsTest class executed",true);
	}
	}


