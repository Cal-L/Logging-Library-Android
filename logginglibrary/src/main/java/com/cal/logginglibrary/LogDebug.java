package com.cal.logginglibrary;

import android.util.Log;

/**
 * Created by Cal on 6/20/17.
 */

public class LogDebug {

    private static final String TAG = "LOGGING_APP";

    public static void d(String message) {
        Log.d(TAG, message);
    }
}
