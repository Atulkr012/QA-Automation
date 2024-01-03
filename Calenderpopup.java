package Section2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenderpopup {
public static void main(String[] args) {
	Calendar ca= Calendar.getInstance();
	ca.add(Calendar.DAY_OF_YEAR, 3);
	Date da = ca.getTime();
	System.out.println(da);
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	String formatedDate = sdf.format(da);
	System.out.println(formatedDate);
	WebDriver driver= new ChromeDriver();
	driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
	driver.findElement(By.id("datepicker")).sendKeys(formatedDate,Keys.ENTER);
	}
}
