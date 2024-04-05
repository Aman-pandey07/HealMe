package com.aman.healme.ui.theme.screens.homescreens



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.List
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aman.healme.R
import com.aman.healme.ui.theme.screens.loginscreens.AppHeader




data class BottomNavigationItem(
       val title : String,
       val selectedIcon: ImageVector,
       val unselectedIcon :ImageVector,
       val hasNews : Boolean,
       val badgeCount :Int? =null
)



val imageList = listOf(R.drawable.image1, R.drawable.image1, R.drawable.image1)

data class Doctor(val name:String)

val dummyDocData = listOf(
       Doctor("Smith"),
       Doctor("Johnson"),
       Doctor("Brown"),
       Doctor("Miller"),
       Doctor("Jones"),
       Doctor("Jones"),
       Doctor("Jones"),
       Doctor("Jones"),
)







@Composable
fun HomeScreen(){

       val items = listOf(
              BottomNavigationItem(
                     title = "Home",
                     selectedIcon = Icons.Default.Home ,
                     unselectedIcon = Icons.Outlined.Home,
                     hasNews = false,

                     ),
              BottomNavigationItem(
                     title = "Appointment",
                     selectedIcon = Icons.Default.DateRange ,
                     unselectedIcon = Icons.Outlined.DateRange,
                     hasNews = false,

                     ),
              BottomNavigationItem(
                     title = "Upload",
                     selectedIcon = Icons.Default.List ,
                     unselectedIcon = Icons.Outlined.List,
                     hasNews = false,

                     ),
              BottomNavigationItem(
                     title = "Account",
                     selectedIcon = Icons.Default.AccountCircle ,
                     unselectedIcon = Icons.Outlined.AccountCircle,
                     hasNews = false,

                     ),
       )

       var selectedItemIndex by rememberSaveable {
              mutableStateOf(0)
       }

       Scaffold(
              topBar = {
                     AppHeader("HEAL-ME") {
                           // navController.navigateUp() // Example usage with NavController
                     }
              },
              bottomBar = {
                     NavigationBar {
                            items.forEachIndexed{index, item ->
                                   NavigationBarItem(
                                          selected = selectedItemIndex == index,
                                          onClick = {
                                                    selectedItemIndex= index
                                                 // TODO Navigate //navController.navigate(item.title)
                                                    },
                                          icon = {  if (selectedItemIndex == index) {
                                                 Icon(item.selectedIcon, contentDescription = item.title) // Use selected icon
                                          } else {
                                                 Icon(item.unselectedIcon, contentDescription = item.title) // Use unselected icon
                                          } })
                            }
                     }
              }

       ) {value ->
              // TODO content

              val scrollState = rememberScrollState()

              Column (modifier = Modifier
                     .fillMaxSize()
                     .padding()
                     .verticalScroll(rememberScrollState())
                     .background(Color.White),
                     verticalArrangement = Arrangement.Top,
                     horizontalAlignment = Alignment.CenterHorizontally
              ){

                     Card(
                            modifier = Modifier
                                   .fillMaxWidth()
                                   .padding(value)
                                   .background(Color.White),
                     ) {
//                            SearchBar(value = "Search a Doctor or a Health issue", onValueChange = {})

                     }
                     SimpleCarousel(imageList) { index ->
                            // Handle image click here based on the index
                     }
                     Row(
                            modifier = Modifier
                                   .fillMaxWidth()
                                   .padding(horizontal = 16.dp, vertical = 8.dp)
                                   .height(IntrinsicSize.Min), // Ensure thin row height
                            horizontalArrangement = Arrangement.SpaceBetween
                     ) {
                            Text(
                                   text = "Let’s find your doctor",
                                   style = MaterialTheme.typography.bodyMedium, // Material 3 typography
                                   modifier = Modifier.weight(1f)
                            )
                            TextButton(
                                   onClick = { },
                                   colors = ButtonDefaults.textButtonColors(
                                          contentColor = MaterialTheme.colorScheme.onSurface // Consistent text color
                                   ),
                                   contentPadding = PaddingValues(0.dp), // Remove default padding
                                   elevation = null, // Remove elevation for a truly flat button
                                   // Use Material 3 OutlinedButton for a more distinct button style:
                                   // style = OutlinedButtonDefaults.outlinedButtonStyle()
                            ) {
                                   Text(
                                          text = "See all",
                                          style = MaterialTheme.typography.bodyMedium
                                   )
                            }
                     }
                            Row(
                                   modifier = Modifier
                                          .fillMaxWidth()
                                          .padding(horizontal = 16.dp, vertical = 8.dp)
                                          .height(IntrinsicSize.Min), // Ensure thin row height
                                   horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                   Text(text = "What are your Symptoms",
                                          style = MaterialTheme.typography.bodyMedium, // Material 3 typography
                                          modifier = Modifier.weight(1f))
                                   TextButton(
                                          onClick = {  },
                                          colors = ButtonDefaults.textButtonColors(
                                                 contentColor = MaterialTheme.colorScheme.onSurface // Consistent text color
                                                               ),
                                          contentPadding = PaddingValues(0.dp), // Remove default padding
                                          elevation = null, // Remove elevation for a truly flat button
                                          // Use Material 3 OutlinedButton for a more distinct button style:
                                          // style = OutlinedButtonDefaults.outlinedButtonStyle()
                                          ) {
                                          Text(text = "See all", style = MaterialTheme.typography.bodyMedium)
                                   }
                            }
                            SquareGrid()
                            SquareGrid()
                            SquareGrid()
                     SquareGrid()
                     SquareGrid()
                     SquareGrid()
                     SquareGrid()
                     SquareGrid()
                     SquareGrid()
                     SquareGrid()
                     SquareGrid()



              }
       }
}







@Preview
@Composable
fun MyViewPreview() {
       HomeScreen( )
}

@Composable
fun SearchBar(
       value: String,
       onValueChange: (String) -> Unit,
       modifier: Modifier = Modifier
              .fillMaxWidth()
              .padding(horizontal = 25.dp),
) {
       OutlinedTextField(
              value = value,
              onValueChange = onValueChange,
              modifier = modifier.padding(end = 16.dp),
              leadingIcon = { Icon(Icons.Default.Search, contentDescription = "Search") }
       )
}

@Composable
fun SimpleCarousel(images : List<Int>, onClick:(Int) -> Unit ){
       LazyRow(modifier = Modifier
              .fillMaxWidth()
              .height(150.dp)
              .offset(y = 0.dp)
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
fun SquareGrid() {
       Row(
              modifier = Modifier
                     .fillMaxWidth()
                     .padding(horizontal = 16.dp),
              horizontalArrangement = Arrangement.SpaceBetween
       ) {
              repeat(3) {
                     SquareCard(
                            modifier = Modifier.weight(1f) // Equal width for each square
                     )
              }
       }
}

@Composable
fun SquareCard(
       modifier: Modifier = Modifier
) {
       Card(
              modifier = modifier
                     .height(100.dp) // Set desired height for the square
                     .width(100.dp) // Set desired width for the square
                     .background(Color.LightGray)
                     .padding(6.dp)// Set background color
       ) {
              // Add content inside the square here (optional)
              Box(contentAlignment = Alignment.Center) {
                     Image(painter = painterResource(id = R.drawable.image1), contentDescription =null)
                     Text(text = "Square ", fontWeight = FontWeight.Bold) // Example content
              }
       }
}

