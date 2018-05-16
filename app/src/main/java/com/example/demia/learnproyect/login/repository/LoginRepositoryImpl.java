package com.example.demia.learnproyect.login.repository;

import android.app.Activity;
import android.support.annotation.NonNull;

import com.example.demia.learnproyect.login.presenter.LoginPresenter;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by demia on 14/05/2018.
 */

public class LoginRepositoryImpl implements LoginRepository {



    LoginPresenter presenter;

    public LoginRepositoryImpl(LoginPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void singIn(String username, String password, Activity activity,FirebaseAuth firebaseAuth) {
        boolean success=true;

        firebaseAuth.signInWithEmailAndPassword(username,password).addOnCompleteListener(activity, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    presenter.loginSuccess();
                }else{
                    presenter.loginError("Ocurrio un error..");
                }
            }
        });
        /*if(success){
            presenter.loginSuccess();
        }else{
            presenter.loginError("Ocurrio un error");
        }*/
    }

}
