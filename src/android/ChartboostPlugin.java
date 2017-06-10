package com.jernung.plugins.admob.chartboost;

import android.util.Log;

import com.chartboost.sdk.CBLocation;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBLogging.Level;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;

public class AdmobChartboostPlugin extends CordovaPlugin {

    private static final String PLUGIN_NAME = "AdmobChartboostPlugin";

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);

        Chartboost.setLoggingLevel(Level.NONE);
        Chartboost.onStart(cordova.getActivity());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Chartboost.onDestroy(cordova.getActivity());
    }

    @Override
    public void onPause(boolean multitasking) {
        super.onPause(multitasking);
        Chartboost.onPause(cordova.getActivity());
    }

    @Override
    public void onResume(boolean multitasking) {
        super.onResume(multitasking);
        Chartboost.onResume(cordova.getActivity());
    }

    @Override
    public void onStop() {
        super.onStop();
        Chartboost.onStop(cordova.getActivity());
    }

}
