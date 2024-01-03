package ZSelenium2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Ss {
public static void main(String[] args) throws IOException {
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.google.com/");
	TakesScreenshot sh = (TakesScreenshot)driver;
	File src = sh.getScreenshotAs(OutputType.FILE);
	File dis = new File("D:\\Selenium\\screenshot\\y1.png");
	Files.copy(src, dis);
}
}
