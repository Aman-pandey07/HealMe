package com.aman.healme.ui.theme.screens.onboardingscreen

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.aman.healme.R
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch


data class OnboardingPage(

    @DrawableRes val res:Int,
    val title: String,
    val description: String,
)



fun getList():List<OnboardingPage> {
    return listOf(
        OnboardingPage(
            R.drawable.splashimg01,
            "Find the best Doctor near you",
            "With the help of our algorithms now locate the best doctors around your vicinity at total ease."

        ),
        OnboardingPage(
            R.drawable.splashimg02,
            "Find the best Doctor near you",
            "With the help of our algorithms now locate the best doctors around your vicinity at total ease."

        ),
        OnboardingPage(
            R.drawable.splashimg03,
            "Find the best Doctor near you",
            "With the help of our algorithms now locate the best doctors around your vicinity at total ease."

        ),
        OnboardingPage(
            R.drawable.splashimg04,
            "Find the best Doctor near you",
            "With the help of our algorithms now locate the best doctors around your vicinity at total ease."

        )
    )
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun IntroScreen(navController: NavController) {
    val pagerState = rememberPagerState()
    val list = getList()
    val scope = rememberCoroutineScope()
    var currentPage by remember { mutableStateOf(0) }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        //Skip Button
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .align(Alignment.Start),
            horizontalArrangement = Arrangement.End
        ) {
            TextButton(
                onClick = { navController.navigate("PhoneNumber") },
                modifier = Modifier
                    .size(100.dp, 50.dp),
//                    .align(Alignment.End),
                contentPadding = PaddingValues(0.dp), // Remove default padding
                colors = ButtonDefaults.textButtonColors(contentColor = Color.Black),
                content = { Text("SKIP") }
            )

        }
        //Image and text
        Row(
            modifier = Modifier
                .fillMaxHeight(.75f)
                .fillMaxWidth()
        ) {
            HorizontalPager(count = list.size, state = pagerState) {

                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = list[currentPage].res),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .aspectRatio(1f)
                        )
                        Text(
                            text = list[currentPage].title,
                            style = MaterialTheme.typography.titleMedium
                        )
                        Spacer(
                            modifier = Modifier.height(10.dp)
                        )
                        Text(
                            text = list[currentPage].description,
                            style = MaterialTheme.typography.bodyMedium,
                            modifier = Modifier.fillMaxWidth(0.8f).weight(1f)
                        )
                    }
                }


            }
            //Progress Indicator
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                HorizontalPagerIndicator(
                    pagerState = pagerState,
//                modifier = Modifier.padding(10.dp)
                )
            }
            //Next Button
            Row(verticalAlignment = Alignment.CenterVertically) {
                Button(
                    onClick = {
                        if (pagerState.currentPage < 3) {
                            scope.launch {
                                pagerState.animateScrollToPage(pagerState.currentPage + 1)
                            }
                        } else {
                            navController.navigate("PhoneNumber")
                        }

                    }, modifier = Modifier
                        .size(50.dp)
                        .padding(),
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(contentColor = Color.Red),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Icon(
                        imageVector = Icons.Filled.ArrowForward,
                        contentDescription = null,
                        modifier = Modifier.size(24.dp), // Adjust the icon size as needed
                        tint = Color.Black
                    )

                }
            }
        }
    }



