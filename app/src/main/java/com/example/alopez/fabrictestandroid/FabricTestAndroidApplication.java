package com.example.alopez.fabrictestandroid;

import android.app.Application;
import io.branch.referral.Branch;

/**
 * Created by alopez on 11/3/17.
 */

public class FabricTestAndroidApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Initialize Branch automatic session tracking
        Branch.getAutoInstance(this);
    }
}
