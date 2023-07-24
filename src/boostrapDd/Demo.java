package boostrapDd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(co);
		
		
	driver.get("https://www.google.com/");
	
	driver.findElement(By.id("APjFqb")).sendKeys("vishnu");
	}

}
