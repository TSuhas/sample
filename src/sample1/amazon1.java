package sample1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		 WebElement username = driver.findElement(By.xpath("//input[@id='ap_email']"));
		 Actions act = new Actions(driver);
		 act.click(username).perform();
		 act.sendKeys("suhastupake").perform();
		 Thread.sleep(2000);
		 username.clear();
		 Thread.sleep(2000);
		 act.click(username).perform();
		 act.sendKeys("vishwastupake").perform();
		 Thread.sleep(2000);
		 username.clear();
		 act.click(username).perform();
		 act.sendKeys("7741907555").perform();
		 driver.findElement(By.xpath("//input[@id='continue']")).click();
		  Thread.sleep(2000);
		  WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
		  Actions act1 = new Actions(driver);
		  act1.sendKeys("123456789");
		  Thread.sleep(2000);
		  password.clear();
		  act1.sendKeys("Suhas@555");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='continue']")).click();
		  Thread.sleep(2000);
		 driver.quit();
		 
		 
	}
}
