package com.aman.healme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aman.healme.ui.theme.HealMeTheme
import com.aman.healme.ui.theme.screens.loginscreens.LoginScreen01
import com.aman.healme.ui.theme.screens.SplashScreen01
import com.aman.healme.ui.theme.screens.SplashScreen02
import com.aman.healme.ui.theme.screens.SplashScreen03
import com.aman.healme.ui.theme.screens.SplashScreen04

import com.aman.healme.ui.theme.screens.homescreens.NewUpdatedHomeScreen
import com.aman.healme.ui.theme.screens.loginscreens.LoginRegistration01
import com.aman.healme.ui.theme.screens.loginscreens.LoginRegistration02
import com.aman.healme.ui.theme.screens.loginscreens.LoginScreen02OTP
import com.aman.healme.ui.theme.screens.loginscreens.Test


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HealMeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
                ) {
                   NewUpdatedHomeScreen()

                }
            }
        }
    }
}

@Composable
fun App(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splashscreen01" ){
        composable(route = "splashscreen01"){
            SplashScreen01(navController)
        }
        composable(route = "splashscreen02"){
            SplashScreen02(navController)
        }
        composable(route = "splashscreen03"){
            SplashScreen03(navController)
        }
        composable(route = "splashscreen04"){
            SplashScreen04(navController)
        }
        composable(route = "loginscreen01"){
            LoginScreen01(navController)
        }
        composable(route = "loginscreen02otp"){
            LoginScreen02OTP(navController)
        }
        composable(route = "loginregistration01"){
            LoginRegistration01(navController)
        }
        composable(route = "loginregistration02"){
            LoginRegistration02(navController)
        }



    }

}

