package com.aman.healme.ui.theme.screens.homescreens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun TextFun(text:String,navController: NavHostController){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 3.dp)
            .height(IntrinsicSize.Min),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Top
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.titleMedium, // Material 3 typography
            modifier = Modifier.padding(start = 25.dp, top = 13.dp)

        )
        TextButton(
            onClick = { navController.navigate("AllSymScreen")},
            colors = ButtonDefaults.textButtonColors(
                contentColor = MaterialTheme.colorScheme.onSurface // Consistent text color
            ),
            contentPadding = PaddingValues(0.dp),
            elevation = null,
        )
        {
            Text(
                text = "See all",
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}



@Composable
fun SeeAllBtn(){
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth() // Makes the button fill the available horizontal space
            .padding(horizontal = 70.dp, vertical = 8.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            contentColor = Color.White,

            ),
        content = {
            Text(text = "See all")
        }
    )

}