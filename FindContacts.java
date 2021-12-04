package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FindContacts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Find Contacts")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
		driver.findElement(By.id("findContacts")).click();
		//driver.findElement(By.id("firstNameField")).sendKeys("vignesh");
		//String fname =driver.getTitle();
		//System.out.println(fname);
		//driver.findElement(By.id("lastNameField")).sendKeys("rajan");
		//driver.findElement(By.name("submitButton")).click();
		//String fname = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		//driver.findElement(By.id("accountPartyId")).sendKeys("123123");
		//driver.findElement(By.id("primaryEmail")).sendKeys();
		driver.findElement(By.linkText("opentaps")).click();
		driver.findElement(By.className("decorativeSubmit")).click();
		//System.out.println(title1);
		//System.out.println("contact email: " + fname);
		driver.close();
	}


	}

