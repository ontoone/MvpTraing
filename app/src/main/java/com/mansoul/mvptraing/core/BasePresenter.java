package com.mansoul.mvptraing.core;

import com.mansoul.mvptraing.core.mvp.MvpPresenter;
import com.mansoul.mvptraing.core.mvp.MvpView;

import rx.subscriptions.CompositeSubscription;

/**
 * Created by Mansoul on 16/9/9.
 */
public class BasePresenter<T extends MvpView> implements MvpPresenter<T> {

    protected T mMvpView;
    protected CompositeSubscription mCompositeSubscription;

    @Override
    public void attachView(T view) {
        mMvpView = view;
        mCompositeSubscription = new CompositeSubscription();
    }

    @Override
    public void detachView() {
        mMvpView = null;
        unsubscribe();
    }

    private void unsubscribe() {
        if (mCompositeSubscription != null && mCompositeSubscription.hasSubscriptions()) {
            mCompositeSubscription.unsubscribe();
            mCompositeSubscription = null;
        }
    }

//    protected void addSubscription(Observable observable, Subscriber subscriber) {
//        mCompositeSubscription.add(
//                observable
//                        .subscribeOn(Schedulers.io())
//                        .observeOn(AndroidSchedulers.mainThread())
//                        .subscribe(subscriber));
//    }
}
