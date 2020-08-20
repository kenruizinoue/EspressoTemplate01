package com.kenruizinoue.espressotemplate01

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class InstrumentedTest {

    @get: Rule
    var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun buttonFunctionality() {
        // press the button
        onView(withId(R.id.button)) // find the view by ID
            .perform(click())

        // asserts if the textView is displayed after the click
        onView(withText("Hello World!")) // find the view by text
            .check(matches(isDisplayed()))
    }
}