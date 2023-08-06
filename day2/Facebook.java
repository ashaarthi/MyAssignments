package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args)
	
	{
		
		
        ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebElement CreateButton =driver.findElement(By.linkText("Create new account"));
		
		CreateButton.click();
		
		WebElement firstName =driver.findElement(By.xpath("//input[@name='firstname']"));

		firstName.sendKeys("Asha");


		WebElement surName =driver.findElement(By.xpath("//input[@name='lastname']"));

		surName.sendKeys("Ram");


		WebElement email =driver.findElement(By.xpath("//input[@name='reg_email__']"));

		email.sendKeys("asharam98@gmail.com");
		
		
		WebElement emailConfirm =driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));

		emailConfirm.sendKeys("asharam98@gmail.com");
	
		WebElement password =driver.findElement(By.id("password_step_input"));

		password.sendKeys("Hello123$");
  
		  WebElement DOB = driver.findElement(By.id("day"));

        Select dropdown_1=new Select(DOB);
  
        dropdown_1.selectByIndex(3);

        WebElement Month = driver.findElement(By.id("month"));
        
        Select dropdown_2=new Select(Month);
        
        dropdown_2.selectByValue("10");
        
        WebElement Year = driver.findElement(By.id("year"));
        Select dropdown3 =new Select(Year);
        
        dropdown3.selectByVisibleText("2000");
       
        WebElement sex = driver.findElement(By.xpath("//input[@name='sex']"));
        sex.click();
        
        WebElement Signup =driver.findElement(By.xpath("//button[@name='websubmit']"));

        Signup.click();
        
		 

	
}
}