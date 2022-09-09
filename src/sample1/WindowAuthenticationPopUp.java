package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAuthenticationPopUp {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// to handle a particular popup, change in a website . website is  https://the-internet.herokuapp.com/
		
		// syntax- "https://username:password@url"
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();
		
	}
}
