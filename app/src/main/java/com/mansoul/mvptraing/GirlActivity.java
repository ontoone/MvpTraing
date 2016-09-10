package com.mansoul.mvptraing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.mansoul.mvptraing.bean.GankGirl;
import com.mansoul.mvptraing.presenter.GirlPresenter;
import com.mansoul.mvptraing.presenter.iview.GirlView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GirlActivity extends AppCompatActivity implements GirlView {

    @BindView(R.id.pb_load)
    ProgressBar mPbLoad;
    @BindView(R.id.tv_result)
    TextView mTvResult;

    private GirlPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girl);
        ButterKnife.bind(this);


        mPresenter = new GirlPresenter(this);

        mPresenter.loadData(10, 1);
    }

    @Override
    public void showProgress() {
        mPbLoad.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        mPbLoad.setVisibility(View.GONE);
    }

    @Override
    public void onSuccess(GankGirl gankGirl) {
        System.out.println(gankGirl.error);
        mTvResult.setText("加载成功");
    }

    @Override
    public void onFailure(Throwable e) {
        System.out.println(e.getMessage());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }
}
