package com.example.demia.learnproyect.view;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.demia.learnproyect.R;
import com.example.demia.learnproyect.view.fragments.HomeFragment;
import com.example.demia.learnproyect.view.fragments.ProfileFragment;
import com.example.demia.learnproyect.view.fragments.SearchFragment;

public class BottomBar extends AppCompatActivity {

    private TextView mTextMessage;
    HomeFragment homeFragment=new HomeFragment();
    ProfileFragment profileFragment=new ProfileFragment();
    SearchFragment searchFragment=new SearchFragment();


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    transicionFragment(homeFragment);
                    return true;
                case R.id.navigation_dashboard:
                    transicionFragment(profileFragment);
                    return true;
                case R.id.navigation_notifications:
                    transicionFragment(searchFragment);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_bar);

        transicionFragment(homeFragment);
        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    public void transicionFragment(android.support.v4.app.Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .addToBackStack(null).commit();
    }

}
