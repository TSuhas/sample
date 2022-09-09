package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/radio-button");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Radio Button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Impressive']")).click();
		Thread.sleep(1000);
		WebElement radio = driver.findElement(By.xpath("//label[normalize-space()='Yes']"));
		Actions act= new Actions(driver);
		act.click(radio).perform();
		Thread.sleep(1000);
		
		if(radio.isEnabled()) {
			System.out.println("button is selected");
		}
		else {
			System.out.println("Button is not selctable");
		}
		
		Thread.sleep(1000);
		
		
	}
	
}
