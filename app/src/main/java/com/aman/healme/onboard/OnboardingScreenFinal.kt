package com.aman.healme.onboard

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.google.accompanist.pager.ExperimentalPagerApi
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.google.android.gms.common.api.Scope
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class, ExperimentalFoundationApi::class)
@Composable
fun OnboardingScreenFinal(onFinished:()->Unit) {

    val pages = listOf(OnboardingModel.FirstPage,OnboardingModel.SecondPage,OnboardingModel.ThirdPage,OnboardingModel.FourthPage)
    val pagerState = rememberPagerState(initialPage = 0){
        pages.size
    }
    val scope = rememberCoroutineScope()

    val buttonState = remember {
        derivedStateOf{
            when(pagerState.currentPage){
                0-> listOf("Skip","Next")
                1-> listOf("Skip","Next")
                2-> listOf("Skip","Next")
                3-> listOf("Start","Start")
                else-> listOf("" , "")
            }
        }
    }


    Scaffold(
        bottomBar = {
        Row(
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .padding(10.dp, 10.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            ButtonUi(
                text = buttonState.value[1],
                backgroundColor = MaterialTheme.colorScheme.primary,
                textColor = MaterialTheme.colorScheme.onPrimary
            ){
                scope.launch{
                    if (pagerState.currentPage<pages.size-1){
                        pagerState.animateScrollToPage(pagerState.currentPage+1)
                    }else{
                        onFinished()
                    }
                }
            }
        }
    },
        content = {
            Column {
                Row(
                    modifier = androidx.compose.ui.Modifier
                        .fillMaxWidth()
                        .padding(10.dp, 5.dp),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    ButtonUi(
                        text = buttonState.value[0],
                        backgroundColor = Color.Transparent,
                        textColor = Color.Black,
                        textStyle = MaterialTheme.typography.bodySmall,
                        fontSize = 13
                    ){}


                }
                HorizontalPager(state = pagerState) {index ->
                    OnBoardingGraphUI(onboardingModel = pages[index])
                }
                Spacer(modifier = Modifier.size(20.dp))
                    Row(
                        modifier = androidx.compose.ui.Modifier
                            .fillMaxWidth()
                            .padding(10.dp, 5.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IndicatorUI(pageSize = pages.size, currentPage = pagerState.currentPage)
                    }



            }
        }
    )




}

@Preview(showBackground = true)
@Composable
fun OnBoardingScreenPreview(){
    OnboardingScreenFinal{

    }
}