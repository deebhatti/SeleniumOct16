package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.barnesandnoble.com/");
		
		WebElement Kids = driver.findElement(By.linkText("Kids"));
		Actions action = new Actions(driver);
		action.moveToElement(Kids).build().perform();
		
		driver.findElement(By.linkText("Warriors by Erin Hunter")).click();
	}
}
