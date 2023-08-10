package ExtraNewscenario;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CacheStorage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-access");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		((JavascriptExecutor) driver).executeScript("window.localStorage.clear");
		((JavascriptExecutor) driver).executeScript("window.sessionStorage.clear");
		((JavascriptExecutor) driver).executeScript("window.applicationCache.clear");
		
		driver.navigate().refresh();

	}

}