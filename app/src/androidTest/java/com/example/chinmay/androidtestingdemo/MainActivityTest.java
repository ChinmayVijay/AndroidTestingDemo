package com.example.chinmay.androidtestingdemo;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Chinmay on 3/17/2018.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mainRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void textDisplayed_shouldBeCorrect(){
        onView(withId(R.id.button_simple)).perform(click());
        onView(withId(R.id.text_simple)).check(matches(withText(R.string.espressoText)));
    }

    public void buttonText_shouldChange(){
        onView(withId(R.id.button_simple)).perform(click());
        onView(withId(R.id.button_simple)).check(matches(withText("clicked")));
    }
}