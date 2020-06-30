package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import page.page;



public class Reusable extends page {
	public static Properties prop;
	public static WebDriver driver;
	
	
	public  void init() throws IOException 
	{
	
    FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties");
	prop = new Properties();
    prop.load(file);
    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(prop.getProperty("URL"));
	 
}
public static void Screen(String name) throws IOException {
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src,new File(System.getProperty("user.dir")+"\\scrennshots\\"+name+".png"));
}
}
