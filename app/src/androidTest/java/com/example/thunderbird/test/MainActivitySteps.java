package com.example.thunderbird.test;


import android.test.ActivityInstrumentationTestCase2;

import com.example.thunderbird.MainActivity;
import com.example.thunderbird.R;


import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@CucumberOptions(format = { "pretty" }, features = "features")
public class MainActivitySteps extends ActivityInstrumentationTestCase2
	<MainActivity> {

		public MainActivitySteps(){
			super(MainActivity.class);
		}

		@Given("^I am on the main activity$")
		public void I_am_on_the_main_activity() {
			assertEquals(getActivity().getClass(), MainActivity.class);
			onView(withId(R.id.helloWorld)).check(matches(withText("Hello World!")));
		}

		@When("^I tap the continue button$")
		public void I_tap_the_continue_button() {
			onView(withId(R.id.continueButton)).perform(click());
		}

		@Then("^I should see \"(.+)\"$")
		public void I_should_see_xx_on_the_display(final String viewName) {
			onView(withText(viewName)).check(matches(isDisplayed()));
		}
}
