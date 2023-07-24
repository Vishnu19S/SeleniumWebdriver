package boostrapDd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DdTest {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		{
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);
			driver.get("https://www.hdfcbank.com/");
			driver.findElement(By.xpath(
					"//*[@id=\"main\"]/div[2]/div[13]/div[1]/div/div/div[2]/div[1]/div[3]/div/div/div/div/div/div[2]/div/a"))
					.click();
			List<WebElement> ptypes = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));

			System.out.println("No of options :" + ptypes.size());

			for (WebElement protype : ptypes) {
				// System.out.println(protype.getText());

				if (protype.getText().equals("EMI")) {
					Thread.sleep(6000);
					protype.click();
					break;
				}
			}
		}
	}
}