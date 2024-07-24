package com.aman.healme.ui.theme.screens.homescreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

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