package ide;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetElement {

	public static List<WebElement> list;
	public static List<WebElement> geteleme(WebDriver driver)
	{
		list= driver.findElements(By.xpath("//div[@class='rPoo01']/div[2]/div/ul/li"));
		System.out.println(list.size());
		
		return list;
		
	}
}
