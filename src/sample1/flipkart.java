package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		Thread.sleep(2000);
		
		WebElement fashion = driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"));
		Actions act = new Actions(driver);
		act.moveToElement(fashion).perform();
		Thread.sleep(1000);
		WebElement men = driver.findElement(By.xpath("//a[normalize-space()='Men Footwear']"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(men).perform();
		Thread.sleep(1000);
		WebElement shoe = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/a[1]/div[2]/div[1]"));
		Actions act2 = new Actions(driver);
		act2.moveToElement(shoe).click().perform();
		Thread.sleep(1000);
		
		
	}
}
