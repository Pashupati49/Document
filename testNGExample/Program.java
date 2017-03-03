package testNGExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Program {
	
	public WebDriver driver;
	
	
	@BeforeMethod
	public void Open(){
		System.setProperty("webdriver.chrome.driver","E:\\Selenium jar file\\selenium drivers\\chromedriver.exe");
		
		
	}

	
	@Test(priority=3)
	public void Login() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr64957");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("debYtAq");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("html/body/div[2]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys("Esmarika Bista");
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")).click();
		driver.findElement(By.xpath(".//*[@id='dob']")).sendKeys("01/11/1995");
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")).sendKeys("Kirtipur");
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")).sendKeys("ktm");
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")).sendKeys("ktm");
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")).sendKeys("123456");
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input")).sendKeys("9842323829834");
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input")).sendKeys("Esmarika@gmail.com");
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input")).sendKeys("Hellogirl");
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")).click();
		Thread.sleep(6000);
		
	
		
	}
	 
		@Test(priority=1)
		public void Login_1() throws InterruptedException
		{
			
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("admin1");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("hello123");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div[2]/div/ul/li[2]/a")).click();
		
	}
		
		@Test(priority=2)
		public void Login_2() throws InterruptedException{
			
			driver=new ChromeDriver();
			driver.get("http://demo.guru99.com/V4/");
			driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("admin");
			driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("hello1234");
			driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
			Thread.sleep(2000);
			
			
		}
		
		
		@AfterMethod
		public void close()
		{
			driver.close();
		}
		
		
	
}
		
	
	


