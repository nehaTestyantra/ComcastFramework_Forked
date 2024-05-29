package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pgm1 {

	@Test
	public void ss() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888");
		System.out.println("link opened");
		driver.findElement(By.name("user_name")).click();
		//Thread.sleep(2000);
		driver.close();	
		
	}
}
