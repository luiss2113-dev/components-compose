package com.learn.componentscompose.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import com.learn.componentscompose.R

@Composable
fun AppBarCustom(
    goBack: () -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(dimensionResource(id = R.dimen.height_top_bar))
    ) {
        Row() {
            IconButton(onClick = goBack) {
                Icon(
                    imageVector = Icons.Outlined.ArrowBack, contentDescription = "Ir atrás",
                    modifier = Modifier.size(30.dp),
                    tint = Color.DarkGray
                )
            }

        }
    }
}