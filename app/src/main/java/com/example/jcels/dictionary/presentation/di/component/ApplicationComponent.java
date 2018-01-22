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
 * Created by jcels on 22/01/2018.
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
