package selenium003;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class facebooktestng {
		
	WebDriver driver =new ChromeDriver();
	
	@BeforeMethod
	public void setUp(){
	      
     driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	}
	

	    @Test
		public void loginpass() {
	    driver.findElement(By.id("email")).sendKeys(userName);
	    driver.findElement(By.id("pass")).sendKeys(password);
	    driver.findElement(By.id("loginbutton")).click();
	}


	@Test
	public void postmessage() {
		driver.findElement(By.xpath("message")).sendKeys("Hello World");
	}

	@AfterMethod
	public void tearDown() {
	    driver.close();

	}
	}

