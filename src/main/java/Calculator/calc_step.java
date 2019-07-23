package Calculator;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class calc_step 
{
	@Given("enter {int}")
	public void enter_num1(int num1)
	{
		System.out.println(num1+" entered in the calculator");
	}
	@Then("press {word}")
	public void symbol(String sym)
	{
		System.out.println(sym+" entered in the calculator");
	}
	@And("the result should be {int}")
	public void result(int res)
	{
		System.out.println(res+" is the result");
	}
}
