package com.hesabdar.shabnam.presentation.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hesabdar.shabnam.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeTopApp(modifier: Modifier = Modifier) {
    TopAppBar(modifier = modifier, title = {
        Text(
            text = stringResource(R.string.hs_free),
            fontSize = 16.sp,
            modifier = Modifier
                .clip(RoundedCornerShape(26.dp))
                .background(Color.Blue.copy(.3f))
                .border(1.dp, Color.Black, RoundedCornerShape(26.dp))
                .clickable { }
                .padding(horizontal = 12.dp, vertical = 8.dp)
        )
    }, navigationIcon = {
        IconButton({ }) {
            Icon(Icons.Default.Menu, null)
        }
    }, actions = {
        IconButton({ }) {
            Icon(painterResource(R.drawable.ic_helper), null)
        }
    }
    )
}