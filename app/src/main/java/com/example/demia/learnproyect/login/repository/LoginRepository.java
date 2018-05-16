package com.example.demia.learnproyect.login.repository;

import android.app.Activity;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by demia on 14/05/2018.
 */

public interface LoginRepository {
    void singIn(String username, String password, Activity activity, FirebaseAuth firebaseAuth);
}
