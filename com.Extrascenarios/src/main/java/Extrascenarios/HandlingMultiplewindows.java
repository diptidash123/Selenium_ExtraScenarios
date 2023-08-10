package Extrascenarios;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultiplewindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dipti Ranjan Dash\\Downloads\\chromedriver_win32 (10)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();	
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());		
	    Set<String>	variable=driver.getWindowHandles();
	    for(String i:variable)
	    {
	    	System.out.println(i);
//	    	String variable2=driver.switchTo().window(i).getTitle();
//	    	System.out.println(variable2);
	    	if (i.equals("Selenium")) 
	    	{
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
			}
	    	driver.findElement(By.xpath("//a[@href='/downloads']")).click();
	    	driver.findElement(By.xpath("//span[normalize-space()='Documentation']")).click();
	    	driver.close();
//	    	driver.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();
//	    	driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();
//	    	System.out.println("The execution is in child browser");
//	    	driver.close();
	    }
	}

}