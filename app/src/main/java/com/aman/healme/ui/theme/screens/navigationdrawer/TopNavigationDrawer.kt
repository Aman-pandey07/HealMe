package com.aman.healme.ui.theme.screens.navigationdrawer

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.aman.healme.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopNavigationDrawer(navController: NavHostController) {
Scaffold (
    topBar = {
        TopAppBar(title = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "Setting")
                Spacer(modifier = Modifier.weight(1f))
            }
        },
            navigationIcon = {
                IconButton(onClick = { navController.navigateUp() }) {
                    Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "BACK")
                }
            }

        )
    },
){paddingValues->
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(paddingValues)
        .padding(10.dp)
        .verticalScroll(rememberScrollState())
    ){
        Row(modifier = Modifier.padding(16.dp)) {
            //image and info on the top
            Image(
                painter = painterResource(id = R.drawable.dietitian2),
                contentDescription = "Profile picture",
                modifier = Modifier.size(50.dp)
            )
            Spacer(modifier = Modifier.padding(45.dp))
            Column {
                Text(text = "Aman Pandey")
                Text(text = "+9769947236")
                Row{
                    Icon(imageVector = Icons.Default.Call, contentDescription = null)
                    Spacer(modifier = Modifier.padding(10.dp))
                    Icon(imageVector = Icons.Default.Info, contentDescription = null)
                    Spacer(modifier = Modifier.padding(10.dp))
                    Icon(imageVector = Icons.Default.Email, contentDescription = null)
                }
            }
        }

        //Content

        Row(modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Blue)){
            Text(text = "Content",
                modifier = Modifier
                    .fillMaxWidth(fraction = 1f)
                    .wrapContentSize(Alignment.Center),
                color = Color.White, // Set text color to white
                fontWeight = FontWeight.Bold // Make text bold
            )
        }
        Spacer(modifier = Modifier.padding(10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(onClick = { /* Your click action here */ })
                .padding(horizontal = 16.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription = "Notification",
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = "Notification",
                modifier = Modifier.padding(top = 8.dp, start = 8.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            // Arrow button at the end
            IconButton(
                onClick = { /* Your button click action here */ },
                modifier = Modifier.align(Alignment.CenterVertically)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                    contentDescription = "Navigate icon"
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(onClick = { /* Your click action here */ })
                .padding(horizontal = 16.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "Review",
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = "Review",
                modifier = Modifier.padding(top = 8.dp, start = 8.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            // Arrow button at the end
            IconButton(
                onClick = { /* Your button click action here */ },
                modifier = Modifier.align(Alignment.CenterVertically)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                    contentDescription = "Navigate icon"
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(onClick = { /* Your click action here */ })
                .padding(horizontal = 16.dp)
        ) {
            Icon(
                imageVector = Icons.Default.DateRange,
                contentDescription = "Appointment",
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = "Appointment",
                modifier = Modifier.padding(top = 8.dp, start = 8.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            // Arrow button at the end
            IconButton(
                onClick = { /* Your button click action here */ },
                modifier = Modifier.align(Alignment.CenterVertically)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                    contentDescription = "Navigate icon"
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(onClick = { /* Your click action here */ })
                .padding(horizontal = 16.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "Favorite Doctors",
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = "Favorite Doctors",
                modifier = Modifier.padding(top = 8.dp, start = 8.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            // Arrow button at the end
            IconButton(
                onClick = { /* Your button click action here */ },
                modifier = Modifier.align(Alignment.CenterVertically)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                    contentDescription = "Navigate icon"
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(onClick = { /* Your click action here */ })
                .padding(horizontal = 16.dp)
        ) {
            Icon(
                imageVector = Icons.Default.ShoppingCart,
                contentDescription = "My Rewards",
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = "My Rewards",
                modifier = Modifier.padding(top = 8.dp, start = 8.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            // Arrow button at the end
            IconButton(
                onClick = { /* Your button click action here */ },
                modifier = Modifier.align(Alignment.CenterVertically)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                    contentDescription = "Navigate icon"
                )
            }
        }



//      Preferences

        Row(modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Blue)){
            Text(text = "Preferences",
                    modifier = Modifier
                        .fillMaxWidth(fraction = 1f)
                        .wrapContentSize(Alignment.Center),
                        color = Color.White, // Set text color to white
                        fontWeight = FontWeight.Bold // Make text bold
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(onClick = { /* Your click action here */ })
                .padding(horizontal = 16.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Share,
                contentDescription = "Refer App",
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = "Refer App",
                modifier = Modifier.padding(top = 8.dp, start = 8.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            // Arrow button at the end
            IconButton(
                onClick = { /* Your button click action here */ },
                modifier = Modifier.align(Alignment.CenterVertically)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                    contentDescription = "Navigate icon"
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(onClick = { /* Your click action here */ })
                .padding(horizontal = 16.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Warning,
                contentDescription = "Terms & Conditions",
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = "Terms & Conditions",
                modifier = Modifier.padding(top = 8.dp, start = 8.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            // Arrow button at the end
            IconButton(
                onClick = { /* Your button click action here */ },
                modifier = Modifier.align(Alignment.CenterVertically)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                    contentDescription = "Navigate icon"
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(onClick = { /* Your click action here */ })
                .padding(horizontal = 16.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Info,
                contentDescription = "Feedback",
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = "Feedback",
                modifier = Modifier.padding(top = 8.dp, start = 8.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            // Arrow button at the end
            IconButton(
                onClick = { /* Your button click action here */ },
                modifier = Modifier.align(Alignment.CenterVertically)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                    contentDescription = "Navigate icon"
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(onClick = { /* Your click action here */ })
                .padding(horizontal = 16.dp)
        ) {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "Help & Support",
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = "Help & Support",
                modifier = Modifier.padding(top = 8.dp, start = 8.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            // Arrow button at the end
            IconButton(
                onClick = { /* Your button click action here */ },
                modifier = Modifier.align(Alignment.CenterVertically)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                    contentDescription = "Navigate icon"
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(onClick = { /* Your click action here */ })
                .padding(horizontal = 16.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Lock,
                contentDescription = "Privacy Policy",
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = "Privacy Policy",
                modifier = Modifier.padding(top = 8.dp, start = 8.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            // Arrow button at the end
            IconButton(
                onClick = { /* Your button click action here */ },
                modifier = Modifier.align(Alignment.CenterVertically)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                    contentDescription = "Navigate icon"
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(onClick = { /* Your click action here */ })
                .padding(horizontal = 16.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Refresh,
                contentDescription = "Update App",
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = "Update App",
                modifier = Modifier.padding(top = 8.dp, start = 8.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            // Arrow button at the end
            IconButton(
                onClick = { /* Your button click action here */ },
                modifier = Modifier.align(Alignment.CenterVertically)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                    contentDescription = "Navigate icon"
                )
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Blue)){
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ExitToApp,
                contentDescription = "Logout Icon",
                tint = Color.White,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(text = "Logout",
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentSize(Alignment.Center),
                color = Color.White, // Set text color to white
                fontWeight = FontWeight.Bold // Make text bold
            )
        }





    }
    }

}


