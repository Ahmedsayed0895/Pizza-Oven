package com.example.pizzaoven.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
 fun PizzaSizeSelector(
    modifier: Modifier = Modifier,
    pizzaSize:List<String>,
) {
    LazyRow (
        modifier = modifier
            .width(200.dp)
            .padding(top = 28.dp, bottom = 32.dp),
        horizontalArrangement = Arrangement.SpaceAround

    ) {
        items(pizzaSize.size){index->
            Text(
                text = pizzaSize[index],
                color = Color.Black,
                fontWeight = FontWeight.W400,
                fontSize = 24.sp
            )
        }


    }
}
