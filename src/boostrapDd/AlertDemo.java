package boostrapDd;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertDemo {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("promtButton")).click();
		
		
		Alert clkbtn=driver.switchTo().alert();
		//System.out.println(clkbtn.getText());
		
		clkbtn.sendKeys("Vishnu");	
		clkbtn.accept();
//http://the-internet.herokuapp.com/basic_auth
	}

}
