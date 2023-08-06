package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateContact {

	public static void main(String[] args) throws InterruptedException 
	{
		
		 ChromeDriver driver =new ChromeDriver();
			
			driver.get("http://leaftaps.com/opentaps/control/login");
			
			driver.manage().window().maximize();
			
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
WebElement username=driver.findElement(By.id("username"));
username.sendKeys("DemoSalesManager");
WebElement password=driver.findElement(By.id("password"));
password.sendKeys("crmsfa");
WebElement LoginID=driver.findElement(By.className("decorativeSubmit"));
LoginID.click();
driver.manage().window().maximize();
WebElement CRMLink=driver.findElement(By.linkText("CRM/SFA"));
CRMLink.click();
WebElement Contacts=driver.findElement(By.linkText("Contacts"));
Contacts.click();
WebElement firstName=driver.findElement(By.id("firstNamefield"));
firstName.sendKeys("Ram");
WebElement lastName =driver.findElement(By.id("lastNameField"));

lastName.sendKeys("Mohan");


WebElement firstNameLocal =driver.findElement(By.id("createContactForm_firstNameLocal"));

firstNameLocal.sendKeys("Gowsal");


WebElement department =driver.findElement(By.xpath("//input[@name='departmentName']"));

department.sendKeys("Sports Dept ");


WebElement description =driver.findElement(By.xpath("//textarea[@name='description']"));

description.sendKeys("This is my description ");


WebElement emailID =driver.findElement(By.id("createContactForm_primaryEmail"));

emailID.sendKeys("gowsalram@gmail.com ");


WebElement State = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));


//instantiate the Select class
Select dropdown=new Select(State);

dropdown.selectByVisibleText("New York");


WebElement createContact =driver.findElement(By.xpath("//input[@name='submitButton']"));

createContact.click();


WebElement Edit =driver.findElement(By.linkText("Edit"));

Edit.click();

WebElement Description2 =driver.findElement(By.xpath("//textarea[@name='description']"));

Description2.clear();

WebElement importantNote =driver.findElement(By.xpath("//textarea[@name='importantNote']"));

importantNote.sendKeys("This is importantNote");

WebElement update =driver.findElement(By.xpath("//input[@name='submitButton'][@value='Update']"));

update.click();

String title =driver.getTitle();

System.out.println(title);


	}

}
