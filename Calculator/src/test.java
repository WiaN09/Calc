

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class test {
	

	public static void openapp() throws MalformedURLException {
		
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName","Trial");
		//cap.setCapability("udid","S4IVBIYSIFFM65UC");
		cap.setCapability("platformName","Android");
		//cap.setCapability("platformVersion","7.0");
		cap.setCapability("appPackage","com.android.calculator2");
		cap.setCapability("appActivity","com.android.calculator2.Calculator");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AppiumDriver<MobileElement> driver=new AppiumDriver<MobileElement>(url,cap);
		
		System.out.println("Opened..");
	}
}
