package com.hesabdar.shabnam.presentation.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import com.hesabdar.shabnam.R

@Composable
fun Navigation(selectedItemIndex: Int, onClick: (index: Int) -> Unit) {
    NavigationBar {
        items.forEachIndexed { i, item ->
            NavigationBarItem(selected = i == selectedItemIndex,
                onClick = { onClick(i) },
                icon = { Icon(item.selectedIcon, null) },
                label = { Text(stringResource(item.label)) })
        }
    }
}


data class BottomNavigationBarItem(
    @StringRes val label: Int,
    val selectedIcon: ImageVector
)

val items = listOf(
    BottomNavigationBarItem(R.string.bn_dashboard, Icons.Default.Create),
    BottomNavigationBarItem(R.string.bn_contacts, Icons.Default.Create),
    BottomNavigationBarItem(R.string.bn_stockroom, Icons.Default.Create),
    BottomNavigationBarItem(R.string.bn_accounts, Icons.Default.Create),
)