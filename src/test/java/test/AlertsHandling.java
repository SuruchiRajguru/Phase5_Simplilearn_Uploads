package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		WebElement custId=driver.findElement(By.xpath("//*[@name='cusid']"));
		WebElement submit=driver.findElement(By.xpath("//*[@name='submit']"));
		
		custId.sendKeys("12345");
		submit.click();
		
		Alert alert=driver.switchTo().alert();
		
		alert.sendKeys("asded");
		//alert.accept();
		alert.dismiss();
		
		//alert.sendKeys("asded");
		
		
		

	}

}
