package sample1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Appliances')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[5]/div[1]/div[3]/a[1]/div[1]/div[1]/img[2]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@class='_2KpZ6l _3dESVI'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Voltas 2 Ton 3 Star Split Inverter AC')]")).click();
		
		Set<String> window = driver.getWindowHandles();
		Iterator <String> it= window.iterator();
		String pwindow= it.next();
		String cwindow= it.next();
		driver.switchTo().window(cwindow);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		/*driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/blue-star-convertible-4-in-1-cooling-1-2-ton-3-split-inverter-ac-white/p/itma19af494398ed?pid=ACNGB663PWDHXZVM&lid=LSTACNGB663PWDHXZVMSSSMJG&marketplace=FLIPKART&store=j9e%2Fabm%2Fc54&srno=b_1_7&otracker=browse&fm=neo%2Fmerchandising&iid=e7947524-cba1-4f61-ac96-34ddf52970c2.ACNGB663PWDHXZVM.SEARCH&ppt=clp&ppn=ac-sale-store&ssid=gp9bqtpkio0000001657785350060");
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//button[normalize-space()='BUY NOW']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- _17N0em']")).sendKeys("9876543210");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _20xBvF _3AWRsL']")).click();
		Thread.sleep(1000);*/
		
		
		
		
	}
	
}
