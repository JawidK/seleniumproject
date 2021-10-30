package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice22 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/jawidkhiabani/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		String userName = "admin";
		String password = "admin";
		String url = "http://"+userName+":"+password+"@"+"the-internet.herokuapp.com/basic_auth";
		System.out.println(url);
		driver.navigate().to(url);
	}

}
