package com.aman.healme.ui.theme.screens.homescreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aman.healme.R
import com.aman.healme.ui.theme.screens.Screens


data class Doctor(
    val name: String,
    val imageResId: Int,
    val spec :String
)

val doctors = listOf(
    Doctor("Dr. John Doe", R.drawable.docimage01,"Heart Surgeon"),
    Doctor("Dr. Jane Smith", R.drawable.docimage01,"Heart Surgeon"),
    Doctor("Dr. Michael Johnson", R.drawable.docimage01,"Heart Surgeon"),
    Doctor("Dr. Emily Brown", R.drawable.docimage01,"Heart Surgeon"),
    Doctor("Dr. William Wilson", R.drawable.docimage01,"Heart Surgeon")
)

data class SymptomsImg(
    val sym:String,
    val imageResIds: Int
)
val symList = listOf(
    SymptomsImg("Cold",R.drawable.cold1),
    SymptomsImg("Headache",R.drawable.cold1),
    SymptomsImg("Digestion",R.drawable.cold1),
    SymptomsImg("Ear Pain",R.drawable.cold1),
    SymptomsImg("Stomach Cramp",R.drawable.cold1),
    SymptomsImg("Skin Infection",R.drawable.cold1)
)
val imageList = listOf(R.drawable.image1, R.drawable.image1, R.drawable.image1)

@Composable
fun NewUpdatedHomeScreen(navController: NavHostController) {
MyAppBar(navController = navController)


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyAppBar(navController: NavHostController){
    val navigationController = rememberNavController()
    val context = LocalContext.current.applicationContext
    val selected = remember {
        mutableStateOf(Icons.Default.Home)
    }

    androidx.compose.material.Scaffold(

        topBar = {
            TopAppBar(
                title = {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Text(text = "HealMe")
                        Spacer(modifier = Modifier.weight(1f))
                    }
                },
                navigationIcon = { // Left button
                    IconButton(onClick = { navController.navigate("LeftDrawer")}) {
                        Icon(Icons.Default.Menu, contentDescription = "Menu")
                    }
                },
                actions = { // Right button
                    IconButton(onClick = { /* Handle right button click */ }) {
                        Icon(Icons.Default.Search, contentDescription = "Search")
                    }
                }
            )
        },
//      Implement this in the new way that you have learned in the course


        bottomBar = {
            BottomAppBar {
                IconButton(onClick = {
                    selected.value = Icons.Default.Home
                    // Todo implement navigation here
                    navigationController.navigate(Screens.Home.screen)
                }, modifier = Modifier.weight(1f)) {
                    Icon(
                        Icons.Default.Home, contentDescription = null,
                        modifier = Modifier.size(26.dp),
                        tint = if (selected.value == Icons.Default.Home) Color.Black else Color.DarkGray
                    )
                }


                IconButton(onClick = {
                    selected.value = Icons.Default.DateRange
                    // Todo implement navigation here
                    navigationController.navigate(Screens.Appointment.screen)
                }, modifier = Modifier.weight(1f)) {
                    Icon(
                        Icons.Default.DateRange, contentDescription = null,
                        modifier = Modifier.size(26.dp),
                        tint = if (selected.value == Icons.Default.DateRange) Color.Black else Color.DarkGray
                    )
                }


                IconButton(onClick = {
                    selected.value = Icons.Default.List
                    // Todo implement navigation here
                    navigationController.navigate(Screens.Upload.screen)
                }, modifier = Modifier.weight(1f)) {
                    Icon(
                        Icons.Default.List, contentDescription = null,
                        modifier = Modifier.size(26.dp),
                        tint = if (selected.value == Icons.Default.List) Color.Black else Color.DarkGray
                    )
                }


                IconButton(onClick = {
                    selected.value = Icons.Default.AccountBox
                    // Todo implement navigation here
                    navigationController.navigate(Screens.Account.screen)
                }, modifier = Modifier.weight(1f)) {
                    Icon(
                        Icons.Default.AccountBox, contentDescription = null,
                        modifier = Modifier.size(26.dp),
                        tint = if (selected.value == Icons.Default.AccountBox) Color.Black else Color.DarkGray
                    )
                }
            }
        },
        content = {paddingValues ->
//
            Column(modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
            ) {
                SimpleCarousel(imageList) { index ->
                    // Handle image click here based on the index
                }

                TextFun(text ="Let's find your Doctor", navController = navController)
                var selectedItem by remember { mutableStateOf<String?>(null) }

                val items = listOf("Heart Surgeon", "Psychologies", "Dentist", "Neurologist", "Ornithologist", "Clinic wale")
                HorizontalListWithSingleSelection(
                    items = items,
                    selectedItem = selectedItem,
                    onItemSelected = { selectedItem = it }
                )

                LazyListWithImagesAndText()
              

                TextFun(text = "What are your symptoms", navController = navController)

                SquareGrid()
                SquareGrid()
                SquareGrid()

                SeeAllBtn()



            }

        }
    )
}









