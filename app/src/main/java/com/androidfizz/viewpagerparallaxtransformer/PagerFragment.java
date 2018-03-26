package com.androidfizz.viewpagerparallaxtransformer;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class PagerFragment extends Fragment {


    private static final String PARAM_IMAGE_URL = "image_url";

    public static PagerFragment newInstance(String url) {
        Bundle bundle = new Bundle();
        bundle.putString(PARAM_IMAGE_URL, url);
        PagerFragment fragment = new PagerFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    public PagerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_pager, container, false);
        ImageView imageView= rootView.findViewById(R.id.imageView);
        Bundle bundle = getArguments();
        if(bundle!=null) {
            String imageUrl = bundle.getString(PARAM_IMAGE_URL);
            if (!TextUtils.isEmpty(imageUrl)) {
                loadImage(imageView, imageUrl);
            }
        }
        return rootView;
    }

    private void loadImage(ImageView imageView, String imageUrl) {
        if (imageView != null) {
            Context context = imageView.getContext();
            if (context != null) {
                Glide.with(context)
                        .load(imageUrl)
                        .into(imageView);
            }
        }
    }
}
