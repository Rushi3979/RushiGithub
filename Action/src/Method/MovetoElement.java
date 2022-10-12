package Method;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElement {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome Driver\\chromedriver.exe");
		
		WebDriver wd=new ChromeDriver();
		
		wd.get("http://mrbool.com/");
		
		wd.manage().window().maximize();
		
		wd.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
		Actions an=new Actions(wd);
		an.moveToElement(wd.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/a"))).build().perform();
		
		wd.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/ul/li[2]/a")).click();
		
		
		
		
		
	}
}
