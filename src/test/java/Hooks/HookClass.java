package Hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass {
	@Before(order=1)    //@before for before the scenario, it will execute and order of @before starts from 0,1,2.....(ascending)
	public void beforeScenario() {
		System.out.println("user Learn Manual Testing Before to the Automation Testing");
	}
	@After(order=1)		//@after for after the scenario, it will execute and order of @after starts from ...2,1,0 (descending)
	public void afterScenario() {
		System.out.println("user Learn Some Additional Tools");
	}
	
	
	
	@Before(order=0)
	public void beforeToBeforeScenario() {
		System.out.println("user need to know about Software testing");
	}
	@After(order=0)
	public void afterToAfterScenario() {
		System.out.println("With these skills user can get the job easily");
	}

}
