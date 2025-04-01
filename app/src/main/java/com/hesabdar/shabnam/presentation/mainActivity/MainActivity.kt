package com.hesabdar.shabnam.presentation.mainActivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.hesabdar.shabnam.presentation.fab.Fab
import com.hesabdar.shabnam.presentation.home.HomeScreen
import com.hesabdar.shabnam.presentation.home.component.HomeTopApp
import com.hesabdar.shabnam.presentation.navigation.Navigation
import com.hesabdar.shabnam.presentation.persons.PersonsScreen
import com.hesabdar.shabnam.presentation.persons.component.PersonsTopApp
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
                App()
            }
        }
    }
}


@Composable
fun App(modifier: Modifier = Modifier) {


    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination?.route?.split(".")?.last()
    var selectedItemIndex by rememberSaveable { mutableIntStateOf(0) }


    Scaffold(topBar = {

        if (currentDestination == "HomeScreen") HomeTopApp()
        if (currentDestination == "PersonsScreen") PersonsTopApp()

    }, bottomBar = {
        if (currentDestination in bottomNav) Navigation(selectedItemIndex = selectedItemIndex,
            onClick = { selectedItemIndex = it })
    }, floatingActionButton = {
        if (currentDestination in bottomFab) Fab()
    }) {
        NavHost(
            modifier = modifier.padding(it),
            navController = navController,
            startDestination = SplashScreen
        ) {
            composable<HomeScreen> { HomeScreen() }
            composable<PersonsScreen> { PersonsScreen() }
            composable<SplashScreen> { SplashScreen { navController.navigate(PersonsScreen) } }

        }
    }
}

fun <T> List<T>.toStr() = this.map { it.toString() }
val bottomNav = listOf(HomeScreen, PersonsScreen).toStr()
val bottomFab = listOf(PersonsScreen).toStr()

// route
@Serializable
data object HomeScreen

@Serializable
data object SplashScreen

@Serializable
data object PersonsScreen
