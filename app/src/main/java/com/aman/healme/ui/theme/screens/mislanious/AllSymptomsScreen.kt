package com.aman.healme.ui.theme.screens.mislanious

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.aman.healme.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AllSymptomsScreen (){
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Spacer(modifier = Modifier.weight(1f))
                    Text(text = "Symptoms")
                    Spacer(modifier = Modifier.weight(1f))
                }
            },
                navigationIcon = {
                    IconButton(onClick = { /* Handle left button click */ }) {
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
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(5.dp),
                contentAlignment = Alignment.TopCenter
            ) {
                Column {
                    //TODO Code the page content here
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 10.dp, vertical = 3.dp)
                            .height(IntrinsicSize.Min),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.Top
                    ) {
                        Text(
                            text = "Search by speciality",
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
                    
                    ImageCircleTextGrid(items = symcard)


                }
            }









        }
    }
}

@Preview
@Composable
fun Prev(){
    AllSymptomsScreen()
}

@Composable
fun ImageTextCard(img: Int, text: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(8.dp) // Set card corner radius
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            // Image on the left
            Box(modifier = Modifier
                .size(10.dp)
                .background(Color.Gray)
            ){
                Image(painter = painterResource(id = img), contentDescription = null)
            }
            Spacer(modifier = Modifier.width(16.dp)) // Add spacing between image and text
            Text(text = text, style = MaterialTheme.typography.bodyLarge)
        }
    }
}

@Composable
fun SympCard(
    img: Int,
    text: String,
    circleColor: Color = Color.Gray,
    cornerRadius: Dp = 8.dp
) {
    Card(
        modifier = Modifier
            .wrapContentWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(modifier = Modifier.wrapContentWidth()) {
            // Gray circle with image on top (placed within a Box)
            Box(
                modifier = Modifier
                    .size(56.dp)
                    .background(Color.Gray, shape = CircleShape)

            ) {
                Image(
                    painter = painterResource(id = img),
                    contentDescription = null, // Provide content description for accessibility
                    modifier = Modifier.fillMaxSize()
                )
            }
            Spacer(modifier = Modifier.width(16.dp)) // Add spacing between circle and text
            Text(text = text, style = MaterialTheme.typography.bodyLarge)
        }
    }
}

@Composable
fun ImageCircleTextGrid(
    items: List<SymCardData>,
    circleColor: Color = Color.Gray,
    cornerRadius: Dp = 8.dp
) {

    LazyVerticalGrid( // Change to LazyHorizontalGrid for horizontal scrolling
        columns = GridCells.Fixed(2),
        modifier = Modifier.size(600.dp),
        content = {
            items(items.size) { index ->
                //
                val item = items[index]
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    shape = RoundedCornerShape(cornerRadius)
                ) {
                    Row(modifier = Modifier.fillMaxWidth().padding(2.dp)) {
                        // Gray circle with image on top (placed within a Box)
                        Box(
                            modifier = Modifier
                                .size(65.dp)
                                .background(circleColor, shape = CircleShape)

                        ) {
                            Image(
                                painter = painterResource(id = item.img),
                                contentDescription = item.text, // Provide content description for accessibility
                                modifier = Modifier.fillMaxSize().padding(10.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(16.dp)) // Add spacing between circle and text
                        Text(text = item.text, style = MaterialTheme.typography.bodyLarge)
                    }
                }
            }
        }
    )
}

data class SymCardData(
    val img: Int,
    val text: String
)

val symcard= listOf(
    SymCardData(R.drawable.womenshealth,"Women's Health"),
    SymCardData(R.drawable.skincare,"Skin & Hair"),
    SymCardData(R.drawable.childspecialist,"Child Specialist"),
    SymCardData(R.drawable.generalphysician1,"General Physician"),
    SymCardData(R.drawable.dentalcare,"Dental Care"),
    SymCardData(R.drawable.earthroatnose,"Ear Nose Throat"),
    SymCardData(R.drawable.boanandjoint,"Bone & Joints"),
    SymCardData(R.drawable.mentalwellness,"Mental Wellness"),
    SymCardData(R.drawable.heartsurgery1,"Heart Surgery"),
    SymCardData(R.drawable.lungs1,"Lungs"),
    SymCardData(R.drawable.digestion1,"Digestion"),
    SymCardData(R.drawable.kidneyandurinarytract1,"Kidney & Urinary Tract"),
    SymCardData(R.drawable.dietitian2,"Dietitian"),
    SymCardData(R.drawable.eye1,"Eye")
)






