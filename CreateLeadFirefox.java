package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			WebDriverManager.firefoxdriver().setup();
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("http://leaftaps.com/opentaps");
			driver.manage().window().maximize();
			String title = driver.getTitle();
			System.out.println(title);
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleafpractise");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vignesh");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajan");
			driver.findElement(By.className("smallSubmit")).click();
			driver.findElement(By.linkText("opentaps")).click();
			driver.findElement(By.className("decorativeSubmit")).click();
			String title1 = driver.getTitle();
			System.out.println(title1);
			driver.close()
	}

}
