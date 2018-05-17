package com.nanonino.deploylibrary.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nanonino.deploylibrary.MainActivity;
import com.nanonino.deploylibrary.R;
import com.nanonino.deploylibrary.Register;

/**
 * Created by nnandroid04user on 17/5/18.
 */

public class Login extends Fragment implements View.OnClickListener{

    AppCompatButton btn_login,btn_register;

    View objView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        objView=inflater.inflate(R.layout.layout_login, container, false);
        declare();
        return objView;
    }

    private void declare() {
        btn_login=objView.findViewById(R.id.Id_login_btn_login);
        btn_register=objView.findViewById(R.id.Id_login_btn_register);
        btn_register.setOnClickListener(this);
        btn_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int i = view.getId();
        if (i == R.id.Id_login_btn_login) {
            if (getActivity() != null) {
                getActivity().getSupportFragmentManager().beginTransaction().addToBackStack(Login.class.getName()).add(R.id.Id_frame, new Menu()).commit();
            }

        } else if (i == R.id.Id_login_btn_register) {
            if (getActivity() != null) {
                Intent intent = new Intent(getActivity(), Register.class);
                startActivity(intent);
            }

        }
    }
}
