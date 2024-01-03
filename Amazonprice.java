package Section1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonprice {
	public static void main(String[] args) throws Throwable {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("one plus mobile");
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    String str=driver.findElement(By.cssSelector("span[class='a-size-medium a-color-base a-text-normal']")).getText();
        System.out.println(str);
        String st =driver.findElement(By.xpath("//span[contains(text(),'OnePlus Nord 3 5G (Misty Green, 8GB RAM, 128GB Storage)')]//..//../../following-sibling::div/div/div/div/div/a/span/span//span[2]")).getText();
    	System.out.println(st);
	}
}
