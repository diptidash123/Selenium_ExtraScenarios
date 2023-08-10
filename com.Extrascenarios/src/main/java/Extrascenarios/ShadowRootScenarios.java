package Extrascenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRootScenarios {

	public static void main(String[] args) 
{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dipti Ranjan Dash\\Downloads\\chromedriver_win32 (10)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://shop.polymer-project.org/");
        WebElement shadowdomelement=driver.findElement(By.tagName("shop-app"));//shadow node /host
        WebElement shadowdom1=shadowroot(shadowdomelement, driver);
        WebElement ironpages=shadowdom1.findElement(By.tagName("iron-pages"));
        WebElement shophome=ironpages.findElement(By.name("home"));
        
        WebElement shadowdom2=shadowroot(shophome, driver);
        shadowdom2.findElement(By.cssSelector("div:nth-child(2) > shop-button > a")).click();
        
	}
	
	
	static WebElement shadowroot(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    WebElement shadowdom=(WebElement)js.executeScript("return arguments[0].shadowRoot",element);
	    return shadowdom;
	}
	
}
