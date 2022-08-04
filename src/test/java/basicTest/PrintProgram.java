package basicTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintProgram {

	@Test
	public void print() {
		System.out.println("Hello World");
	}
	
	@Test
	public void selbrowlaunch() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.google.com");
		driver.quit();
		//hello world
	}
		


}