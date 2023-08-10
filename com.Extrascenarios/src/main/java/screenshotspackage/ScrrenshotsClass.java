package screenshotspackage;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrrenshotsClass {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dipti Ranjan Dash\\Downloads\\chromedriver_win32 (10)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//complete/full screenshot capture
		TakesScreenshot variable=(TakesScreenshot) driver;
	    File source=variable.getScreenshotAs(OutputType.FILE);
	    File target=new File("D:\\Eclipse Folder\\com.Extrascenarios\\screenshots\\Screenimage_fullpage_.png\\");
	    try 
	    {
			FileUtils.copyFile(source, target);
		} catch (IOException e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Full page screenshot taken");
	    }
	    
	    //section screenshot /portion screenshot
	    WebElement element1=driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/div/div/div/ol/li/h1"));
	    File source1=element1.getScreenshotAs(OutputType.FILE);
	    File target1=new File("D:\\Eclipse Folder\\com.Extrascenarios\\screenshots\\Screenimage_sectionpage.png\\");
	    FileUtils.copyFile(source1, target1);
	    System.out.println("section screenshot taken");
	    
	    
	    //webelement screenshot screenshot
	    WebElement element2=driver.findElement(By.xpath("//*[@id=\"mainNav\"]/a"));
	    File source2=element2.getScreenshotAs(OutputType.FILE);
	    File target2=new File("D:\\Eclipse Folder\\com.Extrascenarios\\screenshots\\Screenimage_webelement.png\\");
	    FileUtils.copyFile(source2, target2);
	    System.out.println("webelement screenshot taken");
	  	}

}