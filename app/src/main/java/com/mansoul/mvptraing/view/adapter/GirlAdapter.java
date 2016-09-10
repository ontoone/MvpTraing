package com.mansoul.mvptraing.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.mansoul.mvptraing.R;
import com.mansoul.mvptraing.bean.GankGirl;
import com.mansoul.mvptraing.http.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Mansoul on 16/9/10.
 */
public class GirlAdapter extends RecyclerView.Adapter<GirlAdapter.GirlViewHolder> {

    private List<GankGirl.ResultsBean> girl = new ArrayList<>();
    private Context mContext;

    public GirlAdapter(List<GankGirl.ResultsBean> girl, Context context) {
        this.girl = girl;
        this.mContext = context;
    }

    @Override
    public GirlViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.item_girl, parent, false);
        return new GirlViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GirlViewHolder holder, int position) {
        ImageLoader.display(mContext, girl.get(position).url, holder.mImageView);
    }

    @Override
    public int getItemCount() {
        return girl.size();
    }

    class GirlViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.img)
        ImageView mImageView;

        public GirlViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
