package firstScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aparn\\OneDrive\\2.MCA\\TYMCA\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		String expextedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		if(actualTitle.contentEquals(expextedTitle))
		{
			System.out.println("Test Passed!");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		System.exit(0);
		// TODO Auto-generated method stub

	}

}
