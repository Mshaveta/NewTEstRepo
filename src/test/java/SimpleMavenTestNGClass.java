import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleMavenTestNGClass extends SimpleMavenClass {
	@Test
	public void mTestCase(){
		 m1();
		 //For firefox Browser
		 String url = System.getProperty("user.dir")+"\\src\\main\\java\\Browser_Drivers\\chromedriver.exe";
		 
		 System.setProperty("webdriver.chrome.driver", url);
	 
		 WebDriver  driver = new ChromeDriver();  
		 driver.get("https://www.facebook.com/");
		
		 
	}
}
