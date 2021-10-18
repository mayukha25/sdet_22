package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLaptopPrice {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("DELL Inspiron"+Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> laptopname = driver.findElements(By.xpath("//div[contains(text(),'DELL Inspiron')]"));
		List<WebElement> pricelist = driver.findElements(By.xpath("//div[contains(text(),'DELL Inspiron')]/../../div/div/div/div"));
		int count = laptopname.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {

			String price = pricelist.get(i).getText();
			System.out.println(price);
		}
		driver.close();

	}
}
