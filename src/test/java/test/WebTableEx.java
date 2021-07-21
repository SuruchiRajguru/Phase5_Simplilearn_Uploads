package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		System.out.println("Total rows are:"+rows.size());
		
		List<WebElement> cols=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/th"));
		System.out.println("Total columns are:"+cols.size());
		
		//*[@id='customers']/tbody/tr[4]/td[1]
		WebElement data=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[4]/td[1]"));
		System.out.println(" column data is:"+data.getText());
		
		for(int index=2;index<=rows.size();index++) {
			
			WebElement data1=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+index+"]/td[1]"));
			WebElement data2=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+index+"]/td[2]"));
			WebElement data3=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+index+"]/td[3]"));
			
			System.out.println(data1.getText()+"\t\t"+data2.getText()+"\t\t"+data3.getText());
			
			WebElement scrollTo=driver.findElement(By.xpath("//*[text()='HTML Table - Add a Border']"));
			JavascriptExecutor obj=(JavascriptExecutor) driver;
			obj.executeScript("arguments[0].scrollIntoView()", scrollTo);
			
			
		}
		
		

	}

}
