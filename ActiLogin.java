package Section3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiLogin {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	FileInputStream fis= new FileInputStream("D:\\Selenium\\src\\Section3\\ACTIDATA.PROPERTIES");
    Properties pobj = new Properties();
    pobj.load(fis);
    String urldata = pobj.getProperty("url");
    driver.get(urldata);
    String undata = pobj.getProperty("un");
    driver.findElement(By.id("username")).sendKeys(undata);
    String pwdata = pobj.getProperty("pw");
    driver.findElement(By.name("pwd")).sendKeys(pwdata,Keys.ENTER);
    
    
}
}
