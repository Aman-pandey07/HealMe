package com.aman.healme.ui.theme.screens.homescreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.aman.healme.R

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
            Column (modifier= Modifier.padding(5.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Image(painter = painterResource(id = img),
                    contentDescription =null,
                    modifier= Modifier.size(width = 50.dp, height = 50.dp)
                )
                Text(text = text , fontWeight = FontWeight.Bold)
            }

        }
    }
}