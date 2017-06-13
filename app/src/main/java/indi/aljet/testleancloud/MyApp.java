package indi.aljet.testleancloud;

import android.app.Application;

import com.avos.avoscloud.AVAnalytics;
import com.avos.avoscloud.AVOSCloud;

/**
 * Created by LJL-lenovo on 2017/6/13.
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AVOSCloud.initialize(this,BuildConfig.AppID,
                BuildConfig.AppKey);

        AVAnalytics.enableCrashReport(this.getApplicationContext()
        ,true);
        AVOSCloud.setLastModifyEnabled(true);
        AVOSCloud.setDebugLogEnabled(true);
    }
}
