package priority;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	@Test
	public void twelve(){
		System.out.println("I am inside One"); 
	}
	
	@Test(priority=1)
	public void two(){
		System.out.println("I am inside Two");
	}
	
	@Test(priority=1)
	public void three(){
		System.out.println("I am inside Three");
	}
}
