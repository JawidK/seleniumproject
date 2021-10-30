package myPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mypractice {

	public static void main(String[] args) {
		
		System.setProperty("webdrier.chrome.driver", "/Users/jawidkhiabani/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tek-school.com/retail/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		WebElement signin = driver.findElement(By.id("hide_xs"));
		signin.click();
		WebElement email = driver.findElement(By.id("email"));
		WebElement password= driver.findElement(By.xpath(""));
		email.sendKeys("jawid@gmail.com");
		password.sendKeys("122345jj");

	}

}
