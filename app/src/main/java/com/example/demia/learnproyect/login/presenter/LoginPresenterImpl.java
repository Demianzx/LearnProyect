package com.example.demia.learnproyect.login.presenter;

import com.example.demia.learnproyect.login.interactor.LoginInteractor;
import com.example.demia.learnproyect.login.interactor.LoginInteractorImpl;
import com.example.demia.learnproyect.login.view.LoginView;

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
    public void singIn(String username, String password) {
        loginView.disableInputs();
        loginView.showProgressBar();
        interactor.singIn(username,password);
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
