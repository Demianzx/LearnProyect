package com.example.demia.learnproyect.login.view;

/**
 * Created by demia on 14/05/2018.
 */

public interface LoginView {
    void enableInputs();
    void disableInputs();

    void showProgressBar();
    void hideProgressBar();

    void loginError(String error);

    void goCreateAccount();
    void goHome();

}
