package com.example.demia.learnproyect.login.interactor;

import com.example.demia.learnproyect.login.presenter.LoginPresenter;
import com.example.demia.learnproyect.login.repository.LoginRepository;
import com.example.demia.learnproyect.login.repository.LoginRepositoryImpl;

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
    public void singIn(String username, String password) {
        repository.singIn(username,password);
    }
}
