package boostrapDd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AdactinDemo1 {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		{
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");

			driver = new ChromeDriver(co);
			driver.get("https://adactinhotelapp.com/");

			driver.findElement(By.id("username")).sendKeys("vishnu19S");
			driver.findElement(By.id("password")).sendKeys("Adactinvishnu@19");

			driver.findElement(By.id("login")).click();

			WebElement locationdd = driver.findElement(By.xpath("//*[@id=\"location\"]"));
			Select ldd = new Select(locationdd);

			ldd.selectByVisibleText("London");
			Thread.sleep(2000);

			WebElement hoteldd = driver.findElement(By.id("hotels"));
			Select hdd = new Select(hoteldd);

			hdd.selectByValue("Hotel Creek");
			Thread.sleep(2000);

			WebElement roomtypedd = driver.findElement(By.id("room_type"));
			Select rdd = new Select(roomtypedd);

			rdd.selectByValue("Deluxe");
			Thread.sleep(2000);

			WebElement noofdd = driver.findElement(By.id("room_nos"));
			Select ndd = new Select(noofdd);

			ndd.selectByValue("3");
			Thread.sleep(2000);

			WebElement datein = driver.findElement(By.id("datepick_in"));
			datein.clear();
			datein.sendKeys("06/07/2023");

			WebElement dateout = driver.findElement(By.id("datepick_out"));
			dateout.clear();
			dateout.sendKeys("09/07/2023");

			WebElement adult = driver.findElement(By.id("adult_room"));
			Select add = new Select(adult);
			add.selectByValue("4");

			WebElement child = driver.findElement(By.id("child_room"));
			Select cdv = new Select(child);
			cdv.selectByIndex(2);

			driver.findElement(By.id("Submit")).click();

			//driver.manage().window().maximize();

			driver.findElement(By.id("radiobutton_0")).click();

			driver.findElement(By.id("continue")).click();

			driver.findElement(By.id("first_name")).sendKeys("VISHNU");

			driver.findElement(By.id("last_name")).sendKeys("SESHADRI");

			driver.findElement(By.id("address")).sendKeys("chennai");

			driver.findElement(By.id("cc_num")).sendKeys("123456789123");

			WebElement cctype = driver.findElement(By.id("cc_type"));
			Select cct = new Select(cctype);
			cct.selectByVisibleText("VISA");

			WebElement expiry = driver.findElement(By.id("cc_exp_month"));
			Select expdate = new Select(expiry);
			expdate.selectByVisibleText("December");

			WebElement expyear = driver.findElement(By.id("cc_exp_year"));
			Select expy = new Select(expyear);
			expy.selectByVisibleText("2026");
			
			driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("123");
			driver.findElement(By.id("book_now")).click();
			
			
			
			
			
		}

	}

}
