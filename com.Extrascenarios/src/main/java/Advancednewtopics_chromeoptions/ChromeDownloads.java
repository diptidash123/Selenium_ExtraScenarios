package Advancednewtopics_chromeoptions;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDownloads {

	public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    ChromeOptions options=new ChromeOptions();
    WebDriver driver=new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.get("https://www.python.org/downloads/");
    //map=new HashMap<String,Object>());
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//a[@class=\"button\"])[8]")).click();
    Thread.sleep(4000);
    System.out.println("The Item is downloaded");

	}

}