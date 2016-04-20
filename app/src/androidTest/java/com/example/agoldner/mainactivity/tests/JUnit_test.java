package com.example.agoldner.mainactivity.tests;

import android.test.ActivityInstrumentationTestCase2;

import com.example.agoldner.mainactivity.MainActivity;

/**
 * Created by agoldner on 4/19/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;

    public JUnit_test(){
        super(MainActivity.class);
    }

    public void test_sum(){
        mainActivity = getActivity();
    }
}
