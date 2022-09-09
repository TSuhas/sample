package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class crossArrow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='card mt-4 top-card'][1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[@class='btn btn-light '])[2]")).click();
		Thread.sleep(1000);
		
		
	}
	
}
