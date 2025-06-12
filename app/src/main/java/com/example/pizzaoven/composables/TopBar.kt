package com.example.pizzaoven.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun TopBar(
    modifier: Modifier = Modifier,
    title: String,
    navigationIcon: Painter,
    actionIcon: Painter
) {
    CenterAlignedTopAppBar(
        modifier = modifier
            .padding(horizontal = 12.dp),
        title = {
            Text(
                text = title,
                color = Color.Black,
                fontWeight = FontWeight.W700
            )
        },
        navigationIcon = {
            Icon(
                navigationIcon,
                contentDescription = "Back"
            )
        },
        actions = {
            Icon(
                painter = actionIcon,
                contentDescription = "More",
                tint = Color.Black
            )
        }

    )
}