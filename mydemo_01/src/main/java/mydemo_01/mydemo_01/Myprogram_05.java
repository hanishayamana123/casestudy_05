package mydemo_01.mydemo_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myprogram_05 {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		//WebElement Reg=driver.findElement(By.cssSelector("a "));
		//Reg.click();
		driver.findElement(By.xpath("//a[text()=..]")).click();
		driver.findElement(By.cssSelector("input#userName")).sendKeys("asdfgh");
		driver.findElement(By.cssSelector("input#password")).sendKeys("asdfgh");
		driver.findElement(By.cssSelector("input.btn btn-lg btn-success col-xs-4 col-md-offset-0")).click();
		
		
		
		

	}

}
