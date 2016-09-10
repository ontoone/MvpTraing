package com.mansoul.mvptraing.core.mvp;

/**
 * Created by Mansoul on 16/9/9.
 */
public interface MvpPresenter<V extends MvpView> {

    void attachView(V view);

    void detachView();
}
