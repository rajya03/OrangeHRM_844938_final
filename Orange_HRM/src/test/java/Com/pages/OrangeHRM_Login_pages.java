package Com.pages;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Com.Excel_Utility.Excel_Utility;

public class OrangeHRM_Login_pages {   //login to the application
	
	WebDriver driver;    //creating webdriver as local variable
	   By Username = By.name("txtUsername");
	   By Password = By.name("txtPassword");
	   By Submit = By.name("Submit");
	   
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
					System.setProperty("webdriver.chrome.driver","C:\\Users\\Personal\\Downloads\\Orange_HRM.zip (Unzipped Files)\\Orange_HRM\\src\\test\\resources\\Drivers\\chromedriver.exe");
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

	   
	   public OrangeHRM_Login_pages(WebDriver driver)
	   {
		   this.driver=driver;
	   }
	   public void ChromeLaunch() {   //method to open the chrome browser
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Personal\\Downloads\\Orange_HRM.zip (Unzipped Files)\\Orange_HRM\\src\\test\\resources\\Drivers\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
	 }
	   public void OrangeHRM_Homepage()  // method to open the url in the browser
		{
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			System.out.println(driver.getTitle());
		}
	   
	   public void LoginDetails(int a)  throws IOException   // method for the login credentials by passing keys
	   {
		   Excel_Utility page = new Excel_Utility();
		   driver.findElement(Username).sendKeys(page.excel_username(a));
		   driver.findElement(Password).sendKeys(page.excel_password(a)); 
	   }
	   
	   public void submit() throws InterruptedException    //method to click and submit the credentials
		{
			driver.findElement(Submit).click();
			 
	 //To take the Screenshot
		
		Date date = new Date(0);
		String datestr = date.toString().replace(":", "-");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		screenshot.renameTo(new File("src/test/resources/Screenshots/image_login.png"));
		driver.close();
		}
}
	  

	  
