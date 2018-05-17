package com.nanonino.deploylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;

public class DetailPage extends AppCompatActivity {

    AppCompatTextView txt_content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_page);

        txt_content=findViewById(R.id.Id_detail_txt);

        if (getIntent()!=null){
            if (getIntent().getExtras()!=null){
                if (getIntent().getExtras().getString("content")!=null){
                    txt_content.setText(getIntent().getExtras().getString("content")+"\n"+"GOBI APIRL FOOL");
                }
            }
        }
    }
}
