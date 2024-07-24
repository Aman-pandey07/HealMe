package com.aman.healme.ui.theme.screens.homescreens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.aman.healme.ui.theme.screens.mislanious.AccountScreen
import com.aman.healme.ui.theme.screens.mislanious.AppointmentScreen
import com.aman.healme.ui.theme.screens.mislanious.HomePage
import com.aman.healme.ui.theme.screens.mislanious.UploadScreen
import com.aman.healme.ui.theme.screens.navigationdrawer.NavItem

@Composable
fun MainHomeScreen(modifier: Modifier=Modifier){

    val navItemList = listOf(
        NavItem("Home", Icons.Default.Home),
        NavItem("Apointment", Icons.Default.DateRange),
        NavItem("Upload", Icons.AutoMirrored.Filled.List),
        NavItem("Account", Icons.Default.AccountCircle)
    )

    var selectedIndex by remember {
        mutableIntStateOf(0)
    }
    Scaffold(
        modifier=Modifier.fillMaxSize(),

        bottomBar = {
            NavigationBar {
                navItemList.forEachIndexed { index, navItem ->
                    NavigationBarItem(
                        selected = selectedIndex == index ,
                        onClick = {
                            selectedIndex = index
                        },
                        icon = { 
                            Icon(imageVector = navItem.icon, contentDescription = navItem.label)
                        },
                        label = {
                            Text(text = navItem.label)
                        }
                    )
                }
            }
        }
    ) {innerPadding ->
        ContentScreen( modifier = Modifier.padding(innerPadding),selectedIndex)
    }
}

@Composable
fun ContentScreen( modifier: Modifier=Modifier, selectedIndex:Int){
    when(selectedIndex){
        0 -> HomePage()
        1 -> AppointmentScreen()
        2 -> UploadScreen()
        3 -> AccountScreen()
    }
}