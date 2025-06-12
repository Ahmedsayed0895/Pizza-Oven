package com.example.pizzaoven.screens

import android.text.style.EasyEditSpan
import androidx.compose.animation.core.EaseInBack
import androidx.compose.animation.core.EaseInBounce
import androidx.compose.animation.core.EaseInCirc
import androidx.compose.animation.core.EaseInOut
import androidx.compose.animation.core.EaseInOutCubic
import androidx.compose.animation.core.EaseInOutExpo
import androidx.compose.animation.core.EaseInOutQuad
import androidx.compose.animation.core.EaseInQuart
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.pizzaoven.R
import com.example.pizzaoven.composables.AddToCardButton
import com.example.pizzaoven.composables.PizzaSizeSelector
import com.example.pizzaoven.composables.PizzaSlider
import com.example.pizzaoven.composables.Price
import com.example.pizzaoven.composables.TopBar
import com.example.pizzaoven.composables.ToppingsSelector
import com.example.pizzaoven.data.breadList
import com.example.pizzaoven.data.toppingList


@Composable
 fun PizzaOvenScreen() {
     var breadSize by remember { mutableStateOf(220.dp) }
    val animatedBreadSize by animateDpAsState(
        targetValue = breadSize,
        label = "breadSizeAnimation",
        animationSpec =
        tween(durationMillis = 700, easing = EaseInOut)
    )
    Scaffold(
        topBar = {

            TopBar(
                title = "Pizza",
                navigationIcon = painterResource(R.drawable.baseline_arrow_back_24),
                actionIcon = painterResource(R.drawable.favorite_icon)
            )
        }
    ) { paddingValue ->
        LazyColumn(
            modifier = Modifier
                .padding(top = paddingValue.calculateTopPadding() - 16.dp),

            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            item {
                PizzaSlider(
                    breads = breadList,
                    breadSize = animatedBreadSize
                )
            }
            item {
                Price(
                    price = 17
                )
            }
            item {
                PizzaSizeSelector(
                    onSmallClick = { breadSize = 220.dp },
                    onMediumClick = { breadSize = 250.dp },
                    onLargeClick = { breadSize = 270.dp }

                )
            }
            item {
                Text(
                    text = "Customize your pizza",
                    color = Color.LightGray,
                    fontWeight = FontWeight.W700,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                )
            }

            item {
                ToppingsSelector(
                    toppings = toppingList
                )
            }
            item {
                AddToCardButton(
                    onClick = {},
                    buttonColor = Color(0xFF423331),
                    contentColor = Color.White,

                    )
            }

        }

    }
}