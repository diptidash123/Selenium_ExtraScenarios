package july2023project;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiplewindows 
{

	public static void main(String[] args)
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dipti Ranjan Dash\\Downloads\\chromedriver_win32 (11)\\chromedriver.exe\\");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.navigate().to("https://nxtgenaiacademy.com/multiplewindows/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String store=driver.getWindowHandle();
		System.out.println(store);
		System.out.println("===============================================");
		WebElement variable1=driver.findElement(By.xpath("(//button[normalize-space()='New Browser Tab'])[1]"));
		//Actions act=new Actions(driver);
		//act.doubleClick(variable1).perform();
		variable1.click();
		
		Set<String> store1=driver.getWindowHandles();
		Iterator<String> var=store1.iterator();
	    String parentw=var.next();
	    String childw=var.next();
	    System.out.println(parentw);
	    System.out.println(childw);
	    
	    //switching to child window and handle some scenarios
	    driver.switchTo().window(childw);
	    System.out.println(driver.getTitle());
	    driver.findElement(By.xpath("(//a[text()='Python for Automation'])[2]")).click();
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.findElement(By.xpath("//a[text()='Python Variables']")).click();
	    driver.close();
	    
	    driver.switchTo().window(parentw);
	    driver.findElement(By.xpath("//a[text()='New Browser Tab Link']")).click();
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.close();
	    driver.switchTo().window(parentw);
	    driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
	    
	    Set<String> v=driver.getWindowHandles();
	    Iterator<String> str=v.iterator();
	    System.out.println(str);
	    String childw1=str.next();
	    System.out.println(childw1);
	   	}
}