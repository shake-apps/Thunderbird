package com.example.thunderbird.test;

import android.test.ActivityInstrumentationTestCase2;

import com.example.thunderbird.MainActivity;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by nrobin01 on 11/18/15.
 */
public class MainActivitySteps extends ActivityInstrumentationTestCase2
	<MainActivity> {

		public MainActivitySteps(){
			super(MainActivity.class);
			assertNotNull(getActivity());
		}

		@Given("^I am on the main activity$")
		public void I_have_my_app_configured() {
		}

		@When("^I tap the continue button$")
		public void something_happens(final char op) {

		}

		@Then("^I should see the congratulations view$")
		public void I_should_see_xx_on_the_display(final String s) {
		}
}
