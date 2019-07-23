package Second_cucumber;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class second_step_definition 
{
		@When("Open the console")
		public void console_open()
		{
			System.out.println("Console opened");
		}
		@Then("print say Hai")
		public void hai()
		{
			System.out.println("Hai");
		}
}
