package InterviewquestionsPackage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextandGetAttributevalue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.navigate().to("https://demoqa.com/automation-practice-form");
        String title=driver.getTitle();
        System.out.println(title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        
        //normal Enter ring a data in input box
        //WebElement conatiner=driver.findElement(By.xpath("//input[@id=\"userEmail\"]"));
        //conatiner.sendKeys("diptiranjandasdipti@gmail.com");
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        //JavaScriptExecutor
        JavascriptExecutor js=((JavascriptExecutor) driver);
        //js.executeScript("arguments[0].value='diptiranjandasdipti@gmail.com';",conatiner);
        Thread.sleep(3000);
        //conatiner.clear();
       //String container1=conatiner.getText();
       //System.out.println(container1);
        Thread.sleep(3000);
        //System.out.println("The box is cleared successfully");
        driver.close();       
	}

}
