package TaggedHooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TaggedHooks {

	@Before  
	public void beforeScenario() {
		System.out.println("This will run before every scenario");
	}
	@After	
	public void afterScenario() {
		System.out.println("This will run after every scenario");
	}
	
	 
	
	@Before("@First,@Second")   //we can also use @before for first and second as well as single arguments
	public void beforeFirstAndSecond() {
		System.out.println("This will run before of first and second scenario");
	}
//	@Before("@Second")
//	public void beforeSecond() {
//		System.out.println("This will run before of second scenario");
//	}
	
	
	@Before("@Third")
	public void beforeThird() {
		System.out.println("This will run before of third scenario");
	}
	@After("@First,@Second")
	public void afterFirstAndSecond() {
		System.out.println("This will run after of first and second scenario");
	}
	
//	@After("@Second")
//	public void afterSecond() {
//		System.out.println("This will run after of second scenario");
//	}
	
	@After("@Third")
	public void afterThird() {
		System.out.println("This will run after of third scenario");
	}

}
