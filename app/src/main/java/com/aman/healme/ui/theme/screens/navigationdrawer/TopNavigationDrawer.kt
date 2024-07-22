package com.aman.healme.ui.theme.screens.navigationdrawer

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
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
                    Icon(Icons.Default.ArrowBack, contentDescription = "BACK")
                }
            }

        )
    },
){paddingValues->
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(paddingValues)
        .verticalScroll(rememberScrollState())
    ){
        Row(modifier = Modifier.padding(16.dp)) {
            Image( // Assuming an image resource for profile picture
                painter = painterResource(id = R.drawable.dietitian2), // Replace with your resource ID
                contentDescription = "Profile picture",
                modifier = Modifier.size(50.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            Column {
                Text(text = "Aman Pandey")
                Text(text = "+9769947236")
            }
        }
        Text(text = "Content", modifier = Modifier.padding(top = 16.dp))
        // ... rest of the code for content items

        Text(text = "Preferences", modifier = Modifier.padding(top = 16.dp))
        // ... rest of the code for preference items
    }
    }

}


