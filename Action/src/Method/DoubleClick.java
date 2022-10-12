package Method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
	

		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome Driver\\chromedriver.exe");
				
				WebDriver wd=new ChromeDriver();
				
				wd.get("https://demo.guru99.com/test/simple_context_menu.html");
				
				wd.manage().window().maximize();
				
				wd.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				
				Actions act=new Actions(wd);
				
				act.doubleClick(wd.findElement(By.xpath("//*[@id=\"authentication\"]/button"))).build().perform();
				
				
				
				
				
				
				
	}

}
