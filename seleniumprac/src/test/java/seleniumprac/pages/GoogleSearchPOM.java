package seleniumprac.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPOM {

  WebDriver driver;
  By searchID = By.name("q");
  
  
  public GoogleSearchPOM(WebDriver driver) {
	  this.driver = driver;
  }
  
 public void search(String searchtext) {
	 driver.findElement(searchID).sendKeys(searchtext);
	 
	 
 }
 public void search() {
	 driver.findElement(searchID).sendKeys(Keys.ENTER);
	 
	 
 }
}





