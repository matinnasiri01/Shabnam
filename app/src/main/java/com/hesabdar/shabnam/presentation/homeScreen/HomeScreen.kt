package com.hesabdar.shabnam.presentation.homeScreen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Text(modifier = modifier.fillMaxWidth(), text ="سلام")
}