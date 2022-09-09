package sample1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowOpen {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\suhas.tupake\\\\Desktop\\\\path\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(2000);
	
		Set<String> main = driver.getWindowHandles();
		Iterator <String> itr= main.iterator();
		String pwindow= itr.next();
		String cwindow= itr.next();
		driver.switchTo().window(pwindow);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Thread.sleep(2000);
		Set<String> mainn = driver.getWindowHandles();
		Iterator <String> ittr= mainn.iterator();
		String pwindow1= ittr.next();
		String cwindow1= ittr.next();
		driver.switchTo().window(cwindow1);
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@id='messageWindowButton']")).click();
		Thread.sleep(2000);
		Set<String> mainnn = driver.getWindowHandles();
		
		Iterator <String> itttr= mainnn.iterator();
		String pwindow2= itttr.next();
		String cwindow2= itttr.next();
		/*Alert alt= (Alert) driver.switchTo().window(cwindow2);
		String text = alt.getText();
		System.out.println(text);
		Thread.sleep(1000);
		driver.close();
		Thread.sleep(2000);*/
		driver.switchTo().window(cwindow2);
		/*String title = driver.getTitle();
		System.out.println(title);*/
		driver.close();

		
		Thread.sleep(2000);
		driver.quit();
	}
}
