package com.example.jcels.dictionary.domain.view.base;

/**
 * Created by jcels on 22/01/2018.
 */

public interface BaseService {

    interface BasePresenter<V extends BaseView> {

        void attachView(V view);

        void onDestroyView();
    }
}
