package com.example.demia.learnproyect.login.view;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.demia.learnproyect.R;
import com.example.demia.learnproyect.login.presenter.LoginPresenter;
import com.example.demia.learnproyect.login.presenter.LoginPresenterImpl;
import com.example.demia.learnproyect.view.BottomBar;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.*;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity implements LoginView{

    private EditText username, password;
    private Button login;
    private Button loginButton;
    private ProgressBar progressBarLogin;
    private LoginPresenter presenter;

    private static final String TAG = "LoginRepositoryImpl";
    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener authStateListener;
    private CallbackManager callbackManager;
    //@SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        FacebookSdk.sdkInitialize(this.getApplicationContext());
        callbackManager = CallbackManager.Factory.create();
        //AppEventsLogger.activateApp(this);

        username= (EditText) findViewById(R.id.username);
        password= (EditText) findViewById(R.id.password);
        login=(Button) findViewById(R.id.login);
        loginButton = (LoginButton) findViewById(R.id.login_button);
        //loginbuttonFacebook.setReadPermissions("email");
        progressBarLogin=(ProgressBar) findViewById(R.id.progressbarLogin);

        presenter = new LoginPresenterImpl(this);
        hideProgressBar();

        firebaseAuth = FirebaseAuth.getInstance();
        //loginButton
        authStateListener=new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
                if (firebaseUser!= null){
                    Log.w(TAG,"Usuario logeado " + firebaseUser.getEmail());
                }else{
                    Log.w(TAG,"Usuario no logeado ");
                }
            }
        };
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn(username.getText().toString(),password.getText().toString());

            }
        });

    }



    private void signIn(String username, String password) {
        presenter.singIn(username,password,this,firebaseAuth);
    }

    public void goCreateAccount(View view){
        goCreateAccount();
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

    @Override
    protected void onStart() {
        super.onStart();
        firebaseAuth.addAuthStateListener(authStateListener);
    }

    @Override
    protected void onStop() {
        super.onStop();
        firebaseAuth.removeAuthStateListener(authStateListener);
    }
}
