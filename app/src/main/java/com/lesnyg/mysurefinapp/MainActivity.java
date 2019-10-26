package com.lesnyg.mysurefinapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_main, new MainFragment())
                .commit();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_main);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.action_login:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragment_main,new LoginFragment())
                                .commit();
                        return true;
                    case R.id.action_signup:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragment_main, new SignupFragment())
                                .commit();
                        return true;
                }
                return false;
            }
        });
    }
}
