package Advancednewtopics_chromeoptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IngonitoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(ChromeOptions.CAPABILITY,options);
		options.merge(cap);
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com");
		System.out.println("url of the current webpage:"+ driver.getCurrentUrl());
		System.out.println("title of the current webpage:"+ driver.getTitle());
		System.out.println("Browser link launched in incognito");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		

	}

}