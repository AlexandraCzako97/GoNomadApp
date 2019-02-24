package com.example.ada.gonomadapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.logInButton)
    void clickedLogin(){
        openSearchActivity();
    }

    private void openSearchActivity() {
        Intent intent = new Intent(this,SearchActivity.class);
        startActivity(intent);

    }

    @OnClick(R.id.registerButton)
    void clickedRegister(){
        openregisterAvtivity();

    }

    void openregisterAvtivity(){
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }
}