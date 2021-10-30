package basics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromePractice {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("Webdriver.chrome.driver", "/Users/jawidkhiabani/Downloads/chromedriver ");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/ServiceLogin?service=chromiumsync");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	System.out.println(driver.getTitle());
	Thread.sleep(3000);
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("khiabani2020@gmail.com");
	Thread.sleep(3000);
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("GoodBoy88@");
	WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
	loginButton.click();
	Thread.sleep(3000);
	driver.navigate().refresh();
	driver.navigate().back();
	driver.get("http://tek-school.com/retail/");
	Thread.sleep(3000);
	driver.navigate().refresh();
	driver.close();

	
	}

}
