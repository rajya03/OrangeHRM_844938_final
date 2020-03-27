package Com.Stepdefinition;

import Com.pages.recruit_add_pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class recruit_add_step 
{
	recruit_add_pages add = new recruit_add_pages();  //importing the add_another_candidate_details_page and creating an instance
	@Given("^User Launch the chrome browser$")
	public void user_Launch_the_chrome_browser() throws Throwable 
	{
	   add.ChromeLaunch();  // calling the url method
	}

	@When("^User Open the orange hrm login page$")
	public void user_Open_the_orange_hrm_login_page() throws Throwable 
	{
	    add.OrangeHRM_Homepage(); // calling the login page method
	}

	@Then("^User Enter the username and password with valid data$")
	public void user_Enter_the_username_and_password_with_valid_data() throws Throwable 
	{
	   add.LoginDetails();  // calling the login details method
	}

	@Then("^user should Submit the details$")
	public void user_should_Submit_the_details() throws Throwable 
	{
	    add.submit();  // calling the submit method
	}

	@Then("^user Searching the candidate details$")
	public void user_Searching_the_candidate_details() throws Throwable 
	{
	    add.Search_item();  //calling search items in recruitment page
	}

	@Then("^add another candidate details$")
	public void add_another_candidate_details() throws Throwable 
	{
	   add.add();   //calling the add another candidate deatils in recruitment page
	}


}
