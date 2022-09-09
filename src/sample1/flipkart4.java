package sample1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart4 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\suhas.tupake\\\\Desktop\\\\path\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='_2KpZ6l _3dESVI'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[12]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='_2r_T1I'])[1]")).click();
		Set<String> window = driver.getWindowHandles();
		
		Iterator <String> it = window.iterator();
		String pwindow = it.next();
		String cwindow= it.next();
		driver.switchTo().window(cwindow);
		driver.findElement(By.xpath("(//a[@class='_1fGeJ5 _2UVyXR _31hAvz'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='_1fGeJ5 PP89tw _2UVyXR _31hAvz'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- _17N0em']")).sendKeys("9876543210");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _20xBvF _3AWRsL']")).click();
		Thread.sleep(1000);
		
		
}


}
