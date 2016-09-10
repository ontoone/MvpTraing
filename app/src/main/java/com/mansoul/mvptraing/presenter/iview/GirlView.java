package com.mansoul.mvptraing.presenter.iview;

import com.mansoul.mvptraing.bean.GankGirl;
import com.mansoul.mvptraing.core.mvp.MvpView;

/**
 * Created by Mansoul on 16/9/9.
 */
public interface GirlView extends MvpView {
    void showProgress();

    void hideProgress();

    void onSuccess(GankGirl gankGirl);
}
