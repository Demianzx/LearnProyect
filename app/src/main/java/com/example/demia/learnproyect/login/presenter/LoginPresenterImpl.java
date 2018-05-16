package com.example.demia.learnproyect.login.presenter;

import android.app.Activity;

import com.example.demia.learnproyect.login.interactor.LoginInteractor;
import com.example.demia.learnproyect.login.interactor.LoginInteractorImpl;
import com.example.demia.learnproyect.login.view.LoginActivity;
import com.example.demia.learnproyect.login.view.LoginView;
import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by demia on 14/05/2018.
 */

public class LoginPresenterImpl implements LoginPresenter {

    private LoginView loginView;
    private LoginInteractor interactor;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        interactor = new LoginInteractorImpl(this);
    }

    @Override
    public void singIn(String username, String password, Activity activity, FirebaseAuth firebaseAuth) {
        loginView.disableInputs();
        loginView.showProgressBar();
        interactor.singIn(username,password,activity,firebaseAuth);
    }

    @Override
    public void loginSuccess() {
        loginView.goHome();
        loginView.enableInputs();
        loginView.hideProgressBar();
    }

    @Override
    public void loginError(String error) {
        loginView.enableInputs();
        loginView.hideProgressBar();
        loginView.loginError(error);

    }


}
