package com.example.jcels.dictionary;

import android.app.Activity;
import android.app.Application;

import com.example.jcels.dictionary.presentation.di.component.DaggerApplicationComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by jcels on 22/01/2018.
 */

public class DictionaryApplication extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();

        DaggerApplicationComponent.builder()
                //The passers are created in the ApplicationComponent abstract class
                .contextPasser(this)
                .applicationPasser()
                .inject(this);

    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
