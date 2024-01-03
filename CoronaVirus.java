package Section1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoronaVirus {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.worldometers.info/coronavirus/");
	String name = driver.findElement(By.xpath("//h1[text()='Coronavirus Cases:']")).getText();
	System.out.println(name);
	String cases = driver.findElement(By.xpath("//h1[text()='Coronavirus Cases:']//../div/span")).getText();
	System.out.println(cases);
	//692,127,508
}
}
