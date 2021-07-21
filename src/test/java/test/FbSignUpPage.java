package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignUpPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		WebElement createAccount=driver.findElement(By.xpath("//*[text()='Create New Account']"));
		createAccount.click();
		
//		WebElement fbtext=driver.findElement(By.xpath("//*[text()='Facebook helps you connect and share with the people in your life.']"));
//		fbtext.click();
//		
//		WebElement forgotPassword=driver.findElement(By.xpath("//*[text()='Forgotten password?']"));
//		forgotPassword.click();
		WebElement day=driver.findElement(By.xpath("//*[@id='day']"));
		Select dayDropDown=new Select(day);
		dayDropDown.selectByIndex(3);
	//	DropDown.selectByValue("1");
		
		
//		
		WebElement month=driver.findElement(By.xpath("//*[@id='month']"));
		
		Select monthDropDown=new Select(month);
		//monthDropDown.selectByValue("1");
		monthDropDown.selectByVisibleText("Jan");
	//	monthDropDown.selectByIndex(1);
		
		WebElement year=driver.findElement(By.xpath("//*[@id='year']"));
		Select yearDropDown=new Select(year);
		yearDropDown.selectByValue("2020");
		
		WebElement gender=driver.findElement(By.xpath("//*[@type='radio' and @value='2']"));
		gender.click();
		
		

	}

}
