package com.hesabdar.shabnam.presentation.persons.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.hesabdar.shabnam.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PersonsTopApp(modifier: Modifier = Modifier) {
    TopAppBar(modifier = modifier, title = {
        Text(
            text = stringResource(R.string.ps_side_of_accounts),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
    }, navigationIcon = {
        IconButton({ }) {
            Icon(Icons.Default.MoreVert, null)
        }
    }, actions = {
        IconButton({ }) {
            Icon(Icons.Default.Search, null)
        }
    })
}