package ExtraNewscenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IsdisplayedIsenabledIsselected {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-access");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");		
		//isdisplayed() 
		WebElement variable=driver.findElement(By.xpath("//label[@id=\"userName-label\"]"));
		System.out.println(variable.isDisplayed());//true
		
		//is enabled
		WebElement variable1=driver.findElement(By.xpath("//input[@id=\"firstName\"]"));
		variable1.sendKeys("dipti");
		System.out.println(variable1.isEnabled());//true
		
		//isselected
       WebElement variable2= driver.findElement(By.xpath("(//label[@class=\"custom-control-label\"])[1]"));
       System.out.println(variable2.isSelected());//false
       
       WebElement variable3= driver.findElement(By.xpath("(//label[@class=\"custom-control-label\"])[2]"));
       variable3.click();
       Thread.sleep(2000);
       System.out.println(variable3.isSelected());//true
       driver.close();
       
		
		

	}

}
