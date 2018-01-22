package com.example.jcels.dictionary.presentation.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.jcels.dictionary.domain.view.base.BaseView;

import dagger.android.AndroidInjection;

/**
 * Created by jcels on 22/01/2018.
 */

public class BaseActivity extends AppCompatActivity implements BaseView {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);

    }

}
