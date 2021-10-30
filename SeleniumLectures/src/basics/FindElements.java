package basics;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://tek-school.com/retail");
		// to find all links and print href attribute value
		List<WebElement> webLinks = driver.findElements(By.tagName("a"));
		System.out.println(webLinks.size() + " This is size for weblinks list");
		
		for (WebElement links : webLinks) {
			System.out.println(links.getAttribute("href")); // this will return value of attribute you define
			if(links.getText().equals("My Account")) {
				links.click();
				break;
			}
		}
	}
}
		
		
		
		
	

	