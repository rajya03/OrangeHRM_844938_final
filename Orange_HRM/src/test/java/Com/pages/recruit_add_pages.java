package Com.pages;

import java.io.File;
import java.sql.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class recruit_add_pages //To add the candidate details in the recruitment page
{

	WebDriver driver;
	By Username = By.name("txtUsername");
	By Password = By.name("txtPassword");
	By Submit = By.name("Submit");  
	By Recruitment = By.xpath("//*[@id=\"menu_recruitment_viewRecruitmentModule\"]/b");
	By candidate = By.id("menu_recruitment_viewCandidates");
	By Jobtitle = By.name("candidateSearch[jobTitle]");
	By Vacancy = By.name("candidateSearch[jobVacancy]");
	By Hiringmanager = By.name("candidateSearch[hiringManager]");
	By Status = By.name("candidateSearch[status]");
	By CandidateName = By.name("candidateSearch[candidateName]");
	By Keywords = By.name("candidateSearch[keywords]");
	By From = By.name("candidateSearch[dateApplication][from]");
	By From_calendar = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[2]/a");
	By To = By.name("candidateSearch[dateApplication][to]");
	By To_calendar = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[3]/a");
	By Methodofapplication = By.name("candidateSearch[modeOfApplication]");
	By add = By.xpath("//*[@id=\"btnAdd\"]");
	By FirstName = By.name("addCandidate[firstName]");
	By LastName = By.name("addCandidate[lastName]");
	By Email = By.name("addCandidate[email]");
	By ContactNo = By.name("addCandidate[contactNo]");
	By Jobvacancy = By.name("addCandidate[vacancy]");
	By keywords = By.name("addCandidate[keyWords]");
	By Comment = By.name("addCandidate[comment]");
	By Dateofapplication = By.xpath("//*[@id=\"frmAddCandidate\"]/fieldset/ol[2]/li[5]/img");
	By Dateofapplication_calendar = By.xpath("//*[@id=\"addCandidate_appliedDate\"]");
	By Contest_Tokeepdata = By.xpath("//*[@id=\"addCandidate_consentToKeepData\"]");
	By Save = By.xpath("//*[@id=\"btnSave\"]");
	
	// to launch the browser
	
			public void browserLaunch(String browser,String url)
			{
				try {
							//To launch firefox Browser
					if (browser.equalsIgnoreCase("firefox")) {
						System.setProperty("webdriver.gecko.driver","C:\\Users\\Personal\\Downloads\\Orange_HRM.zip (Unzipped Files)\\Orange_HRM\\src\\test\\resources\\Drivers\\geckodriver.exe");
						driver = new FirefoxDriver();
					}
							// To launch chrome Browser
					else if (browser.equalsIgnoreCase("chrome")) 
					{
						System.setProperty("webdriver.chrome.driver", "C:\\Users\\Personal\\Downloads\\Orange_HRM.zip (Unzipped Files)\\Orange_HRM\\src\\test\\resources\\Drivers\\chromedriver.exe");
						driver=new ChromeDriver();
					}
							// To launch InternetExplorer
					else if (browser.equalsIgnoreCase("Internet Explore")) {
							System.setProperty("webdriver.ie.driver","D:\\Downloads\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
						driver=new InternetExplorerDriver();  
					}
							//to maximize the window
					driver.manage().window().maximize(); 
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					driver.get(url);
				
				} 
				
				//if browser cannot be launched
				catch (WebDriverException e) 
				{
					System.out.println("Browser could not be launched");
				}
			}
	
	
	public void ChromeLaunch() { //method to open the chrome browser
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Personal\\Downloads\\Orange_HRM.zip (Unzipped Files)\\Orange_HRM\\src\\test\\resources\\Drivers\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		   driver.get("https://google.com");
		   System.out.println(driver.getTitle());
	 }
	
	 public void OrangeHRM_Homepage() // method to open the url in the browser
		{
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			System.out.println(driver.getTitle());
		}
	 
	 public void LoginDetails()  // method for the login credentials by passing keys
	   {
		   driver.findElement(Username).sendKeys("Admin");
		   driver.findElement(Password).sendKeys("admin123");
	   }
	 
	 public void submit() throws InterruptedException  //method to click and submit the credentials
		{
			driver.findElement(Submit).click();
			
		}  
	
	public void Search_item() throws InterruptedException  //To Search the items in the recruitment page
	{
		driver.findElement(Recruitment).click();
		WebElement a = driver.findElement(candidate);
		Actions act = new Actions(driver);
		act.moveToElement(a).click().build().perform();
		driver.findElement(Jobtitle).click();
		driver.findElement(Vacancy).click();
		driver.findElement(Hiringmanager).click();
		driver.findElement(Status).click();
		driver.findElement(CandidateName).sendKeys("Rajya Lakshmi");
		driver.findElement(Keywords).sendKeys("abc");
		driver.findElement(From).click();
		driver.findElement(From_calendar).click();
		driver.findElement(To).click();
		driver.findElement(To_calendar).click();
		driver.findElement(Methodofapplication).click();
	}
		
		public void add() // To add the candidate deatils in the recruitment page
		{
		driver.findElement(add).click();
		driver.findElement(FirstName).sendKeys("Ramya");
		driver.findElement(LastName).sendKeys("Gudiseva");
		driver.findElement(Email).sendKeys("rajyalakshmigudiseva97@gmail.com");
		driver.findElement(ContactNo).sendKeys("7032681061");
		driver.findElement(Jobvacancy).click();
		driver.findElement(keywords).sendKeys("add any candidate details");
		driver.findElement(Comment).sendKeys("nothing");
		driver.findElement(Dateofapplication).click();
		driver.findElement(Dateofapplication_calendar).click();
		driver.findElement(Contest_Tokeepdata).click();
		driver.findElement(Save).click();
		
		//To take the Screenshot
		
				Date date = new Date(0);
				String datestr = date.toString().replace(":", "-");
				
				TakesScreenshot ts = (TakesScreenshot)driver;
				File screenshot = ts.getScreenshotAs(OutputType.FILE);
				screenshot.renameTo(new File("src/test/resources/Screenshots/image_add_candidate_details.png"));
				
				//method for closing the browser
				driver.close();
			

		}

}



