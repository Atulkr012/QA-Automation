package ZSelenium2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivision {
	public static void main(String[] args) throws Throwable {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/hidden");
		//Thread.sleep(3000);
	//	driver.findElement(By.xpath("//section[text()='Hidden division']")).click();
		driver.findElement(By.xpath("//input[@class='w-full h-10 px-4 m-2 border-2 border-stone-600 rounded-md']")).sendKeys("Nayak");
		driver.findElement(By.xpath("//input[@class='w-full m-2 h-10 px-4 border-2 border-stone-600 rounded-md']")).sendKeys("atulkr444444@gmail.com");
		WebElement ele= driver.findElement(By.xpath("//select[@class='w-[97%] m-2 px-4 h-10 border-2 border-stone-600 rounded-md']"));
		ele.click();
		Select s = new Select(ele);
		s.selectByVisibleText("Laptop");
		driver.findElement(By.xpath("//textarea[@class='w-[97%] m-2 h-16 px-4 py-2 border-2 border-stone-600 rounded-md']")).sendKeys("Hii How are you");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
}
}