package com.hesabdar.shabnam.presentation.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MainItems(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(10.dp)) {
        Row(modifier = Modifier.fillMaxWidth()) {
            SItem(modifier = Modifier.weight(1f))
            SItem(modifier = Modifier.weight(1f))
            SItem(modifier = Modifier.weight(1f))
            SItem(modifier = Modifier.weight(1f))

        }
        Row(modifier = Modifier.fillMaxWidth()) {
            SItem(modifier = Modifier.weight(1f))
            SItem(modifier = Modifier.weight(1f))
            SItem(modifier = Modifier.weight(1f))
            SItem(modifier = Modifier.weight(1f))

        }
        Row(modifier = Modifier.fillMaxWidth()) {
            SItem(modifier = Modifier.weight(1f))
            SItem(modifier = Modifier.weight(1f))
            SItem(modifier = Modifier.weight(1f))
            SItem(modifier = Modifier.weight(1f))

        }
    }
}

@Composable
fun SItem(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(horizontal = 12.dp
                , vertical = 6.dp)
            .clip(RoundedCornerShape(16.dp))
            .clickable { }
            .background(
                Color.Black.copy(alpha = .3f),
                RoundedCornerShape(16.dp)
            )
            .padding(vertical = 6.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Icon(Icons.Default.Add, null)
        Text("Hello")
    }
}