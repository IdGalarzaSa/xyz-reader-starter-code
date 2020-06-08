package com.example.xyzreader.remote;

import android.util.Log;

import com.example.xyzreader.R;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;
    private static String TAG = Config.class.toString();


    static {
        URL url = null;
        String error_message = "Please check your internet connection.";
        try {
            url = new URL("https://nodejs-notifications.firebaseio.com/data.json");
        } catch (MalformedURLException ignored) {
            Log.e(TAG, error_message);
        }

        BASE_URL = url;
    }
}
