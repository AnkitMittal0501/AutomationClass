package ide;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfList {

	List<WebElement> list;
	@Test
	public void test()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/rope-men-s-solid-casual-black-shirt/p/itmf3x96bdddxhmh?pid=SHTF3TKPBVEDPBJF&lid=LSTSHTF3TKPBVEDPBJFPM3EZM&marketplace=FLIPKART&sattr[]=color&sattr[]=size&st=size");
		driver.manage().window().maximize();
		
		
		list=GetElement.geteleme(driver);
		list.get(2).click();
	}
}
