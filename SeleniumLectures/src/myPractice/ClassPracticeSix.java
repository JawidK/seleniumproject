package myPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassPracticeSix {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "/Users/jawidkhiabani/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://tek-school.com/retail");
		Actions action = new Actions(driver);
		WebElement laptop = driver.findElement(By.xpath("/a[text()='Laptops & Notebooks']"));
		action.moveToElement(laptop).build().perform();
		action.doubleClick(laptop).build().perform();
		action.doubleClick(laptop).build().perform();
		
	}

}
