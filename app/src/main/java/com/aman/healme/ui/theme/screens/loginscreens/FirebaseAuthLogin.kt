package com.aman.healme.ui.theme.screens.loginscreens

import android.widget.Toast
import com.aman.healme.viewmodels.AuthState
import com.aman.healme.viewmodels.AuthViewModel

import androidx.compose.runtime.livedata.observeAsState


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.TextButton

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.aman.healme.R



@Composable
fun FirebaseAuthLogin(modifier: Modifier = Modifier, navController: NavHostController, authViewModel: AuthViewModel){
    val authState = authViewModel.authState.observeAsState()
    val context = LocalContext.current
    LaunchedEffect(authState.value) {
        when(authState.value){
            is AuthState.Authenticated -> navController.navigate("homepage")
            is AuthState.Error -> Toast.makeText(context,
                (authState.value as AuthState.Error).message, Toast.LENGTH_SHORT).show()
            else -> Unit
        }

    }


            // TODO screen content here
            Column(
                modifier=Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){




                Text(
                    text = "Enter your Email and Password for Login",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center,
                )
                Spacer(modifier = Modifier.height(50.dp))
                var email by remember {
                    mutableStateOf("")
                }


                OutlinedTextField(
                    value =email ,
                    onValueChange ={email=it},
                    label = { Text(text = "Email") }
                )
                var password by remember {
                    mutableStateOf("")
                }
                Spacer(modifier = Modifier.padding(16.dp))

                OutlinedTextField(
                    value =password ,
                    onValueChange ={password=it},
                    label = { Text(text = "Password") }
                )

                Spacer(modifier = Modifier.padding(16.dp))

                Button(
                    onClick = {
                        authViewModel.login(email, password)
                    },
                    enabled = authState.value != AuthState.Loading
                ) {
                    Text(text = "Login")
                }

                TextButton(onClick = { navController.navigate("signup") }) {
                    Text(text = "Don't have an account? Signup")
                }








//                Spacer(modifier = Modifier.weight(1f))
//                Box(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(start = 100.dp, end = 100.dp)
//                        .height(50.dp)
//                ) {
//                    Row(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(horizontal = 8.dp, vertical = 8.dp)
//                    ) {
////
//                        Image(
//                            modifier = Modifier
//                                .weight(1f)
//                                .padding(4.dp)
//                                .fillMaxHeight(),
//                            painter = painterResource(id = R.drawable.coloredstethoscope), // Replace with your image IDs
//                            contentDescription = null
//                        )
//                        Image(
//                            modifier = Modifier
//                                .weight(1f)
//                                .padding(4.dp)
//                                .fillMaxHeight(),
//                            painter = painterResource(id = R.drawable.noncoloredstethoscope), // Replace with your image IDs
//                            contentDescription = null
//                        )
//
//
//                    }
//                }
//                Text(text = "By creating an account,you accept Heal-Me")
//                androidx.compose.material3.TextButton(
//                    onClick = { navController.navigate("T&C") },
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .align(Alignment.CenterHorizontally),
//                    content = { Text("Terms and Conditions") }
//                )

            }
}


