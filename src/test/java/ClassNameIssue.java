import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassNameIssue {
	static WebDriver driver;
	
	
	@BeforeClass
	public static void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void ClassNameTest() {
		
		
		driver.get("https://demoqa.com/text-box");
		WebElement pageTitle = driver.findElement(By.cssSelector("div[class='pattern-backgound playgound-header']"));
//		WebElement pageTitle = driver.findElement(By.className("main-header"));
		System.out.println(pageTitle.getText());
		
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}
