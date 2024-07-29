package com.aman.healme.ui.theme.screens.homescreens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.aman.healme.ui.theme.data_class.doctors
import com.aman.healme.ui.theme.data_class.imageList
import com.aman.healme.ui.theme.data_class.navItemList
import com.aman.healme.ui.theme.screens.mislanious.AccountScreen
import com.aman.healme.ui.theme.screens.mislanious.AppointmentScreen
import com.aman.healme.ui.theme.screens.mislanious.HomePage
import com.aman.healme.ui.theme.screens.mislanious.UploadScreen

@Composable
fun NewMoreUpdatedHomeScreen(navController: NavHostController) {

    MainHomeScreen(navController = navController)


}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainHomeScreen(navController: NavController){
    val navigationController = rememberNavController()
    val context = LocalContext.current.applicationContext
    val selected = remember {
        mutableStateOf(Icons.Default.Home)
    }

    var selectedIndex by remember {
        mutableIntStateOf(0)
    }
    when(selectedIndex){
        0 -> HomePage()
        1 -> AppointmentScreen()
        2 -> UploadScreen()
        3 -> AccountScreen()
    }
    Scaffold(
        modifier=Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        androidx.compose.material3.Text(text = "HealMe")
                        Spacer(modifier = Modifier.weight(1f))
                    }
                },
                navigationIcon = { // Left button
                    IconButton(onClick = { navController.navigate("LeftDrawer")}) {
                        androidx.compose.material3.Icon(Icons.Default.Menu, contentDescription = "Menu")
                    }
                },
                actions = { // Right button
                    IconButton(onClick = { /* Handle right button click */ }) {
                        androidx.compose.material3.Icon(Icons.Default.Search, contentDescription = "Search")
                    }
                }
            )
        },

        bottomBar = {
            NavigationBar {
                navItemList.forEachIndexed { index, navItem ->
                    NavigationBarItem(
                        selected = selectedIndex == index ,
                        onClick = {
                            when (index) {
                                0 -> navController.navigate("HomeScreen")
                                1 -> navController.navigate("appointments")
                                2 -> navController.navigate("upload")
                                3 -> navController.navigate("account")
                            }
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
        },
        content = {paddingValues->

            Column(modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
            ) {
                SimpleCarousel(imageList) { index ->
                    // Handle image click here based on the index
                }

                TextFun(text ="Let's find your Doctor", onClick = { navController.navigate("AllDoctors") })



                LazyListWithImagesAndText()


                TextFun(text = "What are your symptoms", onClick = { navController.navigate("AllSymScreen") })
                SquareGrid()
                SquareGrid()
                SquareGrid()

                SeeAllBtn()






            }
        }
    )
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





