package com.example.jcels.dictionary.presentation.base;

import com.example.jcels.dictionary.domain.view.base.BaseService;
import com.example.jcels.dictionary.domain.view.base.BaseView;

/**
 * Created by Jasmien Cels on 22/01/2018.
 *
 * The purpose of this class is to provide a weak reference to the views attached to the presenter, with the aim of avoiding memory leaks.
 * It is important to check that the view is attached to the presenter before invoking any methods in the view.
 *
 * The benefits of providing a base presenter class is that it extracts all the common presenter methods into the parent class of the presenters.
 *
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
