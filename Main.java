=== FILE: settings.gradle ===
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "TestApp"
include ":app"


=== FILE: build.gradle ===
plugins {
    id 'com.android.application' version '8.7.3' apply false
}


=== FILE: gradle.properties ===
org.gradle.jvmargs=-Xmx2048m -Dfile.encoding=UTF-8
android.useAndroidX=true


=== FILE: app/build.gradle ===
plugins {
    id 'com.android.application'
}

android {
    namespace 'com.test.app'
    compileSdk 35

    defaultConfig {
        applicationId 'com.test.app'
        minSdk 23
        targetSdk 35
        versionCode 1
        versionName '1.0'
    }
}


=== FILE: app/src/main/AndroidManifest.xml ===
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android">

    <application
        android:theme="@style/AppTheme"
        android:label="تطبيق الاختبار">

        <activity
            android:name=".MainActivity"
            android:exported="true">

            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>

        </activity>

    </application>

</manifest>


=== FILE: app/src/main/res/values/styles.xml ===
<?xml version="1.0" encoding="utf-8"?>
<resources>

    <style name="AppTheme"
        parent="android:style/Theme.Material.Light.NoActionBar">

        <item name="android:fontFamily">sans</item>
        <item name="android:colorAccent">#00BCD4</item>

    </style>

</resources>


=== FILE: app/src/main/java/com/test/app/MainActivity.java ===
package com.test.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);

        text.setText("مرحباً 👋\n\nنجح بناء التطبيق!");
        text.setTextSize(26);
        text.setTextColor(Color.WHITE);
        text.setGravity(Gravity.CENTER);

        text.setBackgroundColor(Color.rgb(33, 33, 33));

        setContentView(text);
    }
}