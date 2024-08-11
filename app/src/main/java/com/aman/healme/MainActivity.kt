package com.aman.healme



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.aman.healme.onboard.OnboardingScreenFinal
import com.aman.healme.onboard.OnboardingUtils
import com.aman.healme.ui.theme.HealMeTheme
import com.aman.healme.ui.theme.screens.App
import com.aman.healme.viewmodels.AuthViewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()

        enableEdgeToEdge()
        val authViewModel :AuthViewModel by viewModels()
        setContent {
            HealMeTheme {
            Surface(color = MaterialTheme.colorScheme.background) {
                if (OnboardingUtils.isOnboardingComplete(this)){
                    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        App(modifier = Modifier.padding(innerPadding),
                            authViewModel = authViewModel,
                            )

                    }
                } else{
                    ShowOnboardingScreen()
                }
            }

            }
        }
    }
}

@Composable
private fun ShowOnboardingScreen(){
    val context = LocalContext.current
    Box(modifier = Modifier.background(color = MaterialTheme.colorScheme.background)){
        OnboardingScreenFinal() {
//            Toast.makeText(context,"Onboarding complete", Toast.LENGTH_LONG).show()

        }
    }
}


