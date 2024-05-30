package testNg;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.comcast.crm.generic.fileutility.ExcelUtility;

public class GetProductInfoTest {

//	@Test(dataProvider = "data")
//	public void getProductInfo(String brandName, String productName) {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("https://www.amazon.in/");
//
//		driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"]")).sendKeys(brandName, Keys.ENTER);
//
//		String x = "//span[.='"+productName+"']/../../../../..//div/following-sibling::div[1]/div/div/div/div/div/a/span/span[@class=\"a-offscreen\"]";
//		String price = driver.findElement(By.xpath(x)).getText();
//		System.out.println(price);
//		driver.quit();
//    }
//	@DataProvider 
//	public Object[][] data() throws EncryptedDocumentException, IOException{
//		ExcelUtility eLib= new ExcelUtility();
//		int rowCount = eLib.getRowCount("product");
//		Object obj[][]=new Object[rowCount][2];
//		
//		for(int i=0;i<rowCount;i++)
//		{		
//		obj[0][0]=eLib.getDataFromExcel("product", i+1,0);
//		obj[0][1]=eLib.getDataFromExcel("product", i+1, 0);
//		obj[0][1]=eLib.getDataFromExcel("product", i+1, 1);
//
//		
//	     }
//		return obj;
//}
}
