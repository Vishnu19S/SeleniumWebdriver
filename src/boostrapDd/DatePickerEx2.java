package boostrapDd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.devtools.v106.webaudio.WebAudio;
import org.openqa.selenium.support.ui.Select;

public class DatePickerEx2 {

	public static WebDriver driver;

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(co);
		driver.get("https://demoqa.com/date-picker");
		String date = "19";
		driver.findElement(By.id("datePickerMonthYearInput")).click();

		WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));

		Select mondd = new Select(month);

		mondd.selectByVisibleText("December");

		WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));

		Select yeardd = new Select(year);

		yeardd.selectByVisibleText("2025");

		List<WebElement> dte = driver.findElements(By.xpath("//div[@class='react-datepicker__week']//div"));

		for (WebElement dateele : dte) {
			String fde = dateele.getText();

			if (fde.equals(date)) {
				dateele.click();
				break;
			}
		}
		
		}

	}


