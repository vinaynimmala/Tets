package com.vlabs.qa.stepdefinations;

import com.vlabs.qa.base.Base;

import cucumber.api.java.en.Given;

public class Login extends Base{

	private Base base;
	
	public Login(Base base)
	{
		this.base=base;
	}
	
	@Given("^I want to write a step with preconditions$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("working");
	   driver.get("https://www.google.co.in");
	}

	
}
