package com.aman.healme.onboard

import androidx.annotation.DrawableRes
import com.aman.healme.R

sealed class OnboardingModel (
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String,
){

    data object FirstPage:OnboardingModel(
         image = R.drawable.splashimg01,
         title ="Find the best Doctor near you" ,
         description ="With the help of our algorithms now locate the best doctors around your vicinity at total ease."
    )

    data object SecondPage:OnboardingModel(
        image = R.drawable.splashimg02,
        title = "Schedule appointments with expert doctors",
        description = "Find experienced specialist doctors with expert ratings and reviews and book your appointments hassle-free."
    )


    data object ThirdPage:OnboardingModel(
        image =R.drawable.splashimg03 ,
        title ="Get best offer for your next appointment",
        description ="Get addicted to memes and comic content for a light-hearted take on daily events.Toggle between feeds to alternate between serious and fun content."
    )

    data object FourthPage:OnboardingModel(
        image = R.drawable.splashimg04,
        title ="Documents",
        description ="Maintain all the prescription, Reports and invoice at one place."
    )
}