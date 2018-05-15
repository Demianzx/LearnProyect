package com.example.demia.learnproyect.login.view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.demia.learnproyect.R;
import com.example.demia.learnproyect.login.presenter.LoginPresenter;
import com.example.demia.learnproyect.login.presenter.LoginPresenterImpl;
import com.example.demia.learnproyect.view.BottomBar;
import com.example.demia.learnproyect.view.ContainerActivity;
import com.example.demia.learnproyect.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity implements LoginView{

    private EditText username, password;
    private Button login;
    private ProgressBar progressBarLogin;
    private LoginPresenter presenter;


    //@SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username= (EditText) findViewById(R.id.username);
        password= (EditText) findViewById(R.id.password);
        login=(Button) findViewById(R.id.login);
        progressBarLogin=(ProgressBar) findViewById(R.id.progressbarLogin);

        presenter = new LoginPresenterImpl(this);
        hideProgressBar();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                presenter.singIn(username.getText().toString(),password.getText().toString());
            }
        });
    }

    @Override
    public void enableInputs() {
        username.setEnabled(true);
        password.setEnabled(true);
        login.setEnabled(true);
    }

    @Override
    public void disableInputs() {
        username.setEnabled(false);
        password.setEnabled(false);
        login.setEnabled(false);

    }

    @Override
    public void showProgressBar() {
        progressBarLogin.setVisibility(View.VISIBLE);

    }

    @Override
    public void hideProgressBar() {
        progressBarLogin.setVisibility(View.GONE);
    }

    @Override
    public void loginError(String error) {
        Toast.makeText(this, getString(R.string.login_error)+error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void goCreateAccount() {
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }

    @Override
    public void goHome() {
        Intent intent = new Intent(this, BottomBar.class);
        startActivity(intent);
    }
}
