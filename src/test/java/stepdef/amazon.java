package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class amazon {
	@Given("^open the broser$")
    public void open_the_broser() throws Throwable {
		System.out.println("called programe");
		System.setProperty("webdriver.chrome.driver","D:\\selenium latest\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
    }
	
	 @And("^search for iteam$")
	    public void search_for_iteam() throws Throwable {
	    	System.out.println("search for iteam");
	    }
	
    @When("^pick selected iteam$")
    public void pick_selected_iteam() throws Throwable {
        System.out.println("pick selected iteam");
    }

    @And("^add that iteam to cart$")
    public void add_that_iteam_to_cart() throws Throwable {
    	System.out.println("add that iteam to cart");
    }

}
