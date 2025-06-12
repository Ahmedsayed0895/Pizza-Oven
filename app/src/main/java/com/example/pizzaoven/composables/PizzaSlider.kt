package com.example.pizzaoven.composables

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.pizzaoven.R
import com.example.pizzaoven.data.breadList

@OptIn(ExperimentalFoundationApi::class)
@Composable
 fun PizzaSlider(
    modifier: Modifier = Modifier,
    breads: List<Int>,
    breadSize:Dp
) {
     val state = rememberLazyListState()
    val snapFling = rememberSnapFlingBehavior(state)
    Box(
        contentAlignment = Alignment.Center,
    ) {
        Image(
            painter = painterResource(R.drawable.plate),
            contentDescription = "pizza plate",
            modifier = modifier.padding(48.dp)
        )
        LazyRow(
            state = state,
            flingBehavior = snapFling
        ) {
            items(
                count = breadList.size,
            ) { index ->
                Box(
                    modifier = Modifier
                        .width(408.dp),
                    contentAlignment = Alignment.Center

                ) {

                    Box(modifier = Modifier
                        .size(breadSize)) {
                        Image(
                            painter = painterResource(breads[index]),
                            contentDescription = "bread",
                            modifier = Modifier
                                .fillMaxSize()

                        )
                       Image(
                           painter = painterResource(R.drawable.all_basil),
                           contentDescription = "basil",
                           modifier = Modifier
                               .fillMaxSize()
                       )
                        Image(
                            painter = painterResource(R.drawable.all_onion),
                            contentDescription = "basil",
                            modifier = Modifier
                                .fillMaxSize()
                        )
                        Image(
                            painter = painterResource(R.drawable.all_sausage),
                            contentDescription = "basil",
                            modifier = Modifier
                                .fillMaxSize()
                        )
                        Image(
                            painter = painterResource(R.drawable.all_broccoli),
                            contentDescription = "basil",
                            modifier = Modifier
                                .fillMaxSize()
                        )
                        Image(
                            painter = painterResource(R.drawable.all_mashroom),
                            contentDescription = "basil",
                            modifier = Modifier
                                .fillMaxSize()
                        )
                    }
                }
            }
        }

    }
}