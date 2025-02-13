package com.hesabdar.shabnam.presentation.home

import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.hesabdar.shabnam.R

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    var selectedItemIndex by rememberSaveable { mutableIntStateOf(0) }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Red)
    )

}

// navigation bar

data class BottomNavigationBar(
    @StringRes val label: Int, val selectedIcon: ImageVector,
)

val items = listOf(
    BottomNavigationBar(R.string.bn_dashboard, Icons.Default.Create),
    BottomNavigationBar(R.string.bn_contacts, Icons.Default.Create),
    BottomNavigationBar(R.string.bn_stockroom, Icons.Default.Create),
    BottomNavigationBar(R.string.bn_accounts, Icons.Default.Create),
)