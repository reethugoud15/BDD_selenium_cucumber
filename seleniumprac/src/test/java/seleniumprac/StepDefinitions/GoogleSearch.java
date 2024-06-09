package seleniumprac.StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import seleniumprac.pages.GoogleSearchPOM;


public class GoogleSearch {
	GoogleSearchPOM ll;
     WebDriver driver = null;
	@Given("user is on the browser page")
	public void user_is_on_the_browser_page() {
		
		String path = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",path+"/src/test/resources/drivers/chromedriver.exe" );
	    
		 driver= new ChromeDriver();
		 driver.get("https://www.google.com");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	  @When("user enters {string}")
	    public void user_enters_searchtext(String searchtext) {
	        try {
	        	 ll=new GoogleSearchPOM(driver);
	        	
	            System.out.println("Entering search text: " + searchtext);
	            ll.search(searchtext);
	            ll.search();
	        } catch (Exception e) {
	            System.out.println("Error while entering search text: " + searchtext);
	            e.printStackTrace();
	            throw e;
	        }
	    }
	@Then("user should be navigated to search results")
	public void user_should_be_navigated_to_search_results() {
	    // Write code here that turns the phrase above into concrete actions
System.out.println("Inside Step - user is navigated to search results");
		
		driver.getPageSource().contains("Online Courses");
		
		driver.close();
		driver.quit();
	}
	
	


	
	
}
