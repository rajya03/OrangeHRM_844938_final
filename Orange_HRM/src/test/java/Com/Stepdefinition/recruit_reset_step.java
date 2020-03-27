package Com.Stepdefinition;

import Com.pages.recruit_reset_pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class recruit_reset_step 
{
	recruit_reset_pages a = new recruit_reset_pages();  //importing the reset_page and creating an instance
	@Given("^the user Launch the chrome browser$")
	public void the_user_Launch_the_chrome_browser() 
	{
	   a.ChromeLaunch();   // calling the url method
	}

	@When("^the user Open the orange hrm login page$")
	public void the_user_Open_the_orange_hrm_login_page()
	{
	  a.OrangeHRM_Homepage();  // calling the login page method
	}

	@Then("^the user Enter the username and password with valid data$")
	public void the_user_Enter_the_username_and_password_with_valid_data() 
	{
	    a.LoginDetails();  // calling the login details method
	}

	@Then("^the user Submit the details$")
	public void the_user_Submit_the_details() throws InterruptedException 
	{
	    a.submit();  // calling the submit method
	}

	@Then("^the user reset the candidate details$")
	public void the_user_reset_the_candidate_details() throws InterruptedException 
	{
	   a.Reset_item();  //calling the reset method
	}


}
