package com.example.jcels.dictionary.presentation.di;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

/**
 * Created by jcels on 22/01/2018.
 */

@Module
public abstract class AppModule {

    @Binds
    public abstract Context bindContext(Application application);

}
