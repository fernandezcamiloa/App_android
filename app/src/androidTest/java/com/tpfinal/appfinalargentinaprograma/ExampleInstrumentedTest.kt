package com.tpfinal.appfinalargentinaprograma

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.tpfinal.appfinalargentinaprograma.view.MainActivity

@RunWith(AndroidJUnit4::class)


class MainActivityInstrumentedTest {

    @Test
    fun testCompararTextosUI_iguales() {
        val scenario = ActivityScenario.launch(MainActivity::class.java)

        Espresso.onView(withId(R.id.editText1)).perform(typeText("Hola"), closeSoftKeyboard())
        Espresso.onView(withId(R.id.editText2)).perform(typeText("Hola"), closeSoftKeyboard())
        Espresso.onView(withId(R.id.buttonCompare)).perform(click())

        Espresso.onView(withId(R.id.textViewResult)).check(matches(withText("Los textos son iguales")))

        scenario.close()
    }

    @Test
    fun testCompararTextosUI_diferentes() {
        val scenario = ActivityScenario.launch(MainActivity::class.java)

        Espresso.onView(withId(R.id.editText1)).perform(typeText("Hola"), closeSoftKeyboard())
        Espresso.onView(withId(R.id.editText2)).perform(typeText("Mundo"), closeSoftKeyboard())
        Espresso.onView(withId(R.id.buttonCompare)).perform(click())

        Espresso.onView(withId(R.id.textViewResult)).check(matches(withText("Los textos son diferentes")))

        scenario.close()
    }
}
