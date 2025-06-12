package com.example.pizzaoven.composables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


@Composable
 fun Price(
    modifier: Modifier = Modifier,
    price: Int
) {
    Text(
        modifier = modifier,
        text = "$$price",
        color = Color.Black,
        fontWeight = FontWeight.W700,
        fontSize = 32.sp
    )
}