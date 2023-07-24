package boostrapDd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DatePickerEx3 {
	public static WebDriver driver;

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(co);
/*	// Method 1--Direct Sendkeys to enter the Date
		driver.get("https://adactinhotelapp.com/SearchHotel.php");

		driver.findElement(By.id("username")).sendKeys("vishnu19S");
		driver.findElement(By.id("password")).sendKeys("Adactinvishnu@19");
		driver.findElement(By.id("login")).click();

		WebElement din = driver.findElement(By.id("datepick_in"));
		din.clear();
		din.sendKeys("29/09/2023");
		*/
/*
		// Method 2

		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		String year = "2024";
		String month= "September";
		String date = "29";
		
		driver.findElement(By.id("datepicker")).click();
		
		while(true)
		{
			String monthcheck=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yearcheck=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(monthcheck.equals(month)&&yearcheck.equals(year))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
				
			}
		List<WebElement>datecheck = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for(WebElement dte:datecheck) {
		String datepick =dte.getText();
		
		if (datepick.equals(date)) {
			
			dte.click();
			break;
				}
		}
		
*/
		
		///Method 3://Using Boostrap Drop Down 
		
		driver.get("https://demoqa.com/date-picker");
		
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		
		Select monthdd = new Select(month);
		
		monthdd.selectByVisibleText("December");
		
		WebElement year=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		
		Select yeardd = new Select(year);
		
		yeardd.selectByVisibleText("2023");
		
		String date = "19";
		
		List<WebElement>datecheck=driver.findElements(By.xpath("//div[@class='react-datepicker__week']//div"));
		
		for(WebElement dte :datecheck) {
			
			String datecol=dte.getText();
			if(datecol.equals(date)) {
				dte.click();
				
			}
			
			
		}
		
			
	}
}






















