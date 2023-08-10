//package IframesHandle;
//
//import java.time.Duration;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//public class ComplexMultipleIframes {
//
//	public static void main(String[] args) throws InterruptedException {
//
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dipti Ranjan Dash\\Downloads\\chromedriver_win32 (10)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		//URL launch on the browser
//		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		//outer i-frame 1
//        WebElement outerframe1=driver.findElement(By.xpath("//iframe[@id=\"frame1\"]"));
//	    driver.switchTo().frame(outerframe1);
//	    System.out.println(driver.findElement(By.xpath("//b[@id=\"topic\"]")).getText());
//	    driver.findElement(By.tagName("input")).sendKeys("dipti ranjan dash");
//	    System.out.println("index 0 is handled parent handled");
//	    
//	    //inner i-frame 
//	    WebElement inneriframe= driver.findElement(By.xpath("//iframe[@id=\"frame3\"]"));
//	    driver.switchTo().frame(inneriframe);
//	    System.out.println("index 1 is handled child is handled");
//	    System.out.println(driver.findElement(By.xpath("//b[@style=\"color:green\"]")).getText());
//	    driver.findElement(By.xpath("//input[@id=\"a\"]")).click();
//	    try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    
//	    driver.switchTo().defaultContent();
//	    
//	    WebElement outerframe2=driver.findElement(By.xpath("//iframe[@id=\"frame2\"]"));
//	    driver.switchTo().frame(outerframe2);
//	    System.out.println(driver.findElement(By.xpath("//b[.='Animals :']")).getText());
//	    
//	    WebElement dropdownelement=driver.findElement(By.xpath("//*[@id=\"animals\"]"));
//	    Select sel=new Select(dropdownelement);
//	    sel.selectByVisibleText("Baby Cat");
//	    Thread.sleep(3000);
//	    System.out.println("successfully handled the iframe scenario");
//	    driver.close();
//
//	}
//
//}