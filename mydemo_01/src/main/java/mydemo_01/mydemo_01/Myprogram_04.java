package mydemo_01.mydemo_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Myprogram_04 {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		WebElement Reg=driver.findElement(By.xpath("//a[contains(text(),'SignUp')]"));
		Reg.click();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("haneesha213");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("haneesha");
	    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("yamana");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("haneesha213");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("haneesha213");
		driver.findElement(By.xpath("//input[@value='Female']"));
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("07/17/2019");
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("hjfdhfkjhjfhjj");
		WebElement Que=driver.findElement(By.xpath("//input[@name='securityQuestion']"));
		Select Sel1=new Select(Que);
		Sel1.selectByIndex(1);
		driver.findElement(By.xpath("//input[@name='answer']")).sendKeys("red");
		
		
		
		
		
		
		
		driver.findElement(By.xpath("//input[@name='Submit']")).click();;
		
	}

}
