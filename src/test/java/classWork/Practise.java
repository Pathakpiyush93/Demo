package classWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practise {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		List<WebElement> list = driver.findElements(By.tagName("input"));
		System.out.println(list.size());
		for(WebElement e:list) {
				if(e.isDisplayed()) {
					e.sendKeys("abcd@gmail.com");
				}
		}
//		driver.close();

	}

}
