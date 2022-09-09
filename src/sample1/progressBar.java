package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class progressBar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/progress-bar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='startStopButton']")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//button[@id='resetButton']")).click();
		Thread.sleep(1000);
		
		driver.close();
		
		
		
		
		
	}
}
