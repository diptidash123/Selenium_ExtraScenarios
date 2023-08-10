package ExtraNewscenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SessionIdCapturing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   WebDriverManager.chromedriver().setup();
		   ChromeOptions options=new ChromeOptions();
		   WebDriver driver=new ChromeDriver(options);
		   driver.navigate().to("https://www.flipkart.com");
		   
		   String sessionid=((ChromeDriver)driver).getSessionId().toString();
		   System.out.println("sessionId:" + " "+ sessionid);
		   driver.close();
	}

}