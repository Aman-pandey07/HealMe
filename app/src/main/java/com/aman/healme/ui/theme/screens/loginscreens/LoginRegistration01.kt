package com.aman.healme.ui.theme.screens.loginscreens

//import androidx.compose.material3.DatePickerDialog
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
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.aman.healme.R

@Composable
fun LoginRegistration01(navController:NavController){

    Scaffold(
        topBar = {
            AppHeader("HEAL-ME") {
                navController.navigateUp() // Example usage with NavController
            }
        },
        content = {value->
            Column (
                modifier = Modifier
                .fillMaxSize()
                .padding(value)
                .padding(10.dp)
                .background(Color.White),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Spacer(modifier = Modifier.height(50.dp))
                Text(
                    text = "Complete Health solutions",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center,
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = "Find the best Doctor and Medicines for you", fontSize = 10.sp)
                Spacer(modifier = Modifier.height(50.dp))

                val fullName = remember{mutableStateOf("")}
                OutlinedTextField(
                    value = fullName.value,
                    onValueChange = {fullName.value=it},
                    label = { Text(stringResource(R.string.fullname))},
                    modifier = Modifier.fillMaxWidth(),
                    )
                Spacer(modifier = Modifier.height(25.dp))
                val dob = remember {
                    mutableStateOf("")
                }
                OutlinedTextField(
                    value = dob.value,
                    onValueChange = {dob.value=it},
                    label = { Text(stringResource(R.string.dob))},
                    modifier = Modifier.fillMaxWidth(),
                )
                Button(onClick = { navController.navigate("Registration2") }) {
                    Text(text = "Next")
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
                            painter = painterResource(id = R.drawable.coloredstethoscope), // Replace with your image IDs
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


