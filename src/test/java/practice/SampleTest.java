package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {
	@Test(groups="RegressionTest")
	public void m1()
	{
	System.out.println("m1 is running");
	WebDriver driver;
	
	String BROWSER=System.getProperty("browser");
	String URL=System.getProperty("url");
	
	switch(BROWSER) 
	{
	case "chrome" :
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	    break;
	case "firefox" :
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
	case "edge" :
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		break;
	default:
		driver=new ChromeDriver();
		break;
	}
	driver.get(URL);
	}

}
