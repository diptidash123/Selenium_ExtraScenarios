package Extrascenarios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsSelenium {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dipti Ranjan Dash\\Downloads\\chromedriver_win32 (10)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        //driver.navigate().to("https://demoqa.com/text-box");
		//driver.get("https://www.pavantestingtools.com/2020/09/selenium-locators-xpath.html");
		driver.get("https://www.saucedemo.com/");
        //locators available for Selenium test automation
		
		//Id locator
        //driver.findElement(By.id("userName")).sendKeys("dipti ranjan dash");
        //driver.findElement(By.id("userEmail")).sendKeys("diptiranjandasdipti@gmail.com");
		
		//name locator
		//Thread.sleep(3000);
		//driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		
		//link text and partial link text locator
		//driver.findElement(By.linkText("What are the common bugs in API testing?")).click();
		//Thread.sleep(4000);
		//driver.findElement(By.partialLinkText("what are the challenges")).click();
		//Thread.sleep(4000);
		//driver.close();
		
		//class locator
		//driver.findElement(By.className("oxd-input oxd-input--active")).sendKeys("dipti");
		//System.out.println("It must throw some error messages");
		//System.out.println("org.openqa.selenium.InvalidSelectorException");
		
		//Tagname locator
		//Thread.sleep(4000);
		//driver.findElement(By.tagName("(//input)[1]")).sendKeys("diptiranjan");
		//driver.findElement(By.tagName("(//input)[2]")).sendKeys("dash");
		//Thread.sleep(4000);
		
		//css selector locator
		//driver.findElement(By.cssSelector("#userName")).sendKeys("diptiranjan");
//		driver.findElement(By.cssSelector("input#userName")).sendKeys("diptiranjandash");
//		driver.findElement(By.cssSelector("#userEmail")).sendKeys("dashengineer@gmail.com");
//        //driver.findElement(By.cssSelector("input.mr-sm-2 form-control")).sendKeys("engineer");
//		driver.findElement(By.cssSelector("textarea[placeholder=\"Current Address\"]")).sendKeys("Software engineer");
//		driver.findElement(By.cssSelector("textarea.form-control[id=\"permanentAddress\"]")).sendKeys("Automation+performance");
//		driver.findElement(By.xpath("(//button[@type=\"button\"])[2]")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input")).sendKeys("diptiranjandash");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[2]/div[2]/input")).sendKeys("dashengineer@gmail.com");
//        //driver.findElement(By.cssSelector("input.mr-sm-2 form-control")).sendKeys("engineer");
//		driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("Software engineer");
//		driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("Automation+performance");
//		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		//X-paths locators
		//Absolute X-path
//		Thread.sleep(5000);
//		WebElement username=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
//		username.sendKeys("Admin");
//		
//		WebElement password=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
//		password.sendKeys("admin123");
//		
//		WebElement Login=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
//		Login.click();
//		Thread.sleep(4000);	
		
		//Relative xpath
//		Thread.sleep(5000);
//		WebElement username=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
//		username.sendKeys("Admin");
//		
//		WebElement password=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
//		password.sendKeys("admin123");
//		
//		WebElement Login=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
//		Login.click();
//		System.out.println("The test is completed");
//		Thread.sleep(4000);	
		
		//Xpath by text
//		driver.findElement(By.xpath("//a[text()='हिन्दी']")).click();
		Thread.sleep(5000);
		
		//xpath by index
		//(//input[@class="oxd-input oxd-input--active"])[1]
		
		//or operator//and operator
		//driver.findElement(By.xpath("//input[@name=\"search\" or @class=\"form-control form-control-lg\"]")).sendKeys("selenium");
		//driver.findElement(By.xpath("//input[starts-with(@name,\"se\")]")).sendKeys("selenium");
//		driver.findElement(By.xpath(null));
//		
//		driver.findElement(By.xpath("//div[@class=\"rt-table\"]//a[text()='Git Pocket Guide']")).click();
//		Thread.sleep(3000);
		//chro-path and selector Hub extensions are working fine.//*[@id="user-name"]
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/child::div/div[1]/form/div[1]/input[@class=\"input_error form_input\"]")).sendKeys("standard_user");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		
	}

}