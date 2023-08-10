package Handlewindows;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestToHanldeMultipleWindows 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
        System.out.println("This test is a multiple windows handle");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dipti Ranjan Dash\\Downloads\\chromedriver_win32 (11)\\chromedriver.exe\\");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/browser-windows");
        System.out.println("This is a parent window");
        String parent=driver.getWindowHandle();
        System.out.println("single window session id"+parent);
        System.out.println("===============================");
        driver.findElement(By.xpath("//button[@id='tabButton']")).click();
        
        Set<String> child=driver.getWindowHandles();
        ArrayList<String> var=new ArrayList<String>(child);
        String parentwindow=var.get(0);
        String childwindow=var.get(1);
        
        System.out.println(parentwindow);
        System.out.println(childwindow);
        
        driver.switchTo().window(parentwindow);
        driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img")).click();
        Thread.sleep(4000);
        driver.quit();
//        Iterator<String> store=child.iterator();
//        String parentwindow=store.next();
//        String childwindow=store.next();
//        System.out.println("parent window session ids"+ parentwindow);
//        System.out.println("child window session ids"+ childwindow);
        
//        driver.switchTo().window(parentwindow);
//        try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img")).click();
//        Thread.sleep(4000);
//        
//        driver.switchTo().window(childwindow);
//        Thread.sleep(4000);
//        System.out.println(driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText());
//        driver.close();
//        for(String i:child)
//        {
//        		String variable3=driver.switchTo().window(i).getTitle();
//        		System.out.println("successfully switched");
//        		driver.switchTo().window(variable3);
//        		if (variable3.contains("DEMOQA")) 
//        		{
//					driver.close();
//				}
//			    driver.close();
        }
}