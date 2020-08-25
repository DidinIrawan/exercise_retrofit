package com.main.exercise_retrofit.activity

import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.main.exercise_retrofit.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = (nav_main_host_fragment_container as NavHostFragment).navController
        NavigationUI.setupWithNavController(bottom_navigation, navController)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.showArtist -> {
                    navController.navigate(R.id.action_to_artistFragment)
                    true
                }

                R.id.createArtist -> {
                    navController.navigate(R.id.action_to_artistAddFragment)
                    true
                }
                else -> {
                    println("MASUK ELSE")
                    false
                }
            }
        }
    }


}