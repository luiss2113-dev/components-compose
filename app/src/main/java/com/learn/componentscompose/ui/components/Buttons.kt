package com.learn.componentscompose.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import com.learn.componentscompose.R

@Composable
fun ButtonWithElevation() {
    Button(
        modifier = Modifier.height(dimensionResource(id = R.dimen.button_height)),
        onClick = {
            //your onclick code here
        }, elevation = ButtonDefaults.elevation(
            defaultElevation = 10.dp,
            pressedElevation = 15.dp,
            disabledElevation = 0.dp
        )
    ) {
        Text(text = "Button with elevation")
    }

}

@Composable
fun ButtonWithBorder() {
    Button(
        onClick = {
            //your onclick code
        },
        border = BorderStroke(1.dp, Color.Red),
        modifier = Modifier.height(dimensionResource(id = R.dimen.button_height)),
        colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red)
    ) {
        Text(text = "Button Border", color = Color.DarkGray)
    }
}

@Composable
fun ButtonWithCutCornerShape() {
    Button(
        onClick = {}, shape = CutCornerShape(10),
        modifier = Modifier.height(dimensionResource(id = R.dimen.button_height))
    ) {
        Text(text = "Cut corner shape")
    }
}

@Composable
fun ButtonWithRoundCornerShape() {
    Button(
        onClick = {}, shape = RoundedCornerShape(20.dp),
        modifier = Modifier.height(dimensionResource(id = R.dimen.button_height))
    ) {
        Text(text = "Botón con bordes redondeados")
    }
}

@Composable
fun ButtonWithRectangleShape() {
    Button(
        onClick = {}, shape = RectangleShape,
        modifier = Modifier.height(dimensionResource(id = R.dimen.button_height)),
    ) {
        Text(text = "Rectangle shape")
    }
}

@Composable
fun ButtonWithIcon() {
    Button(
        onClick = {},
        modifier = Modifier.height(dimensionResource(id = R.dimen.button_height))
    ) {
        Image(
            Icons.Default.ShoppingCart,
            contentDescription = "Cart button icon",
            modifier = Modifier.size(20.dp)
        )

        Text(text = "Botón con ícono", Modifier.padding(start = 10.dp))
    }
}

@Composable
fun ButtonWithColor() {
    Button(
        modifier = Modifier.height(dimensionResource(id = R.dimen.button_height)),
        onClick = {},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray)
    )

    {
        Text(text = "Botón background customizable", color = Color.White)
    }
}