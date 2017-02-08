package selenium_basics;

	import org.openqa.selenium.By;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;
	 
	public class Test_Verify_Error_Msg {
	    
	    
	@Test
	public void TestError()
	{
	  
	// Open browser             
	FirefoxDriver driver=new FirefoxDriver();
	        
	// maximize browser
	driver.manage().window().maximize();
	        
	// Open URL
	driver.get("http://www.gmail.com/");
	        
	// Click on next button
	driver.findElement(By.xpath(".//*[@id='next']")).click();
	
	// This will capture error message
	String actual_msg=driver.findElement(By.xpath(".//*[@id='errormsg_0_Email']")).getText();
	    
	// Store message in variable
	String expect="Please enter your email.";
	                
	// Here Assert is a class and assertEquals is a method which will compare two values if// both matches it will run fine but in case if does not match then if will throw an 
	//exception and fail testcases
	 Assert.assertEquals(actual_msg, expect);

}
	}