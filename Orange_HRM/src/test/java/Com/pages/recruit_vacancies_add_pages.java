package Com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class recruit_vacancies_add_pages //To add the vacancies in the recruitmnet page
{
	WebDriver driver;
	By Username = By.name("txtUsername");
	By Password = By.name("txtPassword");
	By Submit = By.name("Submit");  
	By Recruitment = By.xpath("//*[@id=\"menu_recruitment_viewRecruitmentModule\"]/b");
	By Vacancies = By.xpath("//*[@id=\"menu_recruitment_viewJobVacancy\"]");
	By jobtitle = By.name("vacancySearch[jobTitle]");
	By vacantpositions = By.name("vacancySearch[jobVacancy]");
	By hiringmanager = By.name("vacancySearch[hiringManager]");
	By status = By.name("vacancySearch[status]");
	By add_candidate1 = By.xpath("//*[@id=\"btnAdd\"]");
	By Jobtitle  = By.xpath("//*[@id=\"addJobVacancy_jobTitle\"]");
	By VacancyName = By.xpath("//*[@id=\"addJobVacancy_name\"]");
	By HiringManager = By.xpath("//*[@id=\"addJobVacancy_hiringManager\"]");
	By Number_of_positions = By.xpath("//*[@id=\"addJobVacancy_noOfPositions\"]");
	By Description  = By.xpath("//*[@id=\"addJobVacancy_description\"]");
	By active = By.xpath("//*[@id=\"addJobVacancy_status\"]");
	By save = By.xpath("//*[@id=\"btnSave\"]");
	
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

    public void LoginDetails() // method for the login credentials by passing keys
    {
	   driver.findElement(Username).sendKeys("Admin");
	   driver.findElement(Password).sendKeys("admin123");
    }

    public void submit() throws InterruptedException  //method to click and submit the credentials
	{
		driver.findElement(Submit).click();
		
	}  

    public void Search_item() throws InterruptedException  //To reset the candidate details in the recruitment page
   {
	driver.findElement(Recruitment).click();
	driver.findElement(Vacancies).click();
	driver.findElement(jobtitle).click();
	driver.findElement(vacantpositions).click();
	driver.findElement(hiringmanager).click();
	driver.findElement(status).click();
}
	public void add_candidate()  //To add the candidate vacancies details in the recruitment page
	{
		driver.findElement(add_candidate1).click();
		driver.findElement(Jobtitle).click();
		driver.findElement(VacancyName).sendKeys("chandra");
		driver.findElement(HiringManager).sendKeys("david");
		driver.findElement(Number_of_positions).sendKeys("10");
		driver.findElement(Description).sendKeys("All candidates should reported within time");
		driver.findElement(active).click();
		driver.findElement(save).click();
		driver.close();
	}
	
	
}
