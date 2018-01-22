package com.example.jcels.dictionary.presentation.base;

import com.example.jcels.dictionary.domain.view.base.BaseService;
import com.example.jcels.dictionary.domain.view.base.BaseView;

/**
 * Created by jcels on 22/01/2018.
 */

public class BasePresenter<V extends BaseView> implements BaseService.BasePresenter<V> {

    private V view;


    @Override
    public void attachView(V view) {
        this.view = view;
    }

    @Override
    public void onDestroyView() {

    }
}
