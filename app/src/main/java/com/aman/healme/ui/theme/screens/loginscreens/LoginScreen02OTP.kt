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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
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



                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(values)
                        .padding(10.dp)
                        .background(Color.White),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Spacer(modifier = Modifier.height(50.dp))
                    Text(
                        text = "Enter your OTP for Login via OTP",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = TextAlign.Center,
                    )

                    Spacer(modifier = Modifier.height(50.dp))
                    val otp = remember { mutableStateOf("") }
                    val focusRequester = remember { FocusRequester() }
                    OtpInput(onOtpChange = { otp.value = it } )
//                    Row (
//                        modifier = Modifier.fillMaxWidth(),
//                        horizontalArrangement = Arrangement.SpaceEvenly
//                    ){



//                            OutlinedTextField(
//
//                                value = otp.value,
//                                onValueChange = {otp.value =it},
//                                textStyle = MaterialTheme.typography.bodyMedium,
//                                modifier = Modifier.fillMaxWidth(),
//
//                            )


//                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(text = "A 4 digit OTP is sent via SMS to verify your mobile number",
                        fontSize = 10.sp,
                        )
                    Spacer(modifier = Modifier.height(50.dp))

                    
                    Button(onClick = { navController.navigate("Registration1") }) {
                        Text(text = "Continue")
                    }

                    Spacer(modifier = Modifier.height(10.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(), // Ensures the Row fills the available width
                        horizontalArrangement = Arrangement.Center // Centers content horizontally
                    ) {
                        Text(text = "If you didn't receive Code??")
                    }



                    Row(
                        modifier = Modifier.fillMaxWidth(), // Ensures the Row fills the available width
                        horizontalArrangement = Arrangement.Center // Centers content horizontally
                    ){
                        TextButton(
                            onClick = { navController.navigate("OTP")},
                            colors = ButtonDefaults.textButtonColors(contentColor = Color.Black),
                            content = { Text("Resend")} ,
                        )
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
                    Text(text = "By creating an account,you accept Heal-Me")
                    TextButton(
                        onClick = { /*TODO it should go to terms and condition screen*/ },
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.CenterHorizontally),
                        content = { Text("Terms and Conditions") }
                    )




                }


            }
        )
    }
@Composable
fun OtpInput(
    maxLength: Int = 6,
    onOtpChange: (String) -> Unit
) {
    var otp by remember { mutableStateOf("") }

    OutlinedTextField(
        value = otp,
        onValueChange = { newValue ->
            val filtered = newValue.filter { it.isDigit() }
            if (filtered.length <= maxLength) {
                otp = filtered
                onOtpChange(filtered)
            }
        },
        label = { Text("Enter the OTP of $maxLength digits") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        singleLine = true, // Ensures it's single line for number input
        maxLines = 1,
        modifier = Modifier.fillMaxWidth() // Optional: Fills the available width
    )
}






