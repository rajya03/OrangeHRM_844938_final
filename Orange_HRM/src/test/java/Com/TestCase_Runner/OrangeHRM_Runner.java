package Com.TestCase_Runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		features="src\\main\\resources\\feature\\testcase.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
		//tags = {"@Tc_01_OrangeHRMLogin,@Tc_02_searching_candidate_details,@Tc_03_reset_candidate_details,@Tc_04_add_another_candidate_details,@Tc_05_search_vacancies,@Tc_06_add_vacancies_candidate_details"},*//
		glue = "Com.Stepdefinition",
		monochrome = true
		)
	

public class OrangeHRM_Runner {
	 @AfterClass
	 public static void extendReport()
	{
	     Reporter.loadXMLConfig("src/test/resources/extent-config.xml");
	     Reporter.setSystemInfo("user", System.getProperty("user.name"));
	     Reporter.setSystemInfo("os", "Windows");
	     Reporter.setTestRunnerOutput("Sample test runner output message");
	}
}

