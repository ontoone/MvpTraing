package com.mansoul.mvptraing.http;

import com.mansoul.mvptraing.bean.GankGirl;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Mansoul on 16/9/9.
 */
public interface NetService {
    //http://gank.io/api/data/福利/10/1
    @GET("福利/{count}/{page}")
    Observable<GankGirl> getGankGirl(@Path("count") int count, @Path("page") int page);
}
