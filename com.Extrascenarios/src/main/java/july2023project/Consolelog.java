package july2023project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import com.google.j2objc.annotations.ReflectionSupport.Level;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Consolelog {

	public static void main(String[] args) {

		        // Set the path to the chrome-driver executable
		        WebDriverManager.chromedriver().setup();
		        ChromeOptions options=new ChromeOptions();
		        options.addArguments("--incognito");
		        
		        
		       
		        
		        // Create a new instance of ChromeDriver
		        WebDriver driver = new ChromeDriver(options);

		        // Navigate to the web page where you want to capture console logs
		        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		        System.out.println(driver.getTitle());
		        System.out.println(driver.getCurrentUrl());
		        System.out.println(driver.getPageSource());
		        
		       // Get the browser's console logs
		        LogEntries logs = driver.manage().logs().get(LogType.BROWSER);

		        // Create a Properties object to store the logs
		        Properties properties = new Properties();

		        // Iterate through the log entries and add them to the properties object
		        for (LogEntry logEntry : logs) {
		            properties.setProperty(logEntry.getLevel().toString(), logEntry.getMessage());
		        }
		        
		     // Save the logs to a file
		        try {
		            FileWriter fileWriter = new FileWriter("log.txt");

		            // Iterate through the log entries and write them to the file
		            for(LogEntry logEntry : logs) {
		                fileWriter.write(logEntry.getMessage() + "\n");
		            }

		            fileWriter.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }

		        
		        
//		        // Save the properties to a file
//		        try {
//		            FileOutputStream fileOutputStream = new FileOutputStream("console_logs.properties");
//		            properties.store(fileOutputStream, "Browser Console Logs");
//		            fileOutputStream.close();
//		        } catch (IOException e) {
//		            e.printStackTrace();
//		        }

		        // Close the browser and quit the WebDriver
		        driver.quit();
		        
		        

//		        // Get the browser's console logs
//		        LogEntries logs = driver.manage().logs().get("browser");
//
//		        // Create a dummy file to save the logs
//		        try {
//		            FileWriter fileWriter = new FileWriter("D:\\Eclipse Folder\\com.Extrascenarios\\target\\chromelog.txt");
//
//		            // Iterate through the log entries and write them to the file
//		            for(LogEntry logEntry : logs) {
//		                fileWriter.write(logEntry.getMessage() + "\n");
//		            }
//
//		            fileWriter.close();
//		        } catch (IOException e) {
//		            e.printStackTrace();
//		        }
//
//		        // Close the browser and quit the WebDriver
//		        //driver.close();
		    }
}