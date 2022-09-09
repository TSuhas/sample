package sample1;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class web_table_new_window_open_screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/webtables");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Web Tables']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("suhas");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("tupake");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("suhas@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("25");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class=' mr-sm-2 form-control'])[4]")).sendKeys("20000");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("QA");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	
		Thread.sleep(1000);
		// to open new tab in browser
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		
		//to take a screenshot
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String random = RandomString.make(4);
	File dst= new File("C:\\Users\\suhas.tupake\\Desktop\\path\\scrrenshot"+random+".png");
	FileHandler.copy(src, dst);
		driver.close();
		Thread.sleep(1000);
		driver.quit();
		
		
		
	}
}
