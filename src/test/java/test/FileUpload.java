package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		WebElement fileInput=driver.findElement(By.xpath("//*[@name='uploadfile_0']"));
		fileInput.sendKeys("C:\\Users\\Suruchi\\Desktop\\quantity.txt");
		//*[@name='terms']
		WebElement terms=driver.findElement(By.xpath("//*[@name='terms']"));
		terms.click();
		//*[@name='send']
		WebElement submit=driver.findElement(By.xpath("//*[@name='send']"));
		submit.click();
	}

}
