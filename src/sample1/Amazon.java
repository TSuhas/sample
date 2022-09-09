package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='mobiles under 30000']")).click();
		driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//u[contains(text(),'+2 colors/patterns')]")).click();
		Thread.sleep(7000);
		 driver.findElement(By.xpath("//button[@id='a-autoid-21-announce']")).click();
	
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
	}
}
