package com.example.demia.learnproyect.login.repository;

import com.example.demia.learnproyect.login.presenter.LoginPresenter;

/**
 * Created by demia on 14/05/2018.
 */

public class LoginRepositoryImpl implements LoginRepository {

    LoginPresenter presenter;

    public LoginRepositoryImpl(LoginPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void singIn(String username, String password) {
        boolean success=true;
        if(success){
            presenter.loginSuccess();
        }else{
            presenter.loginError("Ocurrio un error");
        }
    }
}
