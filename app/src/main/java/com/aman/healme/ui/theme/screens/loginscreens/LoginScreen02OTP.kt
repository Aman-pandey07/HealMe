package com.aman.healme.ui.theme.screens.loginscreens

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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.aman.healme.R


@Composable
fun LoginScreen02OTP(navController: NavController){
        Scaffold(
            topBar = {
                AppHeader("HEAL-ME") {
                    navController.navigateUp() // Example usage with NavController
                }
            },
            content = {values->
                // TODO screen content here
                val phoneNumber = remember{ mutableStateOf("") }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(values)
                        .background(Color.White),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Spacer(modifier = Modifier.height(25.dp))
                    Text(
                        text = "Enter your OTP for Login via OTP",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                    )
                    Spacer(modifier = Modifier.height(16.dp))



                    Text(text = "A 4 digit OTP will be sent via SMS to verify your mobile number", fontSize = 10.sp)
                    Spacer(modifier = Modifier.height(50.dp))
                    val otp = remember { mutableStateOf("") }
                    val focusRequester = remember { FocusRequester() }
                    Row (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ){


                            OutlinedTextField(

                                value = otp.value,
                                onValueChange = {otp.value =it},
                                textStyle = MaterialTheme.typography.bodyMedium,
                                modifier = Modifier.fillMaxWidth(),

                            )


                    }

                    
                    Button(onClick = { navController.navigate("loginregistration01") }) {
                        Text(text = "Continue")
                    }

                    Row (
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(text = "If you didn't received Code??")
                        TextButton(
                            onClick = { },
                                colors = ButtonDefaults.textButtonColors(contentColor = Color.Black)
                        ) {
                            Text("Resend")
                        }
                    }
                    


                        
                    Spacer(modifier = Modifier.weight(1f))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 100.dp, end = 100.dp)
                            .height(50.dp)



                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 8.dp, vertical = 8.dp)
                        ) {
//
                            Image(
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(4.dp)
                                    .fillMaxHeight(),
                                painter = painterResource(id = R.drawable.coloredstethoscope), // Replace with your image IDs
                                contentDescription = null
                            )
                            Image(
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(4.dp)
                                    .fillMaxHeight(),
                                painter = painterResource(id = R.drawable.coloredstethoscope), // Replace with your image IDs
                                contentDescription = null
                            )
                            Image(
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(4.dp)
                                    .fillMaxHeight(),
                                painter = painterResource(id = R.drawable.noncoloredstethoscope), // Replace with your image IDs
                                contentDescription = null
                            )
                            Image(
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(4.dp)
                                    .fillMaxHeight(),
                                painter = painterResource(id = R.drawable.noncoloredstethoscope),
                                contentDescription = null

                            )

                        }
                    }
                    Text(text = "By creating an account,you accept Heal-Me Terms of services ")




                }
            }
        )
    }






