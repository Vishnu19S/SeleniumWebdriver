package boostrapDd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePickerEx {
	public static WebDriver driver;

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(co);
		driver.get("https://jqueryui.com/datepicker/");

		driver.switchTo().frame(0);

		// Using Date Picker

		String year = "2023";
		String month = "September";
		String Date = "29";

		driver.findElement(By.id("datepicker")).click();// Open the date picker

		while (true) {
			String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if (mon.equals(month) && yr.equals(year)) {
				break;
			} else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}

		List<WebElement> dte = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

		for (WebElement dateele : dte) {
			String fde = dateele.getText();

			if (fde.equals(Date)) {
				dateele.click();
				break;
			}
		}
	}

}
