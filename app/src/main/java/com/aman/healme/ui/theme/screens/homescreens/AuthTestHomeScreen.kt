package com.aman.healme.ui.theme.screens.homescreens

import com.aman.healme.viewmodels.AuthState
import com.aman.healme.viewmodels.AuthViewModel


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun AuthTestHomeScreen( modifier: Modifier = Modifier,navController: NavHostController, authViewModel: AuthViewModel){

    val authState = authViewModel.authState. observeAsState()
    LaunchedEffect (authState.value) {
        when (authState.value){
            is AuthState.Unauthenticated -> navController.navigate ("login")
            else-> Unit
        }
    }
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement. Center,
        horizontalAlignment = Alignment. CenterHorizontally
    ) {
        Text(text = "Home Page", fontSize = 32.sp)
        TextButton(onClick = {
            authViewModel.signout()
        }) {
            Text(text = "Sign out")
        }
    }


}