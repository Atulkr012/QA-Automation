package Section1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSamsungprice {
public static void main(String[] args) throws Throwable {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung mobiles");
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(3000);
	String s =driver.findElement(By.xpath("//span[text()=' Galaxy M34 5G (Prism Silver, 8GB, 128GB Storage) | 120Hz sAMOLED Display | 50MP Triple No Shake Cam | 6000 mAh Battery | 16GB RAM with RAM Plus | Android 13 | Without Charger']")).getText();
	System.out.println(s);
	Thread.sleep(3000);
	String price = driver.findElement(By.xpath("//span[contains(text(),'Galaxy M34 5G (Prism Silver, 8GB, 128GB Storage) | 120Hz sAMOLED Display | 50MP Triple No Shake Cam | 6000 mAh Battery | 16GB RAM with RAM Plus | Android 13 | Without Charger')]//..//..//../following-sibling::div/following-sibling::div/div/div/div/div/a/span/span[2]/span[2]")).getText();
	System.out.println(price);
}
}