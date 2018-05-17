package com.nanonino.deploylibrary.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nanonino.deploylibrary.Adap_name;
import com.nanonino.deploylibrary.DetailPage;
import com.nanonino.deploylibrary.Inter_adap;
import com.nanonino.deploylibrary.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nnandroid04user on 17/5/18.
 */

public class Sub_Frag_type extends Fragment implements Inter_adap {
    private View objView;
    List<String> ary_type;
    Adap_name objAdap_name;
    RecyclerView objRecylerView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        objView=inflater.inflate(R.layout.layout_sub_frag_type, container, false);
        addValues();
        declare();
        return objView;
    }

    private void addValues() {
        ary_type=new ArrayList<>();
        for (int i=0;i<30;i++){
            ary_type.add("apocalypto GOBI :"+i);
        }
    }

    private void declare() {
        objRecylerView=objView.findViewById(R.id.Id_recyler_type);
        LinearLayoutManager objManager=new LinearLayoutManager(getActivity());
        objRecylerView.setLayoutManager(objManager);
        objAdap_name=new Adap_name(ary_type,this);
        objRecylerView.setAdapter(objAdap_name);
    }

    @Override
    public void clicked(int position) {
        Intent intent=new Intent(getActivity(), DetailPage.class);
        intent.putExtra("content",ary_type.get(position));
        startActivity(intent);
    }
}
