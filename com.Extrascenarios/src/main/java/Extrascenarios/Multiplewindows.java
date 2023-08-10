package Extrascenarios;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindows {

	public static void main(String []args)
	{
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
		Set<String> variable=driver.getWindowHandles();
		for(String var:variable)
		{ 
			System.out.println(var);
		    String variable3=driver.switchTo().window(var).getTitle();
			System.out.println(variable3);
			if (variable3.contains("Selenium")) 
			{
				System.out.println("user is in child window");
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
	}
}
