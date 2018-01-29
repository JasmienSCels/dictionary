package com.example.jcels.dictionary.presentation.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.jcels.dictionary.domain.view.base.BaseView;

import dagger.android.AndroidInjection;

/**
 * Created by Jasmien Cels on 22/01/2018.
 *
 * The purpose of this class is to have all activities extend this activity. Basic common methods required by all activities are
 * logically represented here.
 */

public class BaseActivity extends AppCompatActivity implements BaseView {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);

    }

}
