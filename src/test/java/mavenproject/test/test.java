package mavenproject.test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import HRIS.hris_login;
import HRIS.timesheet_hris;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class test
{
	WebDriver driver;
	@BeforeClass
	public void init()
	{
		//System.setProperty("webDriver.chrome.driver","C:\\Users\\shivangigautam\\Downloads\\chromedriver_win32");
		driver=new ChromeDriver();
	}
	@AfterClass
	public void closeSession() 
	{
//		driver.quit();
	}
	@Test
	public void step01_launchURL()
	{
		driver.get("https://hris.qainfotech.com/login.php");
		driver.findElement(By.cssSelector("a[href='#panel1']")).click();
		driver. manage(). window().maximize();
	}
    @Test
	public void step04_SignIn()
	{
	hris_login login=new hris_login(driver);            //create object of hris_login to reach to that page
	login.setusername("shivangigautam");
	login.setpassword("Shivangi@321#");
	login.clickLogin();
	}
    @Test
    public void step05_Timesheet()
    {
    	timesheet_hris timesheet=new timesheet_hris(driver);
    	timesheet.CheckTimesheet();
        timesheet.time(25);
    	timesheet.CheckTaskBoard();
    	timesheet.CheckDashBoard();
    }
    
	
}