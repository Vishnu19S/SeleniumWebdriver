package boostrapDd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonTesting {

	public static WebDriver driver;

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(co);
		driver.get("https://www.amazon.in/");

		driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();

		List<WebElement> all = driver
				.findElements(By.xpath("//select[@aria-describedby='searchDropdownDescription']//option"));
		System.out.println("No of Options :" + all.size());
		
		
		
		for (WebElement allelem : all) {
			
			if (allelem.getText().equals("Music"))
			{
				
				allelem.click();
				
			}
			
			
		}
		
		
		
		
	}

}
