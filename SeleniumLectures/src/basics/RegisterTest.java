package basics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RegisterTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdrier.chrome.driver", "/Users/jawidkhiabani/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.get("http://tek-school.com/retail");
		WebElement myAccount=driver.findElement(By.xpath("//span[tet()='My Account']"));
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
		WebElement noButton=driver.findElement(By.xpath("//input[@value='1' and @name='newsletter']"));
		WebElement privacy=driver.findElement(By.xpath("//input[@name='agree']"));
		WebElement continueButton=driver.findElement(By.xpath("//input[@type='submit']"));
		
		firstName.sendKeys("Jawid");
		lastName.sendKeys("Shahin");
		email.sendKeys("khiabani2020@gmail.com");
		telephone.sendKeys("4436358899");
		password.sendKeys("james008");
		confirmPassword.sendKeys("james007");
		
		if(!yesButton.isDisplayed()) {
			yesButton.click();
		}
			if(privacy.isDisplayed()) {
				privacy.click();
				
		}
			
		Thread.sleep(5000);
		continueButton.click();

	}

}
