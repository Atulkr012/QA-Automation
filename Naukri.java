package Section2;

import java.io.FileInputStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri {
	public static void main(String[] args) throws Throwable {
		//System.setProperty("webdriver.chrome.driver","D:\\Selenium\\server\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
	//	driver.findElement(By.className("dropArrowDD")).click();
	//	String path="D:\\\\Documents\\\\Book1.xlsx";
	//	FileInputStream fis = new FileInputStream(path);
		/*Workbook book = WorkbookFactory.create(fis);
	    book.createSheet("shaktiman1").createRow(1).createCell(1).setCellValue("java");
	    
	    FileOutputStream fos = new FileOutputStream(path);
	    book.write(fos);
	    fos.flush();*/
		
		WebElement ele =driver.findElement(By.xpath("//div[text()='Jobs']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		List<WebElement> ele1 = driver.findElements(By.xpath("//a[@class='nI-gNb-header1__headerAnchor']/../following-sibling::li"));
		for(WebElement i:ele1)
		{
		String data=i.getText();
		System.out.println(data);
		}
		//driver.findElement(By.xpath("//div[text()='IT jobs']")).click();
		
}
}
