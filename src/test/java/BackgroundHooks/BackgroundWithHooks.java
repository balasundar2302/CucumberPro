package BackgroundHooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BackgroundWithHooks {
@Before
public void beforeScenario() {
System.out.println("This will run before all scenarios");
}
@After
public void afterScenario() {
System.out.println("This will run after all scenarios");
}

}
