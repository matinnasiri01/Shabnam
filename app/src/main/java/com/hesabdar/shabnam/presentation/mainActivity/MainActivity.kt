package com.hesabdar.shabnam.presentation.mainActivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hesabdar.shabnam.R
import com.hesabdar.shabnam.presentation.homeScreen.HomeScreen
import com.hesabdar.shabnam.presentation.theme.ShabnamComposeTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.serialization.Serializable

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShabnamComposeTheme {

                val navController = rememberNavController()
                var selectedItemIndex by rememberSaveable { mutableIntStateOf(0) }

                Scaffold(bottomBar = {
                    NavigationBar {

                        items.forEachIndexed { index, item ->

                            NavigationBarItem(selected = index == selectedItemIndex,
                                onClick = {
                                    selectedItemIndex = index
                                    navController.navigate(item.des)
                                },
                                icon = { Icon(imageVector = item.selectedIcon, null) },
                                label = { Text(getString(item.label)) })
                        }
                    }
                }) { p ->
                    NavHost(
                        modifier = Modifier.padding(p),
                        navController = navController,
                        startDestination = Screens.HomeScreen
                    ) {
                        composable<Screens.HomeScreen> { HomeScreen() }
                    }
                }
            }
        }
    }
}

// navigation bar

data class BottomNavigationBar(
    @StringRes val label: Int, val selectedIcon: ImageVector, val des: Screens
)

val items = listOf(
    BottomNavigationBar(R.string.bn_dashboard, Icons.Default.Create, Screens.HomeScreen),
    BottomNavigationBar(R.string.bn_contacts, Icons.Default.Create, Screens.HomeScreen),
    BottomNavigationBar(R.string.bn_stockroom, Icons.Default.Create, Screens.HomeScreen),
    BottomNavigationBar(R.string.bn_accounts, Icons.Default.Create, Screens.HomeScreen),
)

// route
sealed class Screens {
    @Serializable
    data object HomeScreen : Screens()

}