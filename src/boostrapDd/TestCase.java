package boostrapDd;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TestCase {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		{
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");

			driver = new ChromeDriver(co);
			driver.get("https://adactinhotelapp.com/");

		}
	
		
		//driver.manage().window().maximize();

		/*WebElement usernametxt = driver.findElement(By.id("username"));

		// usernametxt.sendKeys("vishnu19S"); // WebElement passtxt =

		driver.findElement(By.id("password")); // passtxt.sendKeys("Adactinvishnu@19");

		// Using CSS SELECTOR(TAG & ID)

		driver.findElement(By.cssSelector("input#username")).sendKeys("vishnu19S");

		// Using CSS SELECTOR(TAG & CLASS)

		driver.findElement(By.cssSelector("input.login_input")).sendKeys("vishnu19S");

		// Using CSS SELECTOR(TAG & ATTRIBUTE)

		driver.findElement(By.cssSelector("input[name=username]")).sendKeys("vishnu19S");

		// Using CSS SELECTOR(TAG,CLASS,ATTRIBUTE)

		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("vishnu");
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("vishnu");

		driver.findElement(By.name("login")).click();*/

		driver.findElement(By.id("username")).sendKeys("vishnu19S");
		driver.findElement(By.id("password")).sendKeys("Adactinvishnu@19");

		driver.findElement(By.id("login")).click();
		
		//driver.findElement(By.linkText("Booked Itinerary")).click();
		
		driver.findElement(By.partialLinkText("Itinerary")).click();
		
		driver.findElement(By.id("search_hotel")).click();

		WebElement locationdd = driver.findElement(By.xpath("//*[@id=\"location\"]"));
		Select ldd =new Select(locationdd);
		
		//Select by Visible text
		ldd.selectByVisibleText("London");
		Thread.sleep(4000);
		
		/*ddo.selectByIndex(6);
		Thread.sleep(4000);
		
		ddo.selectByValue("Adelaide");
		Thread.sleep(4000);
*/		
		WebElement hoteldd = driver.findElement(By.id("hotels"));
		Select hdd =new Select(hoteldd);
		
		hdd.selectByValue("Hotel Creek");
		Thread.sleep(3000);
		
		WebElement roomtypedd = driver.findElement(By.id("room_type"));
		Select rdd =new Select(roomtypedd);
		
		rdd.selectByValue("Deluxe");
		Thread.sleep(3000);
		
		WebElement noofdd = driver.findElement(By.id("room_nos"));
		Select ndd =new Select(noofdd);
		
		ndd.selectByValue("3");
		Thread.sleep(3000);
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select add= new Select(adult);
		add.selectByValue("4");
		
		WebElement child =driver.findElement(By.id("child_room"));
		Select cdv =new Select(child);
		cdv.selectByIndex(2);
		
		driver.findElement(By.id("Submit")).click();
	
		
	
		
		
	}
}
