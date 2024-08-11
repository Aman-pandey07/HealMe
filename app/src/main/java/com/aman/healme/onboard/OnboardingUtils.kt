package com.aman.healme.onboard

import android.content.Context



class OnboardingUtils(private val context: Context) {


        fun isOnboardingComplete():Boolean{
            return context.getSharedPreferences("onboarding", Context.MODE_PRIVATE)
                .getBoolean("completed",false)
        }




    fun setOnboardingComplete(){
        context.getSharedPreferences("onboarding",Context.MODE_PRIVATE)
            .edit()
            .putBoolean("complete",true)
            .apply()
    }

    companion object {
        fun isOnboardingComplete(context: Context): Boolean {
            return context.getSharedPreferences("onboarding", Context.MODE_PRIVATE)
                .getBoolean("completed",false)
        }


    }
}