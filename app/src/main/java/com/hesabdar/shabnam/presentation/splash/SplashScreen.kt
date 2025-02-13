package com.hesabdar.shabnam.presentation.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.hesabdar.shabnam.domain.utils.SplashScreenDelay
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

@Composable
fun SplashScreen(modifier: Modifier = Modifier, overTime: () -> Unit) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Green.copy(.3f))
    ) {
        runBlocking {
            delay(SplashScreenDelay)
            overTime()
        }
    }
}