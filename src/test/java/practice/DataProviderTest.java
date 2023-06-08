package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@Test(dataProvider = "givenData",groups="RegressionTest")
	public void bookTicket(String src,String dest)
	{
		System.out.println("Book ticket from "+src+" to "+dest);
	}
	
	@DataProvider
	public Object [][] givenData()
	{
		Object [][] obj=new Object[3][2];
		
		obj[0][0]="Kolkata";
		obj[0][1]="Surat";
		
		obj[1][0]="Kolkata";
		obj[1][1]="Delhi";
		
		obj[2][0]="Kolkata";
		obj[2][1]="Dhaka";
		return obj;
	}
	

}
