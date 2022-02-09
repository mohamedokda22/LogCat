package com.example.logutils;

import android.util.Log;

public class LogUtilG {
    private final static String TAG="LogM" ;

    public static void loginCat(String s){
        Log.d(TAG,s);
    }
    public static void loginCat(int s){
        Log.d(TAG,String.valueOf(s));
    }
}
