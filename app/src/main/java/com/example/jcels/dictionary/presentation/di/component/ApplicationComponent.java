package com.example.jcels.dictionary.presentation.di.component;

import android.app.Application;

import com.example.jcels.dictionary.DictionaryApplication;
import com.example.jcels.dictionary.presentation.di.AppModule;
import com.example.jcels.dictionary.presentation.di.module.ActivityBindingModule;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * The purpose of this interface is to define the connection between the modules and the objects with are intended to be dependencies.
 * Code will be generated to use the modules that will satisfy the dependency injections.
 * This particular Component serves the purpose of injecting the Application class.
 * The AndroidInjectModule is needed to ensure the binding of Android base types.
 *
 * Created by Jasmien Cels on 22/01/2018.
 *
 */

@Component(modules = {AndroidInjectionModule.class, ActivityBindingModule.class, AppModule.class})
public interface ApplicationComponent extends AndroidInjector<DictionaryApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        public Builder contextPasser(Application application);

        public ApplicationComponent applicationPasser();
    }
}
