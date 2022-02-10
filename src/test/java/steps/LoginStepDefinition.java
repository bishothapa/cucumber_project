package steps;

import org.openqa.selenium.By;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.TechfiosCucumberProject;

public class LoginStepDefinition extends TechfiosCucumberProject {

	@Given ("^Set SkyBlue Background$")
	public void Set_SkyBlue_Background() {
		initDriver();
		driver.get("https://techfios.com/test/101/");
		 
	}
	
	 
	@When ("^User click on the botton$")
	public void User_click_on_the_botton() throws InterruptedException {
		
	System.out.println("Clicking on Set SkyBlue Background Button ");
 
	By ClickOnSetSkyBlueBackGround = By.xpath("//button[contains(text(),'Set SkyBlue Background')]");
	Thread.sleep(3000);
	driver.findElement(ClickOnSetSkyBlueBackGround).click();
	Thread.sleep(3000);
	}
	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws Throwable {
	    System.out.println("The Background color will change to sky blue");
	   
	}
	
	 
	@Given ("^Set SkyWhite Background$")
		public void Set_SkyWhite_Background() throws InterruptedException {
		initDriver();
		driver.get("https://techfios.com/test/101/");
		System.out.println("Set SkyWhite Background");
		
	}
 
	@When("^I click on the botton$")
	public void I_click_on_the_botton() throws InterruptedException {
		By ClickIClickOnTheBotton = By.xpath("//button[contains(text(),'Set White Background')]");
		Thread.sleep(3000);
		driver.findElement(ClickIClickOnTheBotton).click();
		Thread.sleep(3000);
	}
	 
	@Then ("^the background color will change to white$")
	public void the_background_color_will_change_to_white() {
		System.out.println("background color changed to white");
	}
	
	@After
	public void TearDown() {
		driver.close();
		driver.quit();
	}
	
	
}
