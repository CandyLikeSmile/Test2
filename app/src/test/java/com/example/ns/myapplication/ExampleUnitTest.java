package com.example.ns.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void test2()throws Exception{
        assertEquals(6,2+4);
    }
    //~/Library/Android/sdk/tools/emulator
    //~/Library/Android/sdk/tools/bin/avdmanager
    //~/Library/Android/sdk/platform-tools/adb
}


//
// ~/Library/Android/sdk/tools/bin/avdmanager create avd -n test --package 'system-images;android-23;google_apis;x86_64' --tag 'google_apis'
//
//~/Library/Android/sdk/tools/emulator -avd test -no-skin -no-audio -no-window -system /Users/ns/Library/Android/sdk/system-images/android-22/google_apis/x86_64/system.img
//./gradlew build
//adb install -r app/build/outputs/apk/app-debug.apk
<<<<<<< HEAD
//adb install -r AndroidStudioProjects/MyApplication/app/build/outputs/apk/app-debug.apk
=======
>>>>>>> origin/master

//adb shell am start -n com.example.ns.myapplication/com.example.ns.myapplication.MainActivity

//adb shell pm list instrumentation 列举所有instrument

//adb shell am instrument -e class com.example.ns.myapplication.MainActivityInstrumentationTest -w com.example.ns.myapplication.test/android.support.test.runner.AndroidJUnitRunner

<<<<<<< HEAD

///home/flow/jobs/58d35708ef2cb04cb93702de/build/KaneHui/Test/app/build/outputs/apk/app-debug.apk
/*
KaneHui/Test
//-e class com.example.ns.myapplication.MainActivityInstrumentationTest
#3 master
llllll  Manual build
-
3 minutes ago
-
3s
Custom Script
1s
step start

total 20
drwxr-xr-x 13 root root 1024 Mar 21 09:37 .
drwxr-xr-x  3 root root 1024 Oct 10 05:14 ..
drwxr-xr-x 26 root root 1024 Mar 21 11:12 add-ons
drwxr-xr-x 31 root root 1024 Mar 21 09:37 build-tools
drwxr-xr-x 21 root root 3072 Mar 21 09:39 docs
drwxr-xr-x  4 root root 1024 Oct 10 05:27 extras
-rw-r--r--  1 root root   16 Mar 21 08:51 .knownPackages
drwxr-xr-x  2 root root 1024 Nov  1 08:15 licenses
drwxr-xr-x 27 root root 1024 Mar 21 09:55 platforms
drwxr-xr-x  5 root root 1024 Mar 21 09:34 platform-tools
-rw-r--r--  1 root root 1158 Oct 10 05:14 SDK Readme.txt
drwxr-xr-x 14 root root 1024 Mar 21 11:25 sources
drwxr-xr-x 16 root root 1024 Nov 14 10:14 system-images
drwxr-xr-x 29 root root 3072 Mar 21 11:29 temp
drwxr-xr-x 12 root root 1024 Mar 21 09:34 tools
Done. Your build exited with 0.
step done.


 */
/*
cd /usr/sdk/android-sdk-linux/tools

echo no | android create avd -n test -t 22 --abi default/armeabi-v7a

emulator -avd test -no-audio -no-window -system /usr/sdk/android-sdk-linux/system-images/android-23/default/armeabi-v7a/system.img &

adb wait-for-device
sleep 100
array=$(find $FLOW_CURRENT_PROJECT_PATH -name *-debug.apk 2>&1)
for file in ${array[@]}
do
 echo "=== install APK: "
 adb install -r $file
 sleep 20
 adb shell am instrument -w -r   -e debug false -e class com.example.ns.myapplication.MainActivityInstrumentationTest com.example.ns.myapplication.test/android.support.test.runner.AndroidJUnitRunner
done
 */
//
/*
cd /usr/sdk/android-sdk-linux/tools
echo no | android create avd -n test -t 22 --abi default/armeabi-v7a
emulator -avd test -no-audio -no-window -system /usr/sdk/android-sdk-linux/system-images/android-23/default/armeabi-v7a/system.img &
adb wait-for-device
sleep 120
array=$(find $FLOW_CURRENT_PROJECT_PATH -name *-unaligned.apk 2>&1)
for file in ${array[@]}
do
 echo "=== install APK: "
 adb install -r $file
done
 #adb shell pm list instrumentation
 adb shell am instrument -w com.example.ns.myapplication.test/android.support.test.runner.AndroidJUnitRunner
 */
=======
>>>>>>> origin/master
