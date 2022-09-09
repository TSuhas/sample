package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Deals'])[9]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ebayui-ellipsis-2'])[18]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='isCartBtn_btn']")).click();
		
	}
	
}
