package com.example.ns.myapplication;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


/**
 * Created by ns on 17/3/22.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class TestMainActivity {
    private String STRING_TO_BE_TYPED="Kane" ;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);
    @Before
    public void initValidString(){
        STRING_TO_BE_TYPED="peter";
    }
    @Test
    public void sayHello(){
        //
        onView(withId(R.id.editText)).perform(typeText(STRING_TO_BE_TYPED), closeSoftKeyboard()); //line 1

        onView(withText("hello")).perform(click()); //line 2

        String expectedText = "Hello, " + STRING_TO_BE_TYPED + "!";
        onView(withId(R.id.textView)).check(matches(withText(expectedText))); //line 3
    }
}
/*
cd /usr/sdk/android-sdk-linux/tools

echo no | android create avd -n test -t 22 --abi default/armeabi-v7a

emulator -avd test -no-audio -no-window -system /usr/sdk/android-sdk-linux/system-images/android-23/default/armeabi-v7a/system.img &

sleep 80
array=$(find $FLOW_CURRENT_PROJECT_PATH -name *-debug.apk 2>&1)
for file in ${array[@]}
do
 echo "=== install APK: "
 adb install -r $file
 sleep 20
 echo "shell dumpsys package com.example.ns.myapplication"
 adb shell dumpsys package com.example.ns.myapplication
 echo "adb shell pm list instrumentation com.example.ns.myapplication"
 adb shell pm list instrumentation com.example.ns.myapplication
 echo " adb shell pm list packages "
 adb shell pm list packages

 adb shell am start -a -n "com.example.ns.myapplication/com.example.ns.myapplication.MainActivity" -a android.intent.action.MAIN -c android.intent.category.LAUNCHER
 sleep 10
 adb shell am instrument -w com.android.emulator.smoketests/android.support.test.runner.AndroidJUnitRunner
done
 */
//-e class com.example.ns.myapplication.MainActivityInstrumentationTest