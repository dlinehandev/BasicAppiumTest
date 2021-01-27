package appiumtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class HostelWorldTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		// Create object of  DesiredCapabilities class and specify android platform
		DesiredCapabilities capabilities=DesiredCapabilities.android();
		 
		 
		// set the capability to execute test in chrome browser
		 capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
		 
		// set the capability to execute our test in Android Platform
		   capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,Platform.ANDROID);
		 
		// we need to define platform name
		  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		 
		// Set the device name as well (you can give any name)
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		 
		 // set the android version as well 
		   capabilities.setCapability(MobileCapabilityType.VERSION,"10");
		 
		 // Create object of URL class and specify the appium server address
		 URL url= new URL("http://127.0.0.1:4723/wd/hub");
		 
		// Create object of  AndroidDriver class and pass the url and capability that we created
		 WebDriver driver = new AndroidDriver(url, capabilities);
		 
		// Open url
		driver.get("http://www.hostelworld.com");
		  
		 // click on the popup 
		driver.findElement(By.xpath("//*[@id='__layout']/div/div[1]/div[1]/div/div/div/div[2]")).click();
		  
		//enter search term
		Thread.sleep(1000);
		driver.findElement(By.id("location-text-input-field")).sendKeys("Dublin");
		
		// click search button

		  
		  
	}

}
