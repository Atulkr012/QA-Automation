package ZSelenium2;

import java.awt.datatransfer.StringSelection;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadToolkit {
	public static void main(String[] args) throws Throwable {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/fileUpload/custom?sublist=1");
		driver.findElement(By.xpath("//section[@id='customButton']/div")).click();
		StringSelection copy = new StringSelection("D:\\\\Downloads\\\\A.Resume.pdf");
		driver.findElement(By.xpath("//section[@id='customButton']/div")).click();
		
}
}
