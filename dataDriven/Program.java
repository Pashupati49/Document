package dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Program {
	public WebDriver driver;
	
	@AfterMethod
	public void Close(){
		driver.close();
		
	}
	
	@DataProvider(name="Login")
	public Object[][] data(){
		
		Object[][] data=new Object[2][2];
		data[0][0]="admin";
		data[0][1]="hello";
		data[1][0]="mngr64957";
		data[1][1]="debYtAq";
		return data;
		
	}
	
	@Test (dataProvider="Login")
	public void login( String User ,String Password) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium jar file\\selenium drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys(User);		
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(Password);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		Thread.sleep(5000);
		
		
	}

	
}
