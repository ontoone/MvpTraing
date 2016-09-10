package com.mansoul.mvptraing.http;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Mansoul on 16/9/10.
 */
public class ImageLoader {
    public static void display(Context context, String url, ImageView target) {
        Glide.with(context).load(url).into(target);
    }
}
