package com.android.mymaterialdesignjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    //declare global variable
    NavController navController;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initiate variable
        navController = Navigation.findNavController(this, R.id.myNavHostFragment);
        drawerLayout = findViewById(R.id.drawer_layout);

        //declare local variable
        NavigationView navigationView = findViewById(R.id.nav_view);

        //setup actionbar drawer
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout);

        //setup menu navigation
        NavigationUI.setupWithNavController(navigationView, navController);

    }

    @Override
    public boolean onSupportNavigateUp() {
        return NavigationUI.navigateUp(navController, drawerLayout);
    }
}
