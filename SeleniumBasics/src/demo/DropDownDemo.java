package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement x = driver.findElement(By.id("day"));
		
		Select date = new Select(x);
		//date.selectByVisibleText("4");
		//date.selectByIndex(16);
		
		date.selectByValue("8");
		
		//driver.close();
		
	}

}
