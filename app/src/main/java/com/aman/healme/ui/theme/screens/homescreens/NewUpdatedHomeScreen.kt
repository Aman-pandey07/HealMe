//package com.aman.healme.ui.theme.screens.homescreens
//
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.rememberScrollState
//import androidx.compose.foundation.verticalScroll
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.AccountBox
//import androidx.compose.material.icons.filled.DateRange
//import androidx.compose.material.icons.filled.Home
//import androidx.compose.material.icons.filled.List
//import androidx.compose.material.icons.filled.Menu
//import androidx.compose.material.icons.filled.Search
//import androidx.compose.material3.BottomAppBar
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Icon
//import androidx.compose.material3.IconButton
//import androidx.compose.material3.Text
//import androidx.compose.material3.TopAppBar
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.unit.dp
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.rememberNavController
//import com.aman.healme.ui.theme.data_class.imageList
//import com.aman.healme.ui.theme.screens.Screens
//
//
//
//
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun MyAppBar(navController: NavHostController){
//    val navigationController = rememberNavController()
//    val context = LocalContext.current.applicationContext
//    val selected = remember {
//        mutableStateOf(Icons.Default.Home)
//    }
//
//    androidx.compose.material.Scaffold(
//
//        topBar = {
//            TopAppBar(
//                title = {
//                    Row(
//                        modifier = Modifier.fillMaxWidth(),
//                        horizontalArrangement = Arrangement.Center
//                    ) {
//                        Spacer(modifier = Modifier.weight(1f))
//                        Text(text = "HealMe")
//                        Spacer(modifier = Modifier.weight(1f))
//                    }
//                },
//                navigationIcon = { // Left button
//                    IconButton(onClick = { navController.navigate("LeftDrawer")}) {
//                        Icon(Icons.Default.Menu, contentDescription = "Menu")
//                    }
//                },
//                actions = { // Right button
//                    IconButton(onClick = { /* Handle right button click */ }) {
//                        Icon(Icons.Default.Search, contentDescription = "Search")
//                    }
//                }
//            )
//        },
////      Implement this in the new way that you have learned in the course
//
//
//        bottomBar = {
//            BottomAppBar {
//                IconButton(onClick = {
//                    selected.value = Icons.Default.Home
//                    // Todo implement navigation here
//                    navigationController.navigate(Screens.Home.screen)
//                }, modifier = Modifier.weight(1f)) {
//                    Icon(
//                        Icons.Default.Home, contentDescription = null,
//                        modifier = Modifier.size(26.dp),
//                        tint = if (selected.value == Icons.Default.Home) Color.Black else Color.DarkGray
//                    )
//                }
//
//
//                IconButton(onClick = {
//                    selected.value = Icons.Default.DateRange
//                    // Todo implement navigation here
//                    navigationController.navigate(Screens.Appointment.screen)
//                }, modifier = Modifier.weight(1f)) {
//                    Icon(
//                        Icons.Default.DateRange, contentDescription = null,
//                        modifier = Modifier.size(26.dp),
//                        tint = if (selected.value == Icons.Default.DateRange) Color.Black else Color.DarkGray
//                    )
//                }
//
//
//                IconButton(onClick = {
//                    selected.value = Icons.Default.List
//                    // Todo implement navigation here
//                    navigationController.navigate(Screens.Upload.screen)
//                }, modifier = Modifier.weight(1f)) {
//                    Icon(
//                        Icons.Default.List, contentDescription = null,
//                        modifier = Modifier.size(26.dp),
//                        tint = if (selected.value == Icons.Default.List) Color.Black else Color.DarkGray
//                    )
//                }
//
//
//                IconButton(onClick = {
//                    selected.value = Icons.Default.AccountBox
//                    // Todo implement navigation here
//                    navigationController.navigate(Screens.Account.screen)
//                }, modifier = Modifier.weight(1f)) {
//                    Icon(
//                        Icons.Default.AccountBox, contentDescription = null,
//                        modifier = Modifier.size(26.dp),
//                        tint = if (selected.value == Icons.Default.AccountBox) Color.Black else Color.DarkGray
//                    )
//                }
//            }
//        },
//        content = {paddingValues ->
////
//            Column(modifier = Modifier
//                .fillMaxSize()
//                .padding(paddingValues)
//                .verticalScroll(rememberScrollState())
//            ) {
//                SimpleCarousel(imageList) { index ->
//                    // Handle image click here based on the index
//                }
//
//                TextFun(text ="Let's find your Doctor", navController = navController)
//                var selectedItem by remember { mutableStateOf<String?>(null) }
//
//                val items = listOf("Heart Surgeon", "Psychologies", "Dentist", "Neurologist", "Ornithologist", "Clinic wale")
//                HorizontalListWithSingleSelection(
//                    items = items,
//                    selectedItem = selectedItem,
//                    onItemSelected = { selectedItem = it }
//                )
//
//                LazyListWithImagesAndText()
//
//
//                TextFun(text = "What are your symptoms", navController = navController)
//
//                SquareGrid()
//                SquareGrid()
//                SquareGrid()
//
//                SeeAllBtn()
//
//
//
//            }
//
//        }
//    )
//}
//
//
//
//
//
//
//
//
//
