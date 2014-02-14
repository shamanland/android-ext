package android.ext.example;

import android.ext.app.ApplicationExt;

public class ExampleApplication extends ApplicationExt {
    @Override
    public void onCreate() {
        super.onCreate();

        putSingleton(ExampleSingleton.class, new ExampleSingleton(this, R.string.app_name));
    }
}