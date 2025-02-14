package com.hesabdar.shabnam.presentation.mainActivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hesabdar.shabnam.presentation.home.HomeScreen
import com.hesabdar.shabnam.presentation.navigation.Navigation
import com.hesabdar.shabnam.presentation.splash.SplashScreen
import com.hesabdar.shabnam.presentation.theme.ShabnamComposeTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.serialization.Serializable

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @ExperimentalMaterial3Api
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShabnamComposeTheme {
                val navController = rememberNavController()
                var selectedItemIndex by rememberSaveable { mutableIntStateOf(0) }
                Scaffold(bottomBar = { Navigation(selectedItemIndex) { selectedItemIndex = it } }) {
                    NavHost(
                        modifier = Modifier.padding(it),
                        navController = navController,
                        startDestination = SplashScreen
                    ) {
                        composable<HomeScreen> { HomeScreen() }
                        composable<SplashScreen> {
                            SplashScreen {
                                navController.navigate(
                                    HomeScreen
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}


// route

@Serializable
data object HomeScreen

@Serializable
data object SplashScreen
