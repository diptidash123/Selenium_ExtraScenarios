package ExtraNewscenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		//navigate to method
		driver.navigate().to("https:www.flipkart.com");
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com");
		
		//navigate refresh
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//driver back
		driver.navigate().back();
		Thread.sleep(3000);
		
		//navigate forward
		driver.navigate().forward();
		Thread.sleep(3000);
		
		System.out.println("successfully navigate methods used");
		Thread.sleep(3000);
		driver.close();
	}
    
}