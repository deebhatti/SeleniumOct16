package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinksWorking {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		
		WebElement table = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
		
		List<WebElement> links = table.findElements(By.tagName("a"));

		System.out.println("Number of Links = " + links.size());
		String[] linkTexts = new String[links.size()];
		int i = 0;

		// extracting the text of the links
		for (WebElement e : links) {
			linkTexts[i] = e.getText();
			i++;
		}

		// test each link
		for (String t : linkTexts) {
			driver.findElement(By.linkText(t)).click();
			if (driver.getTitle().equals("Under Construction: Mercury Tours")) {
				System.out.println(t + " is not working");
			}

			else {
				System.out.println(t + " is working");
			}
			
			driver.navigate().back();
		}

		driver.quit();
	}
}
