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
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.core.widgets.Rectangle
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aman.healme.R
import com.aman.healme.ui.theme.screens.Screens
import kotlin.math.round


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
fun NewUpdatedHomeScreen(){
MyAppBar()


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyAppBar(){
    val navigationController = rememberNavController()
    val context = LocalContext.current.applicationContext
    val selected = remember {
        mutableStateOf(Icons.Default.Home)
    }

    Scaffold(

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
                    IconButton(onClick = { /* Handle left button click */ }) {
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
            NavHost(navController = navigationController,
                startDestination = Screens.Home.screen,
                modifier = Modifier.padding(paddingValues)) {
                composable(Screens.Home.screen){ Screens.Home }
                composable(Screens.Appointment.screen){ Screens.Appointment }
                composable(Screens.Upload.screen){ Screens.Upload }
                composable(Screens.Account.screen){ Screens.Account }
            }
            Column(modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
            ) {
                SimpleCarousel(imageList) { index ->
                    // Handle image click here based on the index
                }

                TextFun(text ="Let's find your Doctor" )
                var selectedItem by remember { mutableStateOf<String?>(null) }

                val items = listOf("Heart Surgeon", "Psychologies", "Dentist", "Neurologist", "Ornithologist", "Clinic wale")
                HorizontalListWithSingleSelection(
                    items = items,
                    selectedItem = selectedItem,
                    onItemSelected = { selectedItem = it }
                )

                LazyListWithImagesAndText()
              

                TextFun(text = "What are your symptoms")

                SquareGrid()
                SquareGrid()
                SquareGrid()

                seeAllBtn()



            }

        }
    )
}

@Preview
@Composable
fun Preview01(){
    MyAppBar()
}

@Composable
fun SimpleCarousel(images : List<Int>, onClick:(Int) -> Unit ){
    LazyRow(modifier = Modifier
        .fillMaxWidth()
        .height(150.dp)
//        .offset(y = (60).dp)
    ) {
        itemsIndexed(images){index, imageId ->
            CarouselItem(imageId, onClick = { onClick(index) })
            Spacer(modifier = Modifier.width(8.dp))
        }
    }
}

@Composable
fun CarouselItem(imageId: Int, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .width(350.dp)
            .clickable { onClick() }
            .padding(4.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp)
    ) {
        Box {
            Image(
                painter = painterResource(id = imageId),
                contentDescription = "Image",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}

@Composable
fun TextFun(text:String){
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
            onClick = { },
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
fun HorizontalListWithSingleSelection(
    items: List<String>,
    selectedItem: String?,
    onItemSelected: (String) -> Unit
) {
    LazyRow(
        modifier = Modifier.padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items.forEach { item ->
            item {
                ListItem(
                    text = item,
                    selected = item == selectedItem,
                    onSelected = { onItemSelected(item) }
                )
            }
        }
    }
}

@Composable
fun ListItem(
    text: String,
    selected: Boolean,
    onSelected: () -> Unit
) {
    Box(
        modifier = Modifier
            .padding(8.dp)
            .clickable(onClick = onSelected)
            .border(
                width = 1.dp,
                color = Color.Black,
                shape = CircleShape // Use Rectangle shape
            )
            .background(if (selected) Color.LightGray else Color.Transparent)
            .padding(8.dp)
    ) {
        Row {
            Image(painter = painterResource(id = R.drawable.capsule2)  ,
                contentDescription =null,
                modifier = Modifier.size(20.dp)

                )
            Text(
                text = text,
                color = if (selected) Color.Blue else Color.Black,
                fontSize = 16.sp // Adjust font size as needed
            )
        }

    }
}
@Composable
fun LazyListWithImagesAndText() {
    LazyColumn(modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight()
        .height(295.dp)) {
        items(doctors) { doctor ->
            DoctorItem(doctor = doctor)
        }
        }
}


@Composable
fun DoctorItem(doctor: Doctor) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 30.dp, end = 30.dp, top = 8.dp, bottom = 8.dp)
        .wrapContentHeight(Alignment.CenterVertically),
        elevation = CardDefaults.cardElevation( defaultElevation = 8. dp ),
        shape = RoundedCornerShape(8.dp),
//        backgroundColor = Color.White,// TODO this does not works
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
            contentColor = Color.Black
        )
    )
        {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)) {
                Image(
                    painter = painterResource(id = doctor.imageResId),
                    contentDescription = null, // Provide content description for accessibility
                    modifier = Modifier
                        .height(70.dp)
                        .clip(RoundedCornerShape(10.dp)) // Adjust image size as needed
                )
                Spacer(modifier = Modifier.width(16.dp)) // Add spacing between image and text
                Column {
                    Text(text = doctor.name, style = MaterialTheme.typography.labelLarge)
                    Row {
                        Text(text = doctor.spec, style = MaterialTheme.typography.bodySmall)
                        Spacer(modifier = Modifier.padding(10.dp))
                        Text(text = "⚲ 650m", style = MaterialTheme.typography.bodySmall)
                    }

                    Text(text = "* * * * *   4.2|120 Reviews", style = MaterialTheme.typography.bodySmall)
                }

            }
        }
    }


@Composable
fun SquareGrid() {
       Row(
              modifier = Modifier
                  .fillMaxWidth()
                  .padding(horizontal = 16.dp),
              horizontalArrangement = Arrangement.SpaceBetween
       ) {
            SquareCard(text = "Cold", img = R.drawable.cold1)
            SquareCard(text = "Headache", img = R.drawable.headache1)
            SquareCard(text = "Digestion", img = R.drawable.stomach1)
       }
}

@Composable
fun SquareCard(
       modifier: Modifier = Modifier,
       text:String,
       img:Int
) {
       Card(
              modifier = modifier
                  .height(100.dp)
                  .width(100.dp)
                  .padding(10.dp),
           colors = CardDefaults.cardColors(
               containerColor = Color.White,
               contentColor = Color.Black
           )
       ) {
              Box(contentAlignment = Alignment.Center) {
                    Column (modifier=Modifier.padding(5.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                        ){
                        Image(painter = painterResource(id = img),
                            contentDescription =null,
                            modifier=Modifier.size(width = 50.dp, height = 50.dp)
                            )
                        Text(text = text , fontWeight = FontWeight.Bold)
                    }

              }
       }
}

@Composable
fun seeAllBtn(){
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth() // Makes the button fill the available horizontal space
            .padding(horizontal = 70.dp, vertical = 8.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            contentColor = Color.White,

        ),
        // Add some padding
        content = {
            Text(text = "See all")
        }
    )

}

