package com.example.testingui

import androidx.test.espresso.Espresso
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.IdlingResource
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.runner.RunWith
import androidx.test.filters.LargeTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test


@RunWith(AndroidJUnit4::class)
@LargeTest
class ChangeTextTest {
    @get:Rule
    var activityScenarioRule = activityScenarioRule<FirstFragment>()

    private var mIdlingResource: IdlingResource? = null

    @Before
    fun registerIdlingResource() {
        activityScenarioRule.scenario.onActivity { activity ->
            mIdlingResource = activity.idlingResource
            // To prove that the test fails, omit this call:
            IdlingRegistry.getInstance().register(mIdlingResource)
        }
    }


    @After
    fun unregisterIdlingResource() {
        if (mIdlingResource != null) {
            IdlingRegistry.getInstance().unregister(mIdlingResource)
        }
    }

}