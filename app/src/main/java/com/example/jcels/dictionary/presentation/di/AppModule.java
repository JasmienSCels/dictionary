package com.example.jcels.dictionary.presentation.di;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

/**
 * Created by Jasmien Cels on 22/01/2018.
 *
 * The purpose of this abstract class is to provide the application reference, app-wide.
 */

@Module
public abstract class AppModule {

    @Binds
    public abstract Context bindContext(Application application);

}
