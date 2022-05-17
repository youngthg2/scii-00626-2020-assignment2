package com.example.angela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

val navHostFragment=supportFragmentManager.findFragmentById(R.id.fragmentContainerView)
        as NavHostFragment
        val navController=navHostFragment.navController
        findViewById<BottomNavigationView>(R.id.bottomNavigation)

    }
}