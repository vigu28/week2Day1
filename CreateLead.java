package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleafpractise");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vignesh");
		WebElement valuedropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(valuedropdown);
		dd.selectByIndex(4);				
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajan");
		driver.findElement(By.className("smallSubmit")).click();
		String sourceName = driver.findElement(By.id("viewLead_dataSources_sp")).getText();
		System.out.println("lead received from: " + sourceName);
		driver.findElement(By.linkText("opentaps")).click();
		driver.findElement(By.className("decorativeSubmit")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.close();
	}

}
