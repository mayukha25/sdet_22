package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HiddenElement {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/tool-tips");
	Thread.sleep(6000);
	WebElement txt=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
	Actions a=new Actions(driver);
    a.moveToElement(txt).perform();
    Thread.sleep(6000);
    WebElement hov = driver.findElement(By.xpath("//div[text()='You hovered over the Button']"));
    String tit = hov.getText();
    driver.findElement(By.xpath("//input[@class=' mr-sm-2 form-control']")).sendKeys(tit);
    Thread.sleep(6000);
    driver.close();
	
	}
}
