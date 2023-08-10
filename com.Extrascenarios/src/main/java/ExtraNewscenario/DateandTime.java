package ExtraNewscenario;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DateandTime {

	public static void main(String[] args) {
	   WebDriverManager.edgedriver().setup();
	   EdgeOptions options=new EdgeOptions();
	   WebDriver driver=new EdgeDriver(options);
	   driver.navigate().to("https://www.google.com");
	   System.out.println(driver.getTitle());
	   System.out.println(driver.getCurrentUrl());
	    
	   //Date and Time of the sytem using selenium webdriver
	   //format-1
	   Date date=new Date();
	   SimpleDateFormat formatingdateandtime=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	   String systemdatetimeoutput=  formatingdateandtime.format(date);
	   System.out.println("system date and time fetched by the sytem:" + systemdatetimeoutput);
	   
	   //format-2
	   Date date1=new Date();
	   SimpleDateFormat formatingdateandtime1=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	   String systemdatetimeoutput1=  formatingdateandtime1.format(date1);
	   System.out.println("system date and time fetched by the sytem:" + systemdatetimeoutput1);
	   
	   //format-3
	   Date date2=new Date();
	   SimpleDateFormat formatingdateandtime2=new SimpleDateFormat("yyyy/dd/MM HH:mm:ss");
	   String systemdatetimeoutput2=  formatingdateandtime1.format(date2);
	   System.out.println("system date and time fetched by the sytem:" + systemdatetimeoutput2);
	   
	   //format-4
	   Date date3=new Date();
	   SimpleDateFormat formatingdateandtime3=new SimpleDateFormat("dd/yyyy/MM HH:mm:ss");
	   String systemdatetimeoutput3=  formatingdateandtime3.format(date3);
	   System.out.println("system date and time fetched by the sytem:" + systemdatetimeoutput3);
	   
	   //Date()-Method
	   //simpledateformat()- class
	   //object creation simpldateformat(using format method and passing the variable date3)
	   
       driver.close();
       
	}

}
