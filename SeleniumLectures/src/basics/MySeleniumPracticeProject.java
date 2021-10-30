package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySeleniumPracticeProject {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdrier.chrome.driver", "/Users/jawidkhiabani/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://tek-school.com/retail/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	WebElement myAccount=driver.findElement(By.xpath("//span[text()='My Account']"));
	System.out.println(myAccount.isDisplayed());
	myAccount.click();
	WebElement register=driver.findElement(By.xpath("//a[text()='Register']"));
	register.click();
	WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
	WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']"));
	WebElement email=driver.findElement(By.xpath("//input[@id='input-email']"));
	WebElement telephone=driver.findElement(By.id("input-telephone"));
	WebElement password=driver.findElement(By.id("input-password"));
	WebElement confirmPassword=driver.findElement(By.id("input-confirm"));
	WebElement yesButton=driver.findElement(By.xpath("//input[@value='1' and @name='newsletter']"));
	WebElement noButton=driver.findElement(By.xpath("//input[@name='newsletter' and @value='0']"));
	WebElement privacy=driver.findElement(By.xpath("//input[@name='agree']"));
	WebElement continueButton=driver.findElement(By.xpath("//input[@type='submit']"));
	
	firstName.sendKeys("Jawid");
	lastName.sendKeys("james");
	email.sendKeys("jhiabani2121@gmail.com");
	telephone.sendKeys("7789658819");
	password.sendKeys("James007");
	confirmPassword.sendKeys("James007");
	if(!yesButton.isSelected()) {
		
		yesButton.click();
		
	}
	if(privacy.isDisplayed()) {
		privacy.click();
		
		Thread.sleep(5000);
		continueButton.click();
		
		WebElement confirmationMessage=driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']"));
		String success = confirmationMessage.getText();
		String expectedMesssage = "Your Account Has Been Created!";
		if(success.equals(expectedMesssage)) {
			System.out.println("Register Test Passed");
		}
		else
		{
			System.out.println("Register failed");
		}
		}
	}
	
			
	
}

