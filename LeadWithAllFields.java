package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadWithAllFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

					WebDriverManager.chromedriver().setup();
					ChromeDriver driver = new ChromeDriver();
					driver.get("http://leaftaps.com/opentaps");
					driver.manage().window().maximize();
					String title = driver.getTitle();
					//System.out.println(title);
					driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
					driver.findElement(By.id("password")).sendKeys("crmsfa");
					driver.findElement(By.className("decorativeSubmit")).click();
					driver.findElement(By.linkText("CRM/SFA")).click();
					driver.findElement(By.linkText("Leads")).click();
					driver.findElement(By.linkText("Create Lead")).click();
					driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleafpractise");
					driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vignesh");
					driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajan");
					WebElement valuedropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
					Select dd = new Select(valuedropdown);
					dd.selectByIndex(4);		
					WebElement mktgdropdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
					Select ddn = new Select(mktgdropdown);
					ddn.selectByIndex(2);		
					driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vigneshk");
					driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Rrajan");
					
					driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
					driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("04/15/87");
					driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Testing");
					driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
					driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("2500000");
					
					WebElement crncydropdown = driver.findElement(By.id("createLeadForm_currencyUomId"));
					Select ddp = new Select(crncydropdown);
					ddp.selectByValue("USD");
					
					
					WebElement indusdropdown = driver.findElement(By.id("createLeadForm_industryEnumId"));
					Select ddi = new Select(indusdropdown);
					ddi.selectByVisibleText("Computer Software");
					driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("500");
					WebElement ownerdropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
					Select ddo = new Select(ownerdropdown);
					ddo.selectByVisibleText("Corporation");
					driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1342345");
					driver.findElement(By.id("createLeadForm_description")).sendKeys("For future reference");
					driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("yes its important");
					driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
					driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+971");
					driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
					driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("1356");
					driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vignesh@testing.com");
					driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("041676798");
					driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Reference");
					driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http.testleaf.com");
					driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("newaddress");
					
					driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("newname");
					driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("dubai");
					driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Burdubai");
					driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Dubai");
					
					
					WebElement statedropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
					Select dds = new Select(statedropdown);
					dds.selectByVisibleText("Alaska");
					
					driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("34523");
					WebElement Contydropdown = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
					Select ddc = new Select(Contydropdown);
					ddc.selectByValue("ARE");
					driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("54567");
					driver.findElement(By.className("smallSubmit")).click();
					//driver.findElement(By.linkText("opentaps")).click();
					//driver.findElement(By.className("decorativeSubmit")).click();
					String title1 = driver.getTitle();
					System.out.println(title1);
					//driver.close();
			}

		
	}

