package com.aman.healme.onboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aman.healme.R

@Composable
fun IndicatorUI(
    pageSize:Int,
    currentPage:Int,
    coloredSym:Int = R.drawable.indicatorcolored,
    unColoredSym:Int=R.drawable.indicatornoncolored,
    ) {
    Row (horizontalArrangement = Arrangement.SpaceBetween){
        repeat(pageSize){
            Spacer(modifier = Modifier.size(2.5.dp))
            Box(modifier = Modifier
                .height(30.dp)
                .width(30.dp)
                .background(Color.White)
            ){
                if (it<=currentPage){
                    Image(painter = painterResource(id = coloredSym), contentDescription = null)
                }else{
                    Image(painter = painterResource(id = unColoredSym), contentDescription = null)
                }

            }
            Spacer(modifier = Modifier.size(2.5.dp))


        }
    }

}




@Preview(showBackground = true)
@Composable
fun IndicatorUIPreview1(){
IndicatorUI(pageSize = 4, currentPage = 0)
}

@Preview(showBackground = true)
@Composable
fun IndicatorUIPreview2(){
    IndicatorUI(pageSize = 4, currentPage = 1)
}

@Preview(showBackground = true)
@Composable
fun IndicatorUIPreview3(){
    IndicatorUI(pageSize = 4, currentPage = 2)
}

@Preview(showBackground = true)
@Composable
fun IndicatorUIPreview4(){
    IndicatorUI(pageSize = 4, currentPage = 3)
}