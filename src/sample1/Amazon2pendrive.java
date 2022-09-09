package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2pendrive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		
		
		driver.findElement(By.xpath("//a[normalize-space()='Electronics']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='Pen drives']")).click();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//a[@title='SanDisk Ultra Flair 32 GB USB 3.0 Pen Drive (Silver)']//div[@class='a-section octopus-pc-item-hue-shield octopus-pc-item-image-background-v3']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("7741907555");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(1000);
		
		
		
		
		
		
	}
}
