package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllPhoneNames {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("samsung mobiles"+Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> phonename = driver.findElements(By.xpath("//div[contains(text(),'SAMSUNG')]"));

		int count = phonename.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String text1 = phonename.get(i).getText();
			System.out.println(text1);
		}
		driver.close();

	}

}
