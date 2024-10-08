package com.aman.healme.ui.theme.screens.homescreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aman.healme.R
import com.aman.healme.ui.theme.data_class.doctors

@Composable
fun HorizontalListWithSingleSelection(
    items: List<String>,
    selectedItem: String?,
    onItemSelected: (String) -> Unit
) {
    val categories = doctors.map { it.spec }.distinct()
    var selectedCategory by remember { mutableStateOf(items.firstOrNull() ?: "") }
    var selectedItem by remember { mutableStateOf(categories.first()) }
    LazyRow(
        modifier = Modifier.padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items.forEach { category ->
            item {
                ListItem(
                    text = category,
                    selected = category == selectedCategory,
                    onSelected = {
                        selectedCategory = category
                        onItemSelected(category)
                    }

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
                width = if (selected) 2.dp else 1.dp,
                color = if (selected) Color.Blue else Color.Black,
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



