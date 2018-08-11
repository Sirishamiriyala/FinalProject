package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Pair;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

/**
 * Created by sirisha on 22-06-2018.
 */

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TestForAsyncTask {

        @Rule
        public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

        @Test
        public void backgroundTesting() {
            MyAsyncTask ob= (MyAsyncTask) new MyAsyncTask().execute(new Pair<Context,String>(InstrumentationRegistry.getTargetContext(),"ded4r"));
            try {
                Assert.assertTrue(ob.get().length()>0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

    }

