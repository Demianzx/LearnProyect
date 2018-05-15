package com.example.demia.learnproyect.login.presenter;

/**
 * Created by demia on 14/05/2018.
 */

public interface LoginPresenter {
    void singIn(String username, String password);//Interactor
    void loginSuccess();
    void loginError(String error);

}
