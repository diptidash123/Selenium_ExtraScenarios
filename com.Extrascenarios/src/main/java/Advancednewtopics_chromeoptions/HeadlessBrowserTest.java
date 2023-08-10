package Advancednewtopics_chromeoptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(ChromeOptions.CAPABILITY,options);
		options.merge(cap);
		WebDriver driver=new ChromeDriver(options);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("URL of the webpage:-"+ driver.getCurrentUrl());
		System.out.println("Title of the webpage:-"+ driver.getTitle());
		System.out.println("Pagesource of the webpage:-"+ driver.getPageSource());
	}

}