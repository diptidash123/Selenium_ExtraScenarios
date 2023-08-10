package Handlewindows;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MultiplewindowsConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dipti Ranjan Dash\\Downloads\\chromedriver_win32 (10)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://nxtgenaiacademy.com/multiplewindows/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		String store1=driver.getWindowHandle();
		System.out.println(store1);
		
		driver.findElement(By.xpath("(//*[@id=\"button1\"])[3]")).click();
		
		Set<String> store=driver.getWindowHandles();
		//Iterator<String> variable=store.iterator();
		ArrayList<String> arr=new ArrayList<String>(store);
		
		
		String parentwindow=arr.get(0);
		String childwindow=arr.get(1);
		
		System.out.println(parentwindow);
		System.out.println(childwindow);
		System.out.println("================================");
		driver.switchTo().window(childwindow);
		WebElement pythonelement=driver.findElement(By.xpath("(//a[.='Python for Automation'])[2]"));
		Actions act=new Actions(driver);
		act.doubleClick(pythonelement).perform();
		pythonelement.click();
		Thread.sleep(7000);
		WebElement install=driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/section[1]/div/div/div/div/div/div[2]/div[1]/a[3]"));
		Thread.sleep(5000);
		act.doubleClick(install).perform();
		install.click();
		Thread.sleep(4000);
		System.out.println("successfully completed execution for the child");
		driver.close();
	}
}