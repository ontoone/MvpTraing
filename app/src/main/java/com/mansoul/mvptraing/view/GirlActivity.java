package com.mansoul.mvptraing.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.mansoul.mvptraing.R;
import com.mansoul.mvptraing.bean.GankGirl;
import com.mansoul.mvptraing.presenter.GirlPresenter;
import com.mansoul.mvptraing.presenter.iview.GirlView;
import com.mansoul.mvptraing.view.adapter.GirlAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GirlActivity extends AppCompatActivity implements GirlView {

    @BindView(R.id.pb_load)
    ProgressBar mPbLoad;
    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;

    private GirlPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girl);
        ButterKnife.bind(this);

        initView();
        initData();

    }

    private void initView() {
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2,
                StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);
    }

    private void initData() {
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
        GirlAdapter adapter = new GirlAdapter(gankGirl.results,this);
        mRecyclerView.setAdapter(adapter);
    }

    @Override
    public void onFailure(Throwable e) {
        Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }
}
