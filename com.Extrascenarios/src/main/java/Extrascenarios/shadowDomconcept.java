package Extrascenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowDomconcept {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dipti Ranjan Dash\\Downloads\\chromedriver_win32 (10)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://shop.polymer-project.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//shadow DOM root/host/root parent access
		WebElement shopapp=driver.findElement(By.tagName("shop-app"));
	    WebElement	shadowdom1=shadowrootMethod(shopapp, driver);
		WebElement ironpages=shadowdom1.findElement(By.tagName("iron-pages"));
		WebElement shophome=ironpages.findElement(By.tagName("shop-home"));
		WebElement shadowdom2=shadowrootMethod(shophome, driver);
		driver.findElement(By.cssSelector("div:nth-child(2) >shop-button >a")).click();	
		
	}
	
	static WebElement shadowrootMethod(WebElement element,WebDriver driver)
	{ 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement shadowrootaccess=(WebElement) js.executeScript("return.arguments[0].shadowDom",element);
		return shadowrootaccess;
		
	}
}