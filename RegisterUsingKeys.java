package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterUsingKeys {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\server\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/selenium/newtours/register.php");
		driver.findElement(By.name("firstName")).
		sendKeys("Atul",Keys.TAB,"Nayak",Keys.TAB,"7903009127",Keys.TAB,"atulkr4444@gmail.com",Keys.TAB,
	    "Ammerpet",Keys.TAB,"Hyderabad",Keys.TAB,"Telangana",Keys.TAB,"500016",Keys.TAB,Keys.DOWN,Keys.DOWN,
	    Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.TAB,"Atulkr12",Keys.TAB,"123456789",Keys.TAB,"123456789",
	    Keys.TAB,Keys.ENTER);
		
}
}
