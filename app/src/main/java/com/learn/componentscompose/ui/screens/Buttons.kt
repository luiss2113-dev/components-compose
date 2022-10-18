package com.learn.componentscompose.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.learn.componentscompose.ui.components.*

@ExperimentalMaterialApi
@Composable
fun ButtonsScreen(goBack: () -> Unit) {
    Scaffold(topBar = {
        AppBarCustom(goBack)
    }) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxWidth()
                .padding(top = 50.dp, end = 10.dp, start = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            TitleScreens(
                "Componentes de botones",
                Modifier.fillMaxWidth()
            )
            ButtonWithElevation()
            ButtonWithBorder()
            ButtonWithCutCornerShape()
            ButtonWithRoundCornerShape()
            ButtonWithRectangleShape()
            ButtonWithIcon()
            ButtonWithColor()
        }
    }
}