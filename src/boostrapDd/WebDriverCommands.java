package boostrapDd;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverCommands {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		/*driver.navigate().to("http://adactinhotelapp.com/");

		driver.findElement(By.id("username")).sendKeys("vishnu19S");
		driver.findElement(By.id("password")).sendKeys("Testvishnu@19");

		driver.findElement(By.id("login")).click();
		driver.findElement(By.partialLinkText("Itinerary")).click();

		//Conditional Commands:
		
		WebElement orderid = driver.findElement(By.xpath("//input[@id='order_id_text']"));
		System.out.println(orderid.isDisplayed());
		
		System.out.println(orderid.isEnabled());
		
		WebElement chkbox = driver.findElement(By.xpath("//input[@id='check_all']"));
		
		chkbox.click();
		
		System.out.println(chkbox.isSelected());*/
		
		//NAVIGATIONAL COMMANDS
		
		driver.get("https://www.hdfcbank.com/");
		
		Thread.sleep(2000);
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		
		
		
		
		
		
		
		

	}

}
