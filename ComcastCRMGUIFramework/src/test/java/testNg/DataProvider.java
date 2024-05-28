package testNg;

import org.testng.annotations.Test;

public class DataProvider {
  
	@Test(dataProvider = "data")
	public void getData(String name,String job)
	{
		System.out.println("Name :"+ name+", Job:" + job);
	}
	@org.testng.annotations.DataProvider
	public Object[][] data()
	{
		Object obj[][]=new Object[2][2];
		obj[0][0]="neha";
		obj[0][1]="qa";
		
		obj[1][0]="zutti";
		obj[1][1]="qa";
		
		return obj;
		
	}
}
