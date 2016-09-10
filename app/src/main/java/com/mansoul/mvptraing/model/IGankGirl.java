package com.mansoul.mvptraing.model;

import com.mansoul.mvptraing.bean.GankGirl;

import rx.Observable;

/**
 * Created by Mansoul on 16/9/9.
 */
public interface IGankGirl {

    Observable<GankGirl> getGankGirl(int count, int page);
}
