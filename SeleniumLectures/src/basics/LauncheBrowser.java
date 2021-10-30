package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauncheBrowser {

	public static void main(String[] args) {
	
		System.setProperty("webdrier.chrome.driver", "/Users/jawidkhiabani/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("Amazon.com")) {
			System.out.println("Title matches");
		}
		else 
			System.out.println("Title not match");
		
		
		
		

	}

}
