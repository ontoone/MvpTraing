package com.mansoul.mvptraing.presenter;

import com.mansoul.mvptraing.bean.GankGirl;
import com.mansoul.mvptraing.core.BasePresenter;
import com.mansoul.mvptraing.model.imp.GankGirlImp;
import com.mansoul.mvptraing.presenter.iview.GirlView;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Mansoul on 16/9/9.
 */
public class GirlPresenter extends BasePresenter<GirlView> {

    private GankGirlImp mData;

    public GirlPresenter(GirlView girlView) {
        attachView(girlView);
        mData = new GankGirlImp();
    }

    public void loadData(int count, int page) {
        mMvpView.showProgress();
        mCompositeSubscription.add(
                mData.getGankGirl(count, page)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Subscriber<GankGirl>() {
                            @Override
                            public void onCompleted() {
                                mMvpView.hideProgress();
                            }

                            @Override
                            public void onError(Throwable e) {
                                mMvpView.onFailure(e);
                            }

                            @Override
                            public void onNext(GankGirl gankGirl) {
                                mMvpView.onSuccess(gankGirl);
                            }
                        }));
    }
}
