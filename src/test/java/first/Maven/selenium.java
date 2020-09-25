package first.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class selenium {
	
	@Test
	public void testNG() {
		
		System.out.println("called programe");
		System.setProperty("webdriver.chrome.driver","D:\\selenium latest\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");		

	}

}
