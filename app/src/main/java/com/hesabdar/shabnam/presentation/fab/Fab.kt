package com.hesabdar.shabnam.presentation.fab

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Fab(modifier: Modifier = Modifier) {
    FloatingActionButton(onClick = {}, modifier = modifier) {
        Icon(Icons.Default.Add, null)
    }
}