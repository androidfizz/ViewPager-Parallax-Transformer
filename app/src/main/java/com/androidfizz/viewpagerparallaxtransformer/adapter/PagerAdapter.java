package com.androidfizz.viewpagerparallaxtransformer.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.androidfizz.viewpagerparallaxtransformer.PagerFragment;

import java.util.ArrayList;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private ArrayList<String> list = new ArrayList<>();

    public PagerAdapter(FragmentManager fm, ArrayList<String> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    @Override
    public Fragment getItem(int position) {
        return PagerFragment.newInstance(list.get(position));
    }

    @Override
    public int getCount() {
        return list.size();
    }
}