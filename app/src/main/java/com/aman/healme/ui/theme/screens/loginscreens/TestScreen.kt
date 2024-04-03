package com.aman.healme.ui.theme.screens.loginscreens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Preview
@Composable
fun TestScreen(){
    val scrollState = rememberScrollState()
    MyScrollableScreen()

}

@Composable
fun MyScrollableScreen() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        // Content that exceeds viewport height
        Text(text = "This is a long scrollable text...")
        Text(text = "More content...")
        // Additional elements as needed
    }
}