package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//b[text()='Recruitment']")).click();
		Thread.sleep(2000);
		
		WebElement job = driver.findElement(By.xpath("//select[@id='candidateSearch_jobTitle']"));
		Select s1 = new Select(job);
		s1.selectByVisibleText("All");
		Thread.sleep(2000);
		
		WebElement vacancy = driver.findElement(By.xpath("//select[@id='candidateSearch_jobVacancy']"));
		Select s2 = new Select(vacancy);
		s2.selectByVisibleText("Software Engineer");
		Thread.sleep(2000);
		
		WebElement hire = driver.findElement(By.xpath("//select[@id='candidateSearch_hiringManager']"));
		Select s3 = new Select(hire);
		s3.selectByVisibleText("All");
		Thread.sleep(2000);
		
		WebElement status = driver.findElement(By.xpath("//select[@id='candidateSearch_status']"));
		Select s4 = new Select(vacancy);
		s4.selectByVisibleText("All");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='candidateSearch_candidateName']")).sendKeys("Suhas Tupake");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='candidateSearch_keywords']")).sendKeys("Java, Python, Selenium");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']")).click();
		Thread.sleep(1000);
		
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s5 = new Select(year);
		s5.selectByValue("2020");
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s6 = new Select(month);
		s6.selectByValue("0");
		Thread.sleep(1000);
		
		 driver.findElement(By.xpath("//a[text()='3']")).click();
		 Thread.sleep(1000);
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
