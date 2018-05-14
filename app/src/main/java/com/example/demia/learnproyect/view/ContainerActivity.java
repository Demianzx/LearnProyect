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


        /*BottomBar bottomBar =(BottomBar) findViewById(R.id.bottombar);
        bottomBar.setDefaultTab(R.id.home);
        bottomBar.setDefaultTabPosition(R.id.home);
        final HomeFragment homeFragment=new HomeFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .addToBackStack(null).commit();
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(int tabId) {
                switch (tabId){
                    case R.id.home:

                        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null).commit();
                        break;
                    case R.id.profile:
                        ProfileFragment profileFragment=new ProfileFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,profileFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null).commit();
                        break;
                    case R.id.search:
                        SearchFragment searchFragment=new SearchFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,searchFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null).commit();
                        break;

                }
            }
       });*/
    }
}
