package firefox.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) throws Exception
	{
		System.out.println("HI");
		System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		Thread.sleep(3000);
		driver.quit();
	}

}
