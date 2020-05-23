
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class invoke extends test{
		// TODO Auto-generated method stub
	    static AppiumDriver<MobileElement> driver;
		public static void main(String[] args) {
			try {
				openapp();
			} catch(Exception e) {
				System.out.println(e.getCause());
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}

