package com.hesabdar.shabnam.presentation.home

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.hesabdar.shabnam.presentation.home.component.HomeTopApp

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Scaffold(topBar = { HomeTopApp() }) {
        Box(
            modifier = modifier
                .fillMaxSize()
                .background(Color.Blue)
        )
    }
}

