package com.example.pizzaoven.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
 fun ToppingsSelector(
    modifier: Modifier = Modifier,
    toppings: List<Int>,
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(48.dp),
        contentPadding = PaddingValues(24.dp)
    ) {
        items(toppings.size) {
            Box(
                modifier = modifier
            ) {
                Image(
                    painter = painterResource(toppings[it]),
                    contentDescription = "toppings",
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)
                        .clickable {  }
                        .padding(12.dp)
                )
            }
        }
    }
}