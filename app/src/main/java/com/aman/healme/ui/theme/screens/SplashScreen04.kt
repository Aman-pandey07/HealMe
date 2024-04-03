package com.aman.healme.ui.theme.screens

//import android.graphics.Bitmap
import android.text.style.BackgroundColorSpan
import android.util.Config
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.BoxScopeInstance.align
//import androidx.compose.foundation.layout.BoxScopeInstance.align
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
//import androidx.compose.foundation.layout.FlowRowScopeInstance.align
//import androidx.compose.foundation.layout.RowScopeInstance.align
//import androidx.compose.foundation.layout.FlowColumnScopeInstance.align
//import androidx.compose.foundation.layout.ColumnScopeInstance.align
//import androidx.compose.foundation.layout.FlowColumnScopeInstance.align
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.aman.healme.R



@Composable
fun SplashScreen04(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            contentAlignment = Alignment.TopEnd
//                .align(Alignment.Start)
        ){
            TextButton(
                onClick = { navController.navigate("loginscreen01") },
                modifier = Modifier
                    .size(100.dp, 50.dp),
                contentPadding = PaddingValues(0.dp), // Remove default padding
                colors = ButtonDefaults.textButtonColors(contentColor = Color.Black)
            ) {
                Text("Lets Start Registration!!")
            }
        }
//        Spacer(modifier = Modifier.padding(30.dp))
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, bottom = 16.dp),
            painter = painterResource(id = R.drawable.splashimg04),
            contentDescription = null
        )


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
                    painter = painterResource(id = R.drawable.coloredstethoscope),
                    contentDescription = null

                )

            }
        }
        Spacer(modifier = Modifier
            .padding(30.dp)
        )

        Text(
            text = """Schedule appointments with 
            expert doctors""".trimMargin(),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(16.dp),

            fontSize = 22.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
        )


        Text(
            text = "Find experienced specialist doctors with\n" +
                    "expert ratings and reviews and book your\n " +
                    "          appointments hassle-free",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(16.dp),

            fontSize = 16.sp,
            color = Color.Black,

            )



        Button(onClick = {navController.navigate("loginscreen01") },
            modifier = Modifier
                .size(50.dp)
                .align(Alignment.CenterHorizontally)
                .padding(),
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(contentColor = Color.Black),
            contentPadding = PaddingValues(0.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowForward,
                contentDescription = null,
                modifier = Modifier.size(24.dp), // Adjust the icon size as needed
                tint = Color.Black
            )

        }
    }
}

