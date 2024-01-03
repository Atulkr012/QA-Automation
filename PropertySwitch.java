package Section3;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertySwitch {
public static void main(String[] args) throws Throwable {
	FileInputStream fis= new FileInputStream("D:\\Selenium\\src\\Section3\\ACTIDATA.PROPERTIES");
    Properties pobj = new Properties();
    pobj.load(fis);
    String urldata = pobj.getProperty("url");
    System.out.println(urldata);
    String undata = pobj.getProperty("un");
    System.out.println(undata);
    String pwdata = pobj.getProperty("pw");
    System.out.println(pwdata);
    
}
}
//amazon
//amazonmusic
