package Advancednewtopics_chromeoptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredcapabilitiesTest 
{
	public static void main(String[] args)
	{
    System.out.println("Launching the selenium scripts");
    WebDriverManager.chromedriver().setup();
    ChromeOptions options=new ChromeOptions();
    options.addArguments("--incognito");
    DesiredCapabilities cap=new DesiredCapabilities();
    cap.setCapability("Browser Name","ChromeBrowser");
    cap.setCapability("Browser version","114.0.5735.199 (Official Build) (64-bit)");
    cap.setCapability("Browser mode","Incognito mode");
    cap.setCapability(ChromeOptions.CAPABILITY,options);
    options.merge(cap);
    WebDriver driver=new ChromeDriver(options);
    driver.get("https://www.google.com");

	}
}