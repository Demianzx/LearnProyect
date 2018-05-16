package com.example.demia.learnproyect.login.presenter;

import android.app.Activity;

import com.example.demia.learnproyect.login.view.LoginActivity;
import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by demia on 14/05/2018.
 */

public interface LoginPresenter {
    void singIn(String username, String password, Activity activity, FirebaseAuth firebaseAuth);//Interactor
    void loginSuccess();
    void loginError(String error);

}
