package com.mansoul.mvptraing.model.imp;

import com.mansoul.mvptraing.App.Constant;
import com.mansoul.mvptraing.bean.GankGirl;
import com.mansoul.mvptraing.http.NetService;
import com.mansoul.mvptraing.http.HttpManager;
import com.mansoul.mvptraing.model.IGankGirl;

import retrofit2.Retrofit;
import rx.Observable;

/**
 * Created by Mansoul on 16/9/9.
 */
public class GankGirlImp implements IGankGirl {
    @Override
    public Observable<GankGirl> getGankGirl(int count, int page) {
        Retrofit retrofit = HttpManager.getInstance().getRetrofit(Constant.GANKGIRL_BASE_URL);
        NetService service = retrofit.create(NetService.class);

        return service.getGankGirl(count, page);
    }
}
