package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();

WebElement username = driver.findElement(By.id("username"));
username.sendKeys("demoSalesManager");		
//sendKeys -->to type in the textbox
driver.findElement(By.id("password")).sendKeys("crmsfa");
//className -->class attribute
driver.findElement(By.className("decorativeSubmit")).click();
WebElement crm = driver.findElement(By.linkText("CRM/SFA"));
crm.click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
WebElement createLeadForm_companyName=driver.findElement(By.id("createLeadForm_companyName"));
createLeadForm_companyName.sendKeys("RCC E-Construct");
WebElement createLeadForm_firstName=driver.findElement(By.id("createLeadForm_firstName"));
createLeadForm_firstName.sendKeys("Gowsal");
WebElement createLeadForm_lastName=driver.findElement(By.id("createLeadForm_lastName"));
createLeadForm_lastName.sendKeys("Ram");
WebElement createLeadForm_departmentName=driver.findElement(By.id("createLeadForm_departmentName"));
createLeadForm_departmentName.sendKeys("Manager");
WebElement createLeadForm_description=driver.findElement(By.id("createLeadForm_description"));
createLeadForm_description.sendKeys("Nil");
WebElement createLeadForm_primaryEmail=driver.findElement(By.id("createLeadForm_primaryEmail"));
createLeadForm_primaryEmail.sendKeys("gowsalram1996@gmail.com");
driver.findElement(By.className("smallSubmit")).click();
System.out.println("The Title is :"+driver.getTitle());


	}

}
