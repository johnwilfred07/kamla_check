package com.nanonino.deploylibrary;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;



public class MenuCardTabAdap extends FragmentPagerAdapter {
    private List<Fragment> ary_Fragments;
    private List<String> ary_content;




    public MenuCardTabAdap(FragmentManager fm,List<Fragment> ary_Fragments,List<String> ary_content) {
        super(fm);
        this.ary_Fragments=ary_Fragments;
        this.ary_content=ary_content;
    }

    @Override
    public Fragment getItem(int position) {
        return ary_Fragments.get(position);
    }

    @Override
    public int getCount() {
        return ary_Fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return ary_content.get(position);
    }
}