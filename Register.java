package Section1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class Register {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/selenium/newtours/register.php");
		driver.findElement(By.name("firstName")).sendKeys("Atul");
		driver.findElement(By.name("lastName")).sendKeys("Kumar");
		driver.findElement(By.name("phone")).sendKeys("7903009127");
		driver.findElement(By.id("userName")).sendKeys("atulkr444444@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Ameerpet hyderabad");
		driver.findElement(By.name("city")).sendKeys("hyderabad");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("500016");
		driver.findElement(By.name("email")).sendKeys("atulkr12");
		driver.findElement(By.name("password")).sendKeys("Atulkr12");
		driver.findElement(By.name("confirmPassword")).sendKeys("Atulkr12");
		driver.findElement(By.name("submit")).click();

	}
}