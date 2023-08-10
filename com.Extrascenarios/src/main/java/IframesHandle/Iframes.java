//package IframesHandle;
//
//import java.time.Duration;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Iframes {
//
//	public static void main(String[] args) throws InterruptedException {
//
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dipti Ranjan Dash\\Downloads\\chromedriver_win32 (10)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		//url launch on the browser
//		driver.get("https://demo.automationtesting.in/Frames.html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		//click to i-frame button within i-frame page
//		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		//outer frame parent i-frame
//		WebElement outerframe=driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
//		driver.switchTo().frame(outerframe);
//		System.out.println("Here the parent frame is handled correctly");
//		
//		//child i-frame inner i-frame
//		WebElement innerframe=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
//		driver.switchTo().frame(innerframe);
//		System.out.println("Here the inner frame is handled correctly");
//		driver.findElement(By.tagName("input")).sendKeys("dipti ranjan dash");
//		System.out.println("Inner iframe element is taking the data successfully");
//		driver.close();
//		//driver.findElement(By.xpath(null))
//
//	}
//
//}
