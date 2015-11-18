package com.example.thunderbird.test;

import android.test.ActivityInstrumentationTestCase2;

import com.example.thunderbird.MainActivity;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@CucumberOptions(features = "features")
public class MainActivitySteps extends ActivityInstrumentationTestCase2
	<MainActivity> {

		public MainActivitySteps(){
			super(MainActivity.class);
		}

		@Given("^I am on the main activity$")
		public void I_am_on_the_main_activity() {
			assertEquals(1, 1);
			assertNotNull(getActivity());
		}

//		@When("^I tap the continue button$")
//		public void something_happens(final char op) {
//
//		}
//
//		@Then("^I should see the congratulations view$")
//		public void I_should_see_xx_on_the_display(final String s) {
//		}
}
