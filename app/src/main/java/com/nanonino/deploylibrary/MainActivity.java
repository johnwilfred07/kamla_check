package com.nanonino.deploylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nanonino.deploylibrary.Fragment.Login;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.Id_frame,new Login()).commit();
    }
}
