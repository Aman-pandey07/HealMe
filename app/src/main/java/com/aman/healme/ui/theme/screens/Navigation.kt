package com.aman.healme.ui.theme.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aman.healme.ui.theme.screens.homescreens.NewMoreUpdatedHomeScreen

import com.aman.healme.ui.theme.screens.loginscreens.LoginRegistration01
import com.aman.healme.ui.theme.screens.loginscreens.LoginRegistration02
import com.aman.healme.ui.theme.screens.loginscreens.LoginScreen01
import com.aman.healme.ui.theme.screens.loginscreens.LoginScreen02OTP
import com.aman.healme.ui.theme.screens.mislanious.AccountScreen
import com.aman.healme.ui.theme.screens.mislanious.AllDoctorScreen
import com.aman.healme.ui.theme.screens.mislanious.AllSymptomsScreen
import com.aman.healme.ui.theme.screens.mislanious.AppointmentScreen
import com.aman.healme.ui.theme.screens.mislanious.TAndCScreen
import com.aman.healme.ui.theme.screens.mislanious.UploadScreen
import com.aman.healme.ui.theme.screens.navigationdrawer.TopNavigationDrawer
import com.aman.healme.ui.theme.screens.onboardingscreen.IntroScreen

@Composable
fun App(){
val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "OnBoardingScreen", builder = {
        composable(route = "OnBoardingScreen", content = {
            IntroScreen(navController)
        })
        composable(route = "OnBoardingScreen", content = {
            IntroScreen(navController)
        })
        composable(route = "PhoneNumber", content = {
            LoginScreen01(navController)
        })
        composable(route = "OTP", content = {
            LoginScreen02OTP(navController)
        })
        composable(route = "Registration1", content = {
            LoginRegistration01(navController)
        })
        composable(route = "Registration2", content = {
            LoginRegistration02(navController)
        })
        composable(route = "HomeScreen", content = {
            NewMoreUpdatedHomeScreen(navController)
        })
        composable(route = "AllSymScreen", content = {
            AllSymptomsScreen(navController)
        })
        composable(route = "LeftDrawer", content = {
            TopNavigationDrawer(navController)
        })
        composable(route = "AllDoctors", content = {
            AllDoctorScreen(navController)
        })
        composable("appointments") { AppointmentScreen() }
        composable("upload") { UploadScreen() }
        composable("account") { AccountScreen() }
        composable("T&C") { TAndCScreen(navController = navController) }

    })
}