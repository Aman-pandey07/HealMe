package com.aman.healme.ui.theme.screens.loginscreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TextButton
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.aman.healme.R



@Composable
fun LoginScreen01(navController: NavController){
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
                    .padding(10.dp)
                    .background(Color.White),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){

                Spacer(modifier = Modifier.height(50.dp))


                Text(
                    text = "Enter your phone number for Login via OTP",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center,
                )
                Spacer(modifier = Modifier.height(50.dp))
                //phone number input field
                NumberInput(onNumberChange = { phoneNumber.value = it })
//
                //old number input field
//                OutlinedTextField(
//                    value = phoneNumber.value,
//                    onValueChange = {phoneNumber.value=it},
//                    label = { Text(stringResource(R.string.phone_number))},
//                    modifier = Modifier.fillMaxWidth()
//                )
                Spacer(modifier = Modifier.height(20.dp))

                Text(text = "A 4 digit OTP will be sent via SMS to verify your mobile number", fontSize = 10.sp,)
                Spacer(modifier = Modifier.height(50.dp))
                
                Button(onClick = {navController.navigate("OTP") }) {
                    Text(text = "Continue")
                }
                androidx.compose.material3.TextButton(
                    onClick = { navController.navigate("HomeScreen") },
                    modifier = Modifier
                        .size(100.dp, 50.dp),
//                    .align(Alignment.End),
                    contentPadding = PaddingValues(0.dp), // Remove default padding
                    colors = ButtonDefaults.textButtonColors(contentColor = Color.Black),
                    content = { Text("SKIP") }
                )
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
                            painter = painterResource(id = R.drawable.noncoloredstethoscope), // Replace with your image IDs
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
                androidx.compose.material3.TextButton(
                    onClick = { navController.navigate("T&C") },
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
fun NumberInput(
    maxLength: Int = 10,
    onNumberChange: (String) -> Unit
    ) {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { newValue ->
            val filtered = newValue.filter { it.isDigit() }
            if (filtered.length <= maxLength) {
                text = filtered
                onNumberChange(filtered)
            }
        },
        label = { Text("Enter your mobile number of $maxLength digits") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        singleLine = true, // Ensures it's single line for number input
        maxLines = 1,
        modifier = Modifier.fillMaxWidth() // Optional: Fills the available width
    )
}





