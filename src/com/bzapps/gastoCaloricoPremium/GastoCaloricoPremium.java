package com.bzapps.gastoCaloricoPremium;

import android.os.Bundle;
import org.apache.cordova.*;

public class GastoCaloricoPremium extends DroidGap
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // Set by <content src="index.html" /> in config.xml
        super.loadUrl(Config.getStartUrl());
        //super.loadUrl("file:///android_asset/www/index.html")
    }
}

