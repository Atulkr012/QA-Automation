package ZSelenium2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadSendKeys {
public static void main(String[] args) throws Throwable {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/fileUpload?sublist=0");
	Thread.sleep(3000);
	driver.findElement(By.id("fileInput")).sendKeys("D:\\Downloads\\A.Resume.pdf");
}
}
