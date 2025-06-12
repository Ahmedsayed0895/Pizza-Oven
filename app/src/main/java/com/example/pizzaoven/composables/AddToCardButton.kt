package com.example.pizzaoven.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pizzaoven.R


@Composable
 fun AddToCardButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    buttonColor: Color,
    contentColor: Color,
) {
    Button(
        onClick = onClick,
        colors = ButtonColors(
            containerColor = buttonColor,
            contentColor = contentColor,
            disabledContainerColor = buttonColor,
            disabledContentColor = contentColor,
        ),
        shape = RoundedCornerShape(12.dp),
        modifier = modifier.padding(16.dp)
    ) {
        Row(modifier = Modifier.padding(horizontal = 24.dp, vertical = 8.dp)) {
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