package com.example.pizzaoven

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pizzaoven.composables.TopBar
import com.example.pizzaoven.data.breadList
import com.example.pizzaoven.data.toppingList
import com.example.pizzaoven.ui.theme.PizzaOvenTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PizzaOvenTheme {
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
                            .padding( top = paddingValue.calculateTopPadding()-16.dp),

                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        item {
                            Box(
                                contentAlignment = Alignment.Center,
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.plate),
                                    contentDescription = "pizza plate",
                                    modifier = Modifier.padding(48.dp)
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
                                                painter = painterResource(breadList[index]),
                                                contentDescription = "pizza plate",
                                                modifier = Modifier.size(250.dp)

                                            )
                                        }
                                    }
                                }

                            }
                        }
                        item {
                            Text(
                                text = "$17",
                                color = Color.Black,
                                fontWeight = FontWeight.W700,
                                fontSize = 32.sp
                            )
                        }
                        item {
                            Row(
                                modifier = Modifier
                                    .width(200.dp)
                                    .padding(top = 28.dp,bottom = 32.dp),
                                horizontalArrangement = Arrangement.SpaceAround

                            ) {
                                Text(
                                    text = "S",
                                    color = Color.Black,
                                    fontWeight = FontWeight.W400,
                                    fontSize = 24.sp
                                )
                                Text(
                                    text = "M",
                                    color = Color.Black,
                                    fontWeight = FontWeight.W400,
                                    fontSize = 24.sp
                                )
                                Text(
                                    text = "L",
                                    color = Color.Black,
                                    fontWeight = FontWeight.W400,
                                    fontSize = 24.sp
                                )
                            }
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

                        item{
                            LazyRow (
                                horizontalArrangement = Arrangement.spacedBy(48.dp),
                                contentPadding = PaddingValues(24.dp)
                            ){
                                items(toppingList.size){
                                    Box(
                                        modifier = Modifier
                                    ) {
                                        Image(
                                            painter = painterResource(toppingList[it]),
                                            contentDescription = "pizza plate",
                                            modifier = Modifier.size(48.dp)
                                        )
                                    }
                                }
                            }
                        }
                        item{
                            Button(
                                onClick = {},
                                colors = ButtonColors(
                                    containerColor = Color(0xFF423331),
                                    contentColor = Color.White,
                                    disabledContainerColor = Color(0xFF423331),
                                    disabledContentColor = Color.White,
                                ),
                                shape = RoundedCornerShape(12.dp),
                                modifier = Modifier.padding(16.dp)
                            ) {
                                Row (modifier = Modifier.padding(horizontal = 24.dp, vertical = 8.dp),){
                                    Icon(
                                        painter = painterResource(R.drawable.cart_shopping),
                                        contentDescription = "cart",
                                    )
                                    Spacer(modifier = Modifier.width(16.dp))

                                    Text(
                                        text = "Add to cart",
                                        color = Color.White,
                                        fontWeight = FontWeight.W700,
                                        fontSize = 16.sp
                                    )
                                }
                            }
                        }





                    }

                }
            }
        }
    }


}