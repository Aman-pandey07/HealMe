package com.aman.healme.ui.theme.screens.homescreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.aman.healme.ui.theme.data_class.Doctor
import com.aman.healme.ui.theme.data_class.doctors

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