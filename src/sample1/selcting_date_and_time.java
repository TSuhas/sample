package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class selcting_date_and_time {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[4]//div[1]//div[2]//*[name()='svg']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-2']")).click();
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).click();
		WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select s= new Select(year);
		s.selectByValue("1993");
		
		
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		
		Select s1 = new Select(month);
		s1.selectByValue("4");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@aria-label='Choose Friday, May 21st, 1993']")).click();
	}
}
