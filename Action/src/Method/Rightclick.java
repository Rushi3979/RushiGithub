package Method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome Driver\\chromedriver.exe");
		
		WebDriver wd=new ChromeDriver();
		
		wd.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		wd.manage().window().maximize();
		
		wd.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		Actions act=new Actions(wd);
		
		act.contextClick(wd.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"))).build().perform();
		
		wd.findElement(By.xpath("/html/body/ul/li[7]")).click();
		
		
		
	}
}
