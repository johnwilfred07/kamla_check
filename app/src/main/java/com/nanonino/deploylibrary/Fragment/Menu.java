package com.nanonino.deploylibrary.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nanonino.deploylibrary.MenuCardTabAdap;
import com.nanonino.deploylibrary.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nnandroid04user on 17/5/18.
 */

public class Menu extends Fragment {


    View objView;
    TabLayout objTabLayout;
    ViewPager objViewPager;
    MenuCardTabAdap objMenuCardAdap;
    List<Fragment> ary_FragmentList;
    List<String> title;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        objView=inflater.inflate(R.layout.layout_menu, container, false);
        declare();
        return objView;
    }

    private void declare() {
        ary_FragmentList=new ArrayList<>();
        title=new ArrayList<>();
        ary_FragmentList.add(new Sub_Frag_name());
        ary_FragmentList.add(new Sub_Frag_type());
        title.add("NAME");
        title.add("TYPE");
        objViewPager=objView.findViewById(R.id.Id_card_menu_viewpager);
        objTabLayout=objView.findViewById(R.id.Id_card_menu_tablayout);
        objMenuCardAdap=new MenuCardTabAdap(getChildFragmentManager(),ary_FragmentList,title);
        objViewPager.setAdapter(objMenuCardAdap);
        objTabLayout.setupWithViewPager(objViewPager);
    }
}
