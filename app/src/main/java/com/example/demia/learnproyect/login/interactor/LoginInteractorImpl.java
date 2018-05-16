package com.example.demia.learnproyect.login.interactor;

import android.app.Activity;

import com.example.demia.learnproyect.login.presenter.LoginPresenter;
import com.example.demia.learnproyect.login.repository.LoginRepository;
import com.example.demia.learnproyect.login.repository.LoginRepositoryImpl;
import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by demia on 14/05/2018.
 */

public class LoginInteractorImpl implements LoginInteractor{

    private LoginPresenter presenter;
    private LoginRepository repository;

    public LoginInteractorImpl(LoginPresenter presenter) {
        this.presenter=presenter ;
        repository=new LoginRepositoryImpl(presenter);
    }

    @Override
    public void singIn(String username, String password, Activity activity, FirebaseAuth firebaseAuth) {
        repository.singIn(username,password,activity,firebaseAuth);
    }
}
