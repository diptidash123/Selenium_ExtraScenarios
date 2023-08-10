package ExtraNewscenario;

import java.util.Date;
import java.text.SimpleDateFormat;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SetDataandTimeSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remoate-access");
		WebDriver driver=new ChromeDriver(options);
		driver.navigate().to("https://www.google.com");
		driver.navigate().refresh();
		driver.navigate().to("https://www.flipkart.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//To capture date and time of the system using selenium webdriver.
		// Create a Date object
        Date date = new Date();

        // Create a SimpleDateFormat object to format the date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Get the current date and time as a formatted string
        String currentDateTime = dateFormat.format(date);

        // Print the current date and time
        System.out.println("Current Date and Time: " + currentDateTime);

	}

}