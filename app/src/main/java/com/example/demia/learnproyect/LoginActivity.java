package com.example.demia.learnproyect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.demia.learnproyect.view.BottomBar;
import com.example.demia.learnproyect.view.ContainerActivity;
import com.example.demia.learnproyect.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void goCreateAccount(View view){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }
    public void goHomePage(View view){
        Intent intent = new Intent(this, BottomBar.class);
        startActivity(intent);
    }
}
