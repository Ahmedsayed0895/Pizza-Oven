package com.example.pizzaoven.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pizzaoven.R
import com.example.pizzaoven.data.breadList

@Composable
 fun PizzaSlider(
    modifier: Modifier = Modifier,
    breads: List<Int>,
) {
    Box(
        contentAlignment = Alignment.Center,
    ) {
        Image(
            painter = painterResource(R.drawable.plate),
            contentDescription = "pizza plate",
            modifier = modifier.padding(48.dp)
        )
        LazyRow(
            contentPadding = PaddingValues(82.dp),
            horizontalArrangement = Arrangement.spacedBy(82.dp)
        ) {
            items(
                count = breadList.size,
            ) { index ->
                Box(
                    modifier = Modifier
                        .fillMaxWidth()

                ) {

                    Image(
                        painter = painterResource(breads[index]),
                        contentDescription = "bread",
                        modifier = Modifier.size(250.dp)

                    )
                }
            }
        }

    }
}