package com.example.demia.learnproyect.view;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.demia.learnproyect.R;
import com.example.demia.learnproyect.view.fragments.HomeFragment;
import com.example.demia.learnproyect.view.fragments.ProfileFragment;
import com.example.demia.learnproyect.view.fragments.SearchFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabReselectListener;
import com.roughike.bottombar.OnTabSelectListener;

public class ContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);


    }
}
