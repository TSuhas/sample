package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDeals {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		
		
		driver.findElement(By.xpath("//a[@href='/deals?ref_=nav_cs_gb']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@class='a-last']//a[@href='#']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Deal: Woodland, Red Tape, Red Chief; Deal price: Up to 85% off']//div[@class='a-image-container a-dynamic-image-container aok-align-center-horizontally DealImage-module__image_1aM-S1pMSsajamWgCRXa6y DealImage-module__imageAspectRatioFix_DJdrM5BSpMhSiPB6czCA4']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@title='Red Tape mens Rtf0051 Sport Sandal']//div[@class='a-section octopus-dlp-image-shield']")).click();
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//select[@id='native_dropdown_selected_size_name']")).click();
		 driver.findElement(By.xpath("//option[contains(text(),' 8 UK ')]")).click();
		
		
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(1000);
		
		
		/*driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/SWISSBRAND-Vevey-Cabin-Luggage-Trolley/dp/B08KW3YPDR/ref=lp_29040128031_1_1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("7741907555");
		driver.findElement(By.xpath("//input[@id='continue']")).click();*/
		
	}
	
}
