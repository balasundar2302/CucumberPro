package com.adactin.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinitionBackground {
	@Given("^the Student Finished High School$")
	public void the_Student_Finished_High_School() throws Throwable {
		System.out.println("the Student Finished High School");
	}

	@Given("^the Student Finished Higher Secondary$")
	public void the_Student_Finished_Higher_Secondary() throws Throwable {
	System.out.println("the Student Finished Higher Secondary");
	}

	
	
	@Given("^the Student Applied For The Medical Course$")
	public void the_Student_Applied_For_The_Medical_Course() throws Throwable {
	System.out.println("the Student Applied For The Medical Course");
	}

	@When("^the Student Cleared The Entrance Exam$")
	public void the_Student_Cleared_The_Entrance_Exam() throws Throwable {
	System.out.println("the Student Cleared The Entrance Exam");
	}

	@Then("^the Student Is Eligible For Joining Any Medical Institute$")
	public void the_Student_Is_Eligible_For_Joining_Any_Medical_Institute() throws Throwable {
	System.out.println("the Student Is Eligible For Joining Any Medical Institute");
	}

	@Given("^the Student Applied For The Engineering Course$")
	public void the_Student_Applied_For_The_Engineering_Course() throws Throwable {
	System.out.println("the Student Applied For The Engineering Course");
	}

	@When("^the Student Has A Sayable Cut Off$")
	public void the_Student_Has_A_Sayable_Cut_Off() throws Throwable {
	System.out.println("the Student Has A Sayable Cut Off");
	}

	@Then("^the Student Is Eligible For Joining Any Engineering Institute$")
	public void the_Student_Is_Eligible_For_Joining_Any_Engineering_Institute() throws Throwable {
	System.out.println("the Student Is Eligible For Joining Any Engineering Institute");
	}


	
	
	
	
	
	
	
	
	
	

}
