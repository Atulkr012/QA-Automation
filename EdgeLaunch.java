package Section1;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

import io.netty.util.internal.SystemPropertyUtil;

public class EdgeLaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "D:\\Selenium\\server\\msedgedriver.exe");
	EdgeDriver driver = new EdgeDriver();
}
}
