package Extrascenarios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAutomating {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dipti Ranjan Dash\\Downloads\\chromedriver_win32 (10)\\chromedriver.exe");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys("selenium");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement googlesearchbutton=driver.findElement(By.cssSelector("[class='gNO89b']"));
		googlesearchbutton.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("h3")).click();
		System.out.println("selenium link");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("span")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println("download page");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("span")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println("documentation page");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("span")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println("projects page");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("#navbarDropdown")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println("abouts page");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector(".dropdown-item")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println("history page");
		Thread.sleep(4000);
		System.out.println("The execution is completed for css selectors");
		driver.close();
	}
}